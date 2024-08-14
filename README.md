# Markov-Model-NLP-Project

### SUMMARY

In this project, I was tasked with implemented a stack and a queue ADT and programming them to work in the usual way that stacks and Queues do. Afterwords, I used these classes to implement a Markov model, which takes in a .txt file and outputs a unique spin on the contents of the file. The K-value can be adjusted, with a higher k-value essentially leading to the model 'copying' more from  the original text; i.e lower k values = more randomization. TextLength can also be adjusted to choose how long you would like the output text to be, in characters. 

### EXAMPLE USE CASES

Please see "EXAMPLE USE CASES.pdf", as this is a very clear and easy way to see exactly what the model is capable of doing. 


### REPOSITORY OVERVIEW

to find the code , go to "P08 Text Generator" -> "src"

All files have detailed in-line comments
All methods have detailed method headers

Please note that some of the programming files were created purely to meet my projects requirements in my course;  I am aware that there were easier ways to implement the Markov Model. Some of the classes were done to practice implementing some of java's built-in functions from scratch, and for my own learning experience. 


MarkovModel.java: 
- primary class where the Markov model was implemented

MarkovTextGenerator.java: 
- the class used to generate text using the markov model
- if you woul like to test this model out for yourselves, this is the file to use. Simply change the file path to your desired file name and adjust the K-value and textLength within the code

MarkovTester.java:
- Tester class that ensures the model works correctly and passes edge-cases

The rest of the files are nothing interesting and were done for the purpous of my own learning, though they are nececary to download for my markov model to work. 
