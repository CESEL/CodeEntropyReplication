#!/usr/bin/python
# -*- coding: utf-8 -*-
"""
Created on Sat Feb 20 18:18:14 2016

@author: MusfiqurRahman
"""

"""
for running the script the following python libraries are required.

os, codecs, commands, math

Before running the script make sure MITLM is properly installed.

https://code.google.com/archive/p/mitlm/

Follow these steps:

git clone 
https://github.com/orezpraw/MIT-Language-Modeling-Toolkit.git mitlm 
cd mitlm 
sudo ./autogen.sh 
sudo make 
sudo make install 
sudo ldconfig
"""


import os, codecs, commands, math

def extract_perplexity(command_output):
    finalString = command_output.replace('\x1b[', '')
    finalString =  finalString.replace('0;36m', '')
    finalString = finalString.split("9.dat\t")[1].split('m')[0]
    return "".join(finalString.split())


def pass_command(command):
    return extract_perplexity(commands.getstatusoutput(command)[1])

def evaluateNgram():
    for order in range (1, 11):
        logFile = str(order) + "-gram" + "-eval.log"
        os.system("cp /dev/null " + logFile)
        MYFILE = codecs.open(logFile, 'a', encoding='utf-8')
        avgCSforAll = 0.0
        for dataSet in range (1, 11):
            sumPerplexity = 0.0
            sumCrossEntropy = 0.0
            for trainModel in range (1, 9):
                dest = str(order) + "-gram" + "/" + "DS" + str(dataSet)
                lmFile = str(dest) + "/" + str(trainModel) + "_" + str(order) + ".lm"
                dataFile = dest + "/" + "9.dat"
                perplexity =   float(pass_command("evaluate-ngram -order " + str(order) + " -lm " + lmFile + " -eval-perp " + dataFile))
                #sumPerplexity = sumPerplexity + perplexity
                sumPerplexity = sumPerplexity + float(perplexity)
                if perplexity > 0:
                    crossEntropy = math.log(perplexity)/math.log(2)
                sumCrossEntropy = sumCrossEntropy + crossEntropy
                print(dest + "\t" + lmFile + "\t" + dataFile + "\t" + str(perplexity) + "\t" + str(crossEntropy) + "\n")
                MYFILE.write(dest + "\t" + lmFile + "\t" + dataFile + "\t" + str(perplexity) + "\t" + str(crossEntropy) + "\n")
            avgPerplexity = sumPerplexity/9
            avgCrossEntropy = sumCrossEntropy/9
            print (dest + "\t" + lmFile + "\t" + dataFile + "  " + str(avgPerplexity) + "  " + str(avgCrossEntropy) + "(Average)\n\n")
            MYFILE.write (dest + "\t" + lmFile + "\t" + dataFile + "  " + str(avgPerplexity) + "  " + str(avgCrossEntropy) + "(Average)\n\n")
            avgCSforAll = avgCSforAll + avgCrossEntropy
        avgCSforAll = avgCSforAll/10
        print ("\n\n Average Cross Entropy for " + str(order) + "-gram is : " + str(avgCSforAll))
        MYFILE.write("\n\n Average Cross Entropy for " + str(order) + "-gram is : " + str(avgCSforAll))
        #MYFILE.close()
                
def estimateNgram():
    for order in range(1, 11):
        for dataSet in range(1, 11):
            for trainModel in range(0, 9):
                dest = str(order) + "-gram" + "/" + "DS" + str(dataSet)
                textFile = str(dest) + "/" + str(trainModel) + ".dat"
                outputFile = str(dest) + "/" + str(trainModel) + "_" + str(order) + ".lm" 
                print(dest + "  " + textFile + "    " + outputFile)
                
                os.system("estimate-ngram -order " + str(order) + " -text " + str(textFile) + " -write-lm " + str(outputFile))
if __name__ == '__main__':
    estimateNgram()
    evaluateNgram()
