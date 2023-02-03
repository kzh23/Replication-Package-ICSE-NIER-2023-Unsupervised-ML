# JAVA TO PYTHON TRANSLATION
As indicated in the paper, there are a few classifications of errors that we will discuss and have multiple folders for. 

Within Java to Python program translation, we find two main categories of errors that can be remedied with pre-processing techniques:
1) Loop Conversion
2) Type Sensitivity

**Loop Conversion**
Test cases that require a loop conversion fix contain a "complex" for loop, which we define to be a for loop that satisfies any of the following conditions:
1) Has non-linear incrementations of variables
2) Has multiple stopping conditions
3) Has miltiple variables in the stopping condition

Test cases that contain these types of iterations tend to produce incomprehensible translations. To fix this, we apply a standardized method of translating the for loop into a while loop. The method is as follows:
1) Identify 3 components in the original for loop: initialization, change, end codition
2) Move the initialization to immediately above the loop declaration.
3) Move the change to the very end of the iteration.
4) Change "for" to "while"

Note: If there are any "continue;" lines in the iteration, you must copy the "change" before that line as well.

**Type Sensitivity**
Java files tend to be sensitive in the type of arguments that methods receive. We have found that when taking in an array parameter, it is useful to instead rewrite the method as if you were taking in an ArrayList.

This will maintain the overall meaning of the code, but the Java ArrayList variable will better translate to the Python "list" variable. Not performing this change tends to produce incomprehensible junk in the translation.
