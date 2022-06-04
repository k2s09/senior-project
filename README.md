# senior-project
Repository for my CS Project as a senior in high school.

# Details
Java programs with good logic, comments and algorithms related to 11th and 12th ISC CS Syllabus.

# License
MIT License

Copyright (c) 2022 Kavin Sood

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

# Format
1. Front Page
2. Acknowledgement
3. Algorithms
4. Code with Comments
5. Outputs

# Topics
1. If Else
2. Loops
3. Menu Driven
4. Functions
5. Constructors
6. Arrays - 1D, 2D
7. Strings
8. String Tokenizer
9. Object Passing
10. Files
11. Errors and Exceptions
12. Recursion
13. Inheritance
14. LinkedList
15. Stack
16. Queue

# Index
1) achillesNumber
2) adder
3) arrayTools
4) arrShiftSortMerge
5) binaryDecimalShenanigans
6) blinsMaker
7) boundarySort
8) camelConc
9) chess
10) circularQueue
11) concentricCircles
12) dateCalculator
13) disariumNumber
14) eulerFunction
15) fascinatingNumber
16) goldbachNumber
17) isogramSentence
18) keyboardAnalyser
19) luckyNumbers
20) potential
21) recursiveSortSearch
22) reverseEncryption
23) reversingLinkedList
24) sentencePalindromeGenerator
25) ticTacToe
26) towerOfHanoi
27) typingTest
28) verticalBanners
29) wordleStartChecker
30) wordShift

# Algorithms
## 1) achillesNumber
**Topics:** Functions, Loops, LinkedList
**Algorithm:** 
1) Start Algorithm
2) Input number to check
3) Check if number if powerful and perfect in two boolean functions returning true or false values in the main method and print if the number is a achilles number or not
4) In function isPerfect, run a for loop from 2 till less than the number and have a nested for loop inside running from j = 2 till less than num. Check if i raised to j is equal to num. If true, return true, else return false. Using this method, check every possibility of two numbers less than the original number that when the second is raised to the first, it gives the original number.
5) In function isPowerful, declare an integer Linked list lk. Find all unique prime factors of n using the following method:
	(a) Check if the number is divisible by 2. If true, add 2 to the linked list. Now keep dividing 2 from n while the number is even. After this, the number will be odd.
	(b) Run a for loop from i = 3 till square root of n and increment by 2. Check if n is divisible by i. If true, add i to the linked list and keep dividing it from n till i is no longer a factor of n.
6) Now the linked list contains every unique prime factor of n. Run a for loop from i = 0 till lk.size() and check if the square of every element is also a factor of the original number. If true, return true, else return false.
7) End algorithm

## 2) adder
**Topics:** Call by Reference, Functions, Constructors
**Algorithm:** 
1) Start algorithm
2) Make two 1d arrays and store hours in index [0] and minutes in index [1]
3) In function readtime, declare scanner object and take input for the calling object the values of minutes and hours and store in a[].
4) In function addtime, pass two objects X and Y. Using the calling object, add the values of hours and minutes. If sum of minutes is > 60 then add 1 to hours and take remainder of minutes in sum
5) In function disptime, print final hours and minutes of calling function.
6) End Algorithm

## 3) arrayTools
**Topics:** Functions, 2D Arrays
**Algorithm:** 
TBD

## 4) arrShiftSortMerge
**Topics:** Arrays, If Else, Loops
**Algorithm:** 
TBD

## 5) binaryDecimalShenanigans
**Topics:** Recursion, Functions, Strings
**Algorithm:** 
TBD

## 6) blinsMaker
**Topics:** If Else
**Algorithm:** 
1) Start algorithm
2) Initialise scanner object and declare variables to store eggs, milk, flour and minimum required to make one portion of blins (pancakes).
2) Calculate the amount of pancakes (blins) one can make using raw ingredients by first taking the available amounts of ingredients present with user.
3) Find number of portions possible by dividing given amount by least amount needed for 1 portion. If the user has less ingredients than what is required to make a single portion, print that they can not make a single portion and exit.
4) Calculate excess ingredients which will not be used for portions by subtracting given amount by (minimum * amount of least ingredient)
5) Print the number of blins / portions the user can make along with the amount of ingredients used and left.
6) End Algorithm.

