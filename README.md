## Replication package

### RQ1, Replication: how repetitive and predictable is software? 

1. [Projects for each language](https://www.dropbox.com/sh/yx6ewwwh8ajjbd8/AAA-q-SpbbYTx4aOSTpA3dRBa?dl=0) 
2. [Frequency distribution](https://www.dropbox.com/sh/yx6ewwwh8ajjbd8/AAA-q-SpbbYTx4aOSTpA3dRBa?dl=0) for each language, n-gram with n = 1 to 10
3. [Code](https://github.com/CESEL/CodeEntropyReplication/tree/master/SourceCode/MeasureCrossEntropy) to calculate cross-entropy. If you do not want to calculate the cross-entropy values yourself, please follow this [link](https://docs.google.com/spreadsheets/d/1FslnqTycWUx3UZIKGnGubJF0DtlCvQng8YeD64ESgQI/edit?usp=sharing) to get the values calculated by us.

### RQ2, Artificial Repetition: how repetitive and predictable is code once we remove language specific tokens?

1. [Frequency distribution](https://www.dropbox.com/sh/yx6ewwwh8ajjbd8/AAA-q-SpbbYTx4aOSTpA3dRBa?dl=0) for each language without separators, operators, keywords, all language specific 
2. [List](https://drive.google.com/drive/folders/14H2hJcp3WE4SmoYtw6D7Q0APHwT8pW9c?usp=sharing) of separators, operators, keywords for each language.
3. [Code](https://github.com/CESEL/CodeEntropyReplication/tree/master/SourceCode/MeasureEntropy) to calculate entropy


### RQ3, API Usages: how repetitive and predictable are calls to the Java API?

1. [Frequency distribution](https://www.dropbox.com/sh/yx6ewwwh8ajjbd8/AAA-q-SpbbYTx4aOSTpA3dRBa?dl=0) for each language with only Java API elements, n-grams with n = 1 to 10
2. [List](https://docs.google.com/spreadsheets/d/1CBeAgu95LNqovUkeVwB1rxFQZ3TnjHqdJCgyi1bcygs/edit?usp=sharing) of Java API elements considered
3. [Code](https://github.com/CESEL/CodeEntropyReplication/tree/master/SourceCode/MeasureEntropy) to calculate entropy

### RQ4, Code Graphs: how repetitive and predictable are graph representations of Java code? 

1. [List of tokens](https://docs.google.com/spreadsheets/d/1qSUTtuyhcr2QjX53S0VUVuVDjMACcWowtuQsGuudQ4s/edit?usp=sharing) to ensure that n-grams and graphs contain the same set of elements (ie control flow, Java API).
2. [Frequency distribution](https://drive.google.com/open?id=13Ieg4plSmCIKrte8YEXGIJlWq3F59vct) of Java graphs with nodes n = 2 to 4
3. [Frequency distribution](https://drive.google.com/open?id=13Ieg4plSmCIKrte8YEXGIJlWq3F59vct) of Java tokens that are included in graphs with n-grams with n = 2 to 4
4. [Graph database](https://www.dropbox.com/sh/ma9gd8mf1x4pw6x/AAAZ2DuDR7GF77fyIuSiPR8Na?dl=0) is available, but tools to extract graphs must be be obtained from [Dr. Tien Nguyen](http://www.utdallas.edu/~tien.n.nguyen/index.html)
5. [Code](https://github.com/CESEL/CodeEntropyReplication/tree/master/JavaEntropy) to calculate occurence frequency for graphs
