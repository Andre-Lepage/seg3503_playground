# Lab 7

| Outline  | value|
| ------------- | ------------- |
| Course  | SEG3503  |
| Professor  | Mohamed Ibrahim |
| TA  | Joseph Abonasara |
| Name  | Andre Lepage |
| student number  | 300215137 |

## Running calculator <br>
I used 
```javac -encoding UTF-8 --source-path src -d dist src/*.java``` to compile the code and ```java -cp ./dist Main``` to run it
![running-calculator](assets7/running-calculator.png "running-calculator")

## Running spotbug <br>
I used ```java -jar ./lib/spotbugs/lib/spotbugs.jar``` to run spotbug
![spotbugs-start](assets7/spotbugs-start.png "spotbugs-start")
<br>
This is the list of bugs that comes up when using spotbug: <br>

![bug-list](assets7/bug-list.png "bug-list")

## Bugs

### Bug 1: Comparison of String parameter using == or != <br>
![bug-1](assets7/bug-1.png "bug-1")

Here is my fix for bug 1: <br>
![bug-1-fix](assets7/bug-1-fix.png "bug-1-fix")

### Bug 2: Certain swing methods needs to be invoked in Swing thread

![bug-2](assets7/bug-2.png "bug-2")

<u>Explanation</u>: This bug is caused because the swing method setVisible() is called in the Main thread. This method should be called in a swing thread. Because it is called in the main thread, it can communicate to ther threads before everything is ready and loaded. This can cause deadlocks and other problems related to threads.

### Bug 3: Could be refactored into a named static inner class

![bug-3](assets7/bug-3.png "bug-3")

<u>How to fix</u>: To fix this bug, I would create a named static inner class called "ClosingWIndow" that extends WindowAdapter and I would reference this new class using CalFrame.ClosingWindow.


### Bug 4: Boxing/unboxing to parse a primitive
![bug-4](assets7/bug-4.png "bug-4")

Here is my fix for bug 4: <br>
![bug-4-fix](assets7/bug-4-fix.png "bug-4-fix")

### Bug 5: Boxing/unboxing to parse a primitive
![bug-5](assets7/bug-5.png "bug-5")

Here is my fix for bug 5: <br>
![bug-5-fix](assets7/bug-5-fix.png "bug-5-fix")

### Bugs 6-11: Unread field: should this field be static?
![bug-6-11](assets7/bug-6-11.png "bug-6-11")

Here is my fix for bugs 6-11: <br>
![bug-6-11-fix](assets7/bug-6-11-fix.png "bug-6-11-fix")

### Bug 12: Method uses the same code for two branches
![bug-12](assets7/bug-12.png "bug-12")

Here is my fix for bug 12: <br>
![bug-12-fix](assets7/bug-12-fix.png "bug-12-fix")

I just removed the else statement that gave the same result as the if and else if's


### Bug 13: Switch statement found where default case is missing
![bug-13](assets7/bug-13.png "bug-13")

Here is my fix for bug 13: <br>
![bug-13-fix](assets7/bug-13-fix.png "bug-13-fix")

I just added a default statement. Nothing will happen by default.

### Bugs 14-16: Condition has no effect

![bug-14-16](assets7/bug-14-16.png "bug-14-16")

Here is my fix for bugs 14-16: <br>
![bug-14-16-fix](assets7/bug-14-16-fix.png "bug-14-16-fix")

### Bug 17: Condition has no effect

![bug-17](assets7/bug-17.png "bug-17")

Here is my fix for bug 17: <br>
![bug-17-fix](assets7/bug-17-fix.png "bug-17-fix")

I replaced the else if with else.

### Special Note: There were extra examples of bugs 4 and 5 that showed up when I redid the analysis so I fixed them as well. I used the same fix as I did for bugs 4 and 5.

## Results

![results](assets7/Results.png "results")

As we can see, there are two bugs remaining because I chose to explain one and to describe how I would fix one. All the other bugs were fixed by my code changes.

