# -*- coding: utf-8 -*-
"""
Created on Tue Apr 25 14:45:23 2017

@author: MusfiqurRahman
"""

import pandas as pd
import math, os, sys
from scipy import stats



class Statistics(object):
    
    def __init__(self, data):
        self.data = data
        
            
    def CalculateEntropy(self):
        
        return stats.entropy(self.data, base = 2)
    
    def GetRelativeFrequency(self):
        relativeFreq = []
        #print(self.data)
        sumOfData = sum(self.data)
        for dataPoint in self.data:
            value = float(dataPoint)/float(sumOfData)
            relativeFreq.append(value)        
        return relativeFreq
    def __del__(self):
        pass



class ExploreDataFiles(Statistics):
    
    fileCount = 0
    fileList = []
    entropyDict = {}
    def __init__(self, location):
        self.location = location
        self.fileList = [os.path.join(location, files) for files in os.listdir(location)]
        self.fileList = sorted(self.fileList)
        print(self.fileList)
        self.fileCount = len(self.fileList)
        
    def Read_Data(self, FILE):
        print(FILE)
        dataFrame = pd.read_csv(FILE, sep = '\t', header = None)
        if len(dataFrame.columns) == 1:
            dataFrame.columns = ['count']
            super(ExploreDataFiles, self).__init__( dataFrame['count'].tolist())
            dataFrame['percentage'] = pd.Series(super(ExploreDataFiles, self).GetRelativeFrequency())
            super(ExploreDataFiles, self).__init__( dataFrame['percentage'].tolist())
        elif len(dataFrame.columns) == 2:
            dataFrame.columns = ['ngram','count']
            super(ExploreDataFiles, self).__init__( dataFrame['count'].tolist())
            dataFrame['percentage'] = pd.Series(super(ExploreDataFiles, self).GetRelativeFrequency())
            super(ExploreDataFiles, self).__init__( dataFrame['percentage'].tolist()) 
        else:
            dataFrame.columns = ['ngram','count', 'percentage']
            super(ExploreDataFiles, self).__init__( dataFrame['count'].tolist())
            dataFrame['percentage'] = pd.Series(super(ExploreDataFiles, self).GetRelativeFrequency())
            super(ExploreDataFiles, self).__init__( dataFrame['percentage'].tolist())
        
    def __del__(self):
        print("Destroying Object!")


if __name__ == '__main__':
    
    explore_data_files = ExploreDataFiles(sys.argv[1])
    
    for fileName in explore_data_files.fileList:
        explore_data_files.Read_Data(fileName)
        explore_data_files.entropyDict[fileName.split("/ngrams/")[1]] = explore_data_files.CalculateEntropy()
    
    sortedDataFrame = pd.DataFrame(explore_data_files.entropyDict.items(), columns = ['ngram', 'entropy']).sort_values(by = ['ngram'], ascending=[True])
    
    print(sortedDataFrame)
    
    with open(sys.argv[2], 'a') as f:
        sortedDataFrame.to_csv(f, sep = "\t", index=False, header = True)    
    
    
    del explore_data_files