## 7) boundarySort
**Topics:** 2D Array, Loops, Sorting
**Algorithm:** 
1) Start algorithm
2) Take input of number of rows and columns and then take input of the elements in the matrix by running a for loop from i = 0 till rows and nested for loop from j = 0 till columns.
3) Run a for loop from i = 0 till rows and nested for loop from j = 0 till columns and store boundary elements (row or column number is either 0 or length - 1) in a 1d array
4) Sort array using any sorting technique (swap selection sort used here). In selection sort, find the smallest of the row and assign it to a temp variable and swap the initial index with it. Next time, start from the next index and find and swap the next smallest value in the array. Do this till all passes are complete.
5) Run a for loop from i = 0 till rows and nested for loop from j = 0 till columns and put elements back in original matrix manually going clockwise.
6) End Algorithm

## 8) camelConc
**Topics:** If Else, Loops, Strings
**Algorithm:** 
1) Start algorithm
2) Take input for String sentence from user
3) Run a for loop from i = 0 till length and seperate the words from the sentence and store them in str[] - in the loop, if sentence[i] is a space, the previous characters form the word. Reset the word variable and move on to the next iteration. Store all words in str[].
4) Run a for loop from i = 0 till str.length and concatenate the words in a final string. Add the first index to the final string all in lowercase and add following words from array to final string by making first character of each word uppercase.
5) Print finalStr.
6) End Algorithm

## 9) chess
**Topics:** Menu Driven
**Algorithm:** 
1) Start algorithm
2) Take input for start and end indexes in the form of x and y coordinates for the cartesian plane like chess board.
3) After analysis of moves that can be made by various chess pieces, they can be described using the geometrical distance formula: pawn can move forward by 1, king can move by 1 in any direction, bishop can move in multiples of √2, rook can move in multiples of integers (1, 2, ...), knight can move in multiples of √5 and queen can move in a combination of the rook and bishop.
4) Find distance between two points on the matrix by doing ((y2 - y1)^2 + (x2 - x1)^2)^0.5
5) Check distances to find which pieces can move.
6) Print values.
7) End Algorithm

## 10) circularQueue
**Topics:** Queue, Functions
**Algorithm:** 
TBD

## 11) concentricCircles
**Topics:** Loops
**Algorithm:** 
1) Start algorithm
2) The 2d array will always be a square of radius 2n - 1 where n is input
3) Run two for loops covering every number in the 2d array. Find the larger difference -> row number - mid index or column number - mid index
4) Print the bigger number + 1 as the integer for that place in the matrix to complete the pattern
5) The distance formula is disected here into the vertical and horizontal component. The bigger value is used instead of adding the squares and taking the square root.
6) End Algorithm

## 12) dateCalculator
**Topics:** Arrays, Functions, Loops
**Algorithm:** 
1) Start Algorithm
2) Define an Array containing days number leaving blank(0th position) 
3) Define another Array containing Month names leaving blank(0th position)
4) Now Input Day Number, N number of days, Year from the user
5) In a variable store the sum of Day number and N number (for calculating date after n days)
6) Now check if the year entered is leap year or not
7) If it is leap year than increment the days number in the array from 2nd position by 1
8) Now check if the days entered are in the range or not
9) If the days are in the range than calculate the date (date can be calculated by subtracting the entered days number from the original days number)
10) If the days are not in the range than change the value of k to 1 and display days are out of range and Program will not execute further.
11) Now check if the 'N' number of days are in the range or not.
12) If it is in range than calculate date after 'N' days
13) If it is not in the range than change the value of k to 1 and display 'N days are out of range' and Program will not execute further.
14) If days and N days both are in the range than Display Date and Date after N days.
15) Another condition is If the year entered is not a Leap year
16) Than do not increment the value of days number in the array.
17) Print final values
18) End Algorithm

## 13) disariumNumber
**Topics:** Functions, Constructors, Object Passing
**Algorithm:** 
1) Start algorithm
2) Declare and initialise integer size to default value. Initialise num to the num entered in main method for parameterised constructor.
3) In function countDigit, calculate the length of the integer num.
4) In recursive function sumOfDigits, Add the digits raised to the power of its position (starting from 0) to a counter.
5) Starting from the right, do n % 10 to get the first digit and raise it to its position (number of digits in the number calculated by another function) 
6) Call the function recursively by dividing the integer by 10 (removing the last digit) and decreasing size of number by 1 each time till the size of number is 0
7) In function check, check if the num is equal to the sum of its digits and call the recursive function. Print true or false.
8) End Algorithm

## 14) eulerFunction
**Topics:** If Else, Loops
**Algorithm:** 
1) Start algorithm
2) Store first value of double e as 1 according to the formula.
3) Run a while loop with condition flag == false. If the required condition of e2 - e1 < 0.0000001 is true, make flag true.
4) In the while loop, increment count to store the number of iterations taken in the loop. Find the factorial of the count by running for loop from i = 2 till less than equal to count and multiplying in fact. Calculate successive values of e using e = 1/1! + 1/2! + 1/3! .. + 1/n! and store difference between current and previous e value in temp.
5) When condition is met, print the count.
6) End Algorithm.

