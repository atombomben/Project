# cph-1st-w39
Exercises for week 39

Alle opgaverne kan løses ud fra den viden I har tilegnet jer fra bogen. 


Opgaverne er struktureret således at de følger kapitlerne i bogen. 

Såfremt I sidder fast ved en opgave, så tag en kort pause og prøv igen. Hvis I stadig sidder fast ved den, så hop videre til den næste.
Generelt er det bedre at I får tænkt over alle opgaverne, end at I får løst dem allesammen fuldkommen. 
Endvidere er I meget velkommen til at tale sammen om opgaverne, men det forventes at I alle koder hver jeres løsning. 


Opgaverne skal ligesom sidste uge, afleveres på moodle, via et link til jeres github repo. 


## Task 1 (Algorithms):
1.a Create an integer array with the values { 8, 9, 1, 5, 11, 13, 7, 4, 6, 3, 12, 10, 2 }
1.b implement your own sorting algorithm for the int[] array, by creating a method that takes in the int[] array and loops through it with a for loop. 
    for every step in the for loop, you must compare the values of array[i] and array[i + 1] and swap them if [i] is greater than [i + 1]. 
1.c call the method created in 1.b in a while loop from setup(), until the list is sorted. 
1.d Add a boolean to keep track of when the list is sorted to avoid creating an infinite loop. 

## Task 2 (Debugging):
In the directory above named "Debugging", there are 10 different small sketches, each of which containing some kind of error. For each of the sketches, try to run it firstly, then have a look at the output and afterwards fix the error. You're done with the sketch, once it prints "Job's done". 


## Task 3 (Libraries)
3.a Sort the array:      
    int[] myArray = { 1, 6423, 64, 6, 3, 123, 61, 6, 36, 1236, 347, 3, 1326, 246, 4 };
by importing java.util.Arrays and use the Arrays.sort() method on it. Then use the printArray() method to print it. 


## Task 4 (Mathematics):
4.a Write a method that takes in an integer as a parameter and prints all values between 0 and 100 that are divisible by the parameter received. 

4.b add the following array to your code: int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }

4.c Write a method that returns a random element from the above array.

4.d Write a function that takes an integer as a parameter and prints the number. After that, it subtracts one from the input and calls itself again (recursion). If the input is less than zero, it should no longer call itself. 

4.e Write a function that takes two integers as parameters and prints both of them seperated by a tab ( \\t ). Then have the function calculate and print the fibunacci sequence by calling itself. If the input is greater than 10000, then stop. Start the function by calling it from setup with the input (1, 1).
(hint: fibunacci sequence: https://i.pinimg.com/236x/98/82/d5/9882d569f7e0b5665fe3b2edd5069b06.jpg )

## Task 5: Draw a chess board using a nested for loop and a double int array. 
In this task you will create an integer array with 2 dimensions, that holds values of 0, 1, 0, 1, etc. The instructions below will help you get started. What has been left out, is how to assign the alternating value of 0's and 1's. 

5.a Create a double int called board[][] with the length of 8 in both arrays. 
5.b In setup() set the size to 350, 350
5.c In setup() create a double for loop that loops through the board and alternates between assigning the value of 0 and 1 (e.g. board[x][y] = 0;). 
5.d In draw() create a double for loop that loops through the board and draws a rect for each element with the sideLength of 40 (e.g. rect(x * sideLength, y * sideLength, sideLength, sideLength); )
5.e Before drawing the rect in the previous step, add a fill() statement, that fills with the value of 0 if the board[x][y] == 0. 


# Other exercises (optional)
If you got stuck or if you finished the above, following are 3 links to exercises, where there is something for all levels.

https://codingbat.com/java 

https://www.codecademy.com/catalog/language/java 
 
https://www.hackerrank.com/domains/java 

https://edabit.com/ 

https://www.programiz.com/java-programming 
