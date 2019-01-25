EntropyOfDistribution.py calculates the Shannon Entropy of a given distribution.

It takes as commandline argument the location of the folder in which the file is placed. For our experiment we put all n-gram distributions in one folder 'ngrams'.

Then by running this script will give the Shannon Entropy for each n-gram

Example:
if ngrams folder contains three data files: 1-gram.csv 2-gram.csv and 3-gram.csv, running

python EntropyOfDistribution.py ngrams

will generate the Shannon Entropy for each data file.

Data file should be formatted as one of the following formats:

- Format 1: Keep the n-grams and their corresponding counts and relative frequencies. We keep first column for the manual observation and it is not requered for calculation of Shannon Entropy.

| 3-grams   | Count | Relative Frequency |
| ------------- | ------------- | ------------- |
| a,b,c  | 1236  | 86
| b,c,d  | 135  | 7

- Format 2: Remove the first column and keep the same order for Count and Relative Frequencey.

| Count | Relative Frequency |
| ------------- | ------------- |
| 1236  | 86
| 135  | 7

- Format 3: Just keep the Count column. The script will calculate the relative frequencies.

| Count |
| ------------- |
| 1236
| 135
