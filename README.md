## Replication package

### RQ1, Replication: how repetitive and predictable is software? 

1. [List of projects]() 
2. [Frequency distribution]() for each language, n-gram with n = 1 to 10
3. [Code]() to calculate cross-entropy

### RQ2, Artificial Repetition: how repetitive and predictable is code once we remove language specific tokens?

1. [Frequency distribution]() for each language without separators, operators, keywords, all language specific 
2. [List]() of separators, operators, keywords for each language.
3. [Code]() to calculate entropy


### RQ3, API Usages: how repetitive and predictable are calls to the Java API?

1. [Frequency distribution]() for each language with only Java API elements, n-grams with n = 1 to 10
2. [List]() of Java API elements considered
3. [Code]() to calculate entropy

### RQ4, Code Graphs: how repetitive and predictable are graph representations of Java code? 

1. [List of tokens]() to ensure that n-grams and graphs contain the same set of elements (ie control flow, Java API).
2. [Frequency distribution]() of Java graphs with nodes n = 2 to 4
3. [Frequency distribution]() of Java tokens that are included in graphs with n-grams with n = 2 to 4
4. [Frquency distribution]() of graphs with nodes = 2 to 4
5. [Graph database]() is available, but tools to extract graphs must be be obtained from [Dr. Tien Nguyen](http://www.utdallas.edu/~tien.n.nguyen/index.html)
5. [Code]() to calculate occurence frequency for graphs
