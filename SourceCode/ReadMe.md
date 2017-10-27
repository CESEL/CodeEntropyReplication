  First split the data into 10 equal portions for 10-fold cross-validation using Splitter/FileSplitter.java
  
  Then run estimate_evaluate_Ngram.py
  
  The output of the file will be the average cross-entropy from 1-gram to 10-gram over 10-fold cross-validation.
  
  For running the estimate_evaluate_Ngram.py script, following python libraries are required.
  
  os, codecs, commands, math
  
  Before running the script make sure [MITLM](https://code.google.com/archive/p/mitlm/) is properly installed. 
  
  Follow these steps:
  git clone https://github.com/orezpraw/MIT-Language-Modeling-Toolkit.git mitlm 
  cd mitlm 
  sudo ./autogen.sh 
  sudo make 
  sudo make install 
  sudo ldconfig
