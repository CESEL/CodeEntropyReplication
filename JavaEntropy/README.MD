1. Checkout the three projects in the same directory.
2. Import the projects into eclipse using the import project wizard and select existing project.
3. The GroumEntropy project build path needs to be set by adding the other two projects as dependencies.
4. The main java class (MeasureCodeGraphDistribution) is present in the GroumEntropy project in the package "edu.concordia.entropy.graphs"


The following changes are neccessary in the MeasureCodeGraphDistribution Java class to obtain the distribution of the graphs for a given project or a corpus of projects.

1. Unzip the [java projects](https://github.com/CESEL/CodeEntropy/blob/master/replication_package/java_projects_graph_distribution_frequency.tar.gz) file into a directory. This directory path will be set as the value to the constant variable "PROJECTS_BASEDIR".
2. Set the GRAPHDB_FILE to the name of the desired output graphDB file.
3. Set GRAPH_SIZE variable to a value between 2 to 4. This determines the graph size used for obtaining the frequency distribution.
4. Set the GRAPHDB_DIR variable to the directory where the GRAPHDB_FILE will be created.
5. Set the FREQUENCY_CSV variable to the file name where the frequency distribution will be generated. The frequency distribution file will be generated in the PROJECTS_BASEDIR directory.

There are 16 Java projects in total and they are added to a local List<String> variable from line number 133-150. If you have a computing system with lot of memory (32GB or more), one could uncomment the lines and process all the projects at once. However it is recommended to run one project at a time as we have observed that running all projects in one go has failed with out of memory error quite frequently. For two node distribution running all projects in one go did worked, however for higher nodes, it is recommended to work project by project.

The code will create a new GRAPHDB_FILE when invoked with first project and will subsequently update the same graphDB with similar graphs and increment their occurrence frequencies. This way we can obtain the overall frequency distribution of code graphs for vast number of projects.