## 15) fascinatingNumber
**Topics:** Loops, Functions, Strings
**Algorithm:** 
TBD

## 16) goldbachNumber
**Topics:** If Else, Loops, Functions
**Algorithm:** 
1) Start algorithm
2) Take number input and check if it is valid by checking if it is within range of 9 to 50, is odd and not negative.
3) Check if the number is an even integer and greater than 4, if true proceed.
4) Check if there are any pairs of two odd integers that add to form the number. Run a nested for loop from [3, num] incrementing by 2 and check if both the iterators (i and j) are prime and i is less than j.
5) In prime checking function, run a for loop from 2 till less than num. If num is divisible by i, increment flag. Check if flag is equal to 0, then the number is prime and return true, otherwise return false.
6) End Algorithm

## 17) isogramSentence
**Topics:** Strings, Arrays, Loops, If Else
**Algorithm:** 
1) Start algorithm
2) Take input the sentence and store in String sentence
3) Store length of sentence in int length
4) Run loop from i = 0 till length and seperate the words from the sentence and store them in str[] - in the loop, if sentence[i] is a space, the previous characters form the word. Reset the word variable and move on to the next iteration.
5) Check if the word is an isogram -> Run a for loop from i = 0 till str.length. Check if any character is repeated in the word by running two loops checking every possible comparison of characters in the string.
6) If any comparison of characters in the word is found to be true, increment the flag variable and break. Otherwise continue all iterations. In the end, check flag variable and print final result.
7) End Algorithm.

## 18) keyboardAnalyser
**Topics:** Functions, 2D Arrays, Strings
**Algorithm:** 
1) Start algorithm
2) Take input to be analysed
3) In functions findFingerQWERTY and findFingerDVORAK and findFingerCOLEMAK, take input for the character and return the number of the finger that would press that character.
4) In functions findDistanceQWERTY and findFingerDVORAK and findFingerCOLEMAK, * Find the distance to be travelled by each finger to press all keys of the input in succession. If the key is found in the home / middle row of the keyboard, the finger presses the key but only moves if the keys are the middle two keys. Otherwise there is no distance covered. For keys in the top and bottom row, distance moved per keystroke is 1.
5) Run a for loop from i = 0 to less than input.length(). Find distance moved by all fingers and store in an array (there are 8 because thumb fingers are only used for pressing space, none of the keys) and find average of distance moved by each key. The lesser the distance, the more efficient the layout for the given input.
6) Print final output.
7) End Algorithm.

## 19) luckyNumbers
**Topics:** Functions, If Else, Loops
**Algorithm:** 
TBD

## 20) potential
**Topics:** Strings, Loops, Arrays
**Algorithm:** 
1) Start algorithm
2) Declare scanner object and take a string input from user to store the sentence in String sentence
3) Convert sentence to upper case, trim it and append a space to it.
4) Store length of sentence in integer length
5) Declare an integer array called arrSum to store potential of each word and arrStr to store all words of the sentence.
6) Run a for loop from i = 0 till length. Store sentence[i] in char ch. If it is not a space, add the integer value of that character in sum and add the char to word. When a space is detected, all characters of the previous word have been stored in word and potential of that word is stored in sum. Assign word to arrStr[i] and assign sum to arrSum[i]. After every iteration, increment counter by 1.
7) After for loop is complete, use bubble sort to sort the words on basis of the potential of each word. Run a for loop from i = 0 till counter and a nested for loop from j = 0 till less than counter - i - 1. If the potential value of arrSum[j] is greater than the potential value of arrSum[j+1], then swap them and swap the words using temp and tem variables.
8) Print final values
9) End Algorithm.

## 21) recursiveSortSearch
**Topics:** Recursions, Functions, Loops, If Else
**Algorithm:** 
TBD

## 22) reverseEncryption
**Topics:** Strings, Arrays, Loops
**Algorithm:** 
1) Start algorithm
2) Make scanner object and take string input for paragraph.
3) Declare and Initialise a StringTokenizer with inputs as the paragraph and use "." as the delimiter and declare and initialise a 1d array of length of the number of tokens to store the sentences from the paragraph. 
4) Separate the sentences from the paragraph and store in a string array using StringTokenizer in a while hasMoreTokens() is true.
5) Run a for loop from i = 0 till sentence.length and add each character in odd sentences with an integer and type cast to character. Reverse the whole sentence of each even sentence.
6) After this encryption, store in file and print.
7) End Algorithm.

