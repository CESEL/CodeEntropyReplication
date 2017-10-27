class Statistics(object):
    
    def __init__(self, data):
        self.data = data
        
            
    def CalculateEntropy(self):
        entropy = 0.0
        for dataPoint in self.data:
            entropy = entropy + (dataPoint * math.log(dataPoint, 2))
    
        entropy = -entropy
        print(stats.entropy(self.data, base = 2))
        return entropy
    
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
