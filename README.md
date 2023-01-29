# Replication Package ICSE'23 NIER
## Introduction
This is the replication package for the paper **On ML-Based Program Translation: Perils and Promises**, accepted to ICSE'23 NIER. It includes all of the files we tested, the fixes we made, and the results following each. 

The paper was authored by the following: 
- Aniketh Malyala: aniketh.malyala@gmail.com (Silver Creek High School)
- Katelyn Zhou: zhoukatelyn@gmail.com (Silver Creek High School)
- Baishakhi Ray: rayb@cs.columbia.edu (Columbia University in the City of New York)
- Saikat Chakraborty: saikatc@microsoft.edu (Microsoft Research)
## Organization
In the file *HOWTOREPLICATE.md*, we detail how and what to replicate in terms of our results. We used the **Facebook Research TransCoder** model in order to obtain our results. 

The folder *java2python* includes every single file we ran through the model to translate from Java to Python and the manual fixes we made along with the translation results for everything. 

The folder *python2java* includes the same as above just from opposing languages. 

## Sampling Methods
The data we used comes directly from the data that the TransCoder model was trained upon. The files were originally from Geeks4Geeks. We took a random sample of 50 files from both the Java training data and Python training data for a total of 100 files altogether. 

Here is the link to the Java Training Data: https://github.com/facebookresearch/TransCoder/tree/main/data/evaluation/geeks_for_geeks_successful_test_scripts/java

Here is the link to the Python Training Data: 
https://github.com/facebookresearch/TransCoder/tree/main/data/evaluation/geeks_for_geeks_successful_test_scripts/python
