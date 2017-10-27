EntropyOfDistribution.py calculates the Shannon Entropy of a given distribution.

It takes as commandline argument the location of the folder in which the file is placed. For our experiment we put all n-gram distributions in one folder 'ngrams'.

Then by running this script will give the Shannon Entropy for each n-gram

Example:
if ngrams folder contains three data files: 1-gram.csv 2-gram.csv and 3-gram.csv, running

python EntropyOfDistribution.py ngrams

will generate the Shannon Entropy for each data file.

Data file should be formatted like this:

| 3-grams   | Count | Relative Frequency |
| ------------- | ------------- | ------------- |
| a,b,c  | 1236  | 86
| b,c,d  | 135  | 7
