# Overview
The errors with python to java translation are inherently different from the errors found within java to python translation. 

Within Python to Java program translation, we have identified 1 significant family of errors that can be solved with a potential post-processing solution.

**Added Constraints**
When translating Python files that contain conditional statements (in the form of if statements), the translated Java function may contain a translated if condition that shows extra constraints not found in the original file.

As these added constraints may disturb the code's functionality, we must remove that constraint from the translated file. By identifying the conditional statements in the Python file, and then their translations in the Java file, we can easily identify where an added constraint has occurred, and remove it. 