## 23) reversingLinkedList
**Topics:** Node, LinkedList, Loops, Inheritance
**Algorithm:** 
1) Start algorithm
2) In class Node, declare int data and Node next.
	1) In Nodal constructor, set value of data as d and next node as null.
3) In main(), make object list
	1) Set values of head and next nodes as integer values
	2) Print Values
	3) Reverse List
	4) Print reversed list
4) In Node reverse(),
	1) Initialize three pointers prev as NULL, curr as head and next as NULL.
	2) Iterate through the linked list using while loop. In loop, do following. 
		1) Before changing next of current, store next node 
			next = curr->next
		2) Now change next of current, This is where actual reversing happens 
			curr->next = prev 
		3) Move prev and curr one step forward 
			prev = curr 
			curr = next

## 24) sentencePalindromeGenerator
**Topics:** If Else, Loops, Strings, Functions
**Algorithm:** 
TBD

## 25) ticTacToe
**Topics:** Functions, Strings, 2D Arrays, If Else
**Algorithm:** 
1) Start algorithm
2) Declare a 2D 3x3 char array storing the ticTacToe board and fill it with positions (1, 2, 3... 9)
3) Store two char inputs for characters used by the two players on the ticTacToe board in player1choice and player2choice.
4) Keep going between the turns of players till a tie is reached or one player wins.
5) In function printBoard(), run a for loop for i = 0 to less than 3. Inside, run a nested for loop from j = 0 to less than 3 and print board[i][j]
6) In function determineRowAndColumn(int position), take input for 1d (1, 2, 3...9) position that user wants to place their character at, and store the two dimensional coordinates for that position (like 2, 1 for 8th position and 0,0 for 1st position) in integer variables row and column
7) In function player1move(), make the move on the board for player 1 using their character
8) In function player1move(), make the move on the board for player 2 using their character
9) In function checkWinner(char playerChoice), check if any three adjacent positions in rows, columns or diagonals are occupied by the character representing any player. If found to be true, return true that the player using playerChoice has won!
10) In function checkTie() check if the total number of moves (stored in count) have reached 9. If so, and nobody has won yet, declare a tie and exit function.
11) In functions player1Turn and player2Turn, enter position and store in player1position. Convert the 1d coordinates to index of rows and columns and check if that place has already been occupied on the board. If not, place the player's character on that position on the board. Run a while loop to ensure that if the place is occupied, tell the user to enter a valid position until it is achieved. After a valid move, check if the user has won by calling checkWinner. If a user has won, print and end the game.
12) End Algorithm.

## 26) towerOfHanoi
**Topics:** Stack, Functions, If Else
**Algorithm:** 
TBD

## 27) typingTest
**Topics:** Functions, Strings, Arrays, Exceptions
**Algorithm:** 
1) Declare instance variables: 
	(a) String input
	(b) int WPM, CPM, numberOfWords, correctWords
	(c) double start, end, time, accuracy, minutesTaken
2) In function countdown, use thread.sleep to create a '3 2 1' countdown to create anticipation and build atmosphere. Then print the sample input. Put it in a try catch block to handle InterruptedException if the user stops the countdown.
3) In function input, initialise Scanner object. Make a long variable start to store the initial nanoseconds of day. Store input sentences from user and store in variable String input. Make another long variable to store the final nanoseconds of day. Store the difference in nanoseconds (ie the time taken by user to type out the sample input) in time and convert it from nanoseconds to seconds by divididing the difference by 10^9.
4) In function calculate, compute all statistics related to the test. 
	(a) First of all, the number of words in the sample is 30 and count of characters is 114. Declare a scanner object to separate and store all words entered by user in a String array. Run a for loop from i = 0 to i = bank.length and compare if bank[i] and words[i] are equal. If they are, then increment the integer variable correctWords to store the total number of correct words. 
	(b) Find total accuracy by dividing and taking percentage of correctWords / numberOfWords and round it upto the second decimal.
	(c) Find the WPM (Words per minute) and CPM (Characters per minute) by first converting time taken by user from seconds to minutes, and then dividing correctWords by timeTaken.
5) In function display, print all statistics to user.
6) End Algorithm.

## 28) verticalBanners
**Topics:** If Else, Loops, Arrays
**Algorithm:** 
TBD

## 29) wordleStartChecker
**Topics:** Arrays, Strings, Functions, If Else
**Algorithm:** 
TBD

## 30) wordShift
**Topics:** Strings, StringTokenizer, Functions
**Algorithm:** 
TBD