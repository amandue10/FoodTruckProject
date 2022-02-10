# Food Truck Application


### Description
The food truck application allows the user to input up to five different food trucks and set their star rating from 1 to 5. If the user wants to input less than five food truck ratings, they can do so by entering "quit" into the name of the food truck. 

A menu will automatically display after five inputs or when the user inputs "quit". The menu allows the user to choose one of four options.

1. List all existing food trucks
2. See the average ratings of food trucks
3. Display the highest rated food truck
4. Quit the program.

Choosing option 4 on this menu will exit the program.

### Lessons Learned
This weekend's homework challenge was tough starting out. I had trouble figuring out where to put the code I knew how to write. I knew that I needed to create a scanner to gain the user's input and set up my print lines so the user knows what information to input. What I didn't know was how to use two files to run code. I knew there was a class and main but I did over complicate this in the beginning. I also struggled with how to get up to five user inputs, or less. It took a day of reviewing the week and watching YouTube videos to get user story 1 working.  Using a for loop to run the print statements and input the users data allowed for a break to be used to stop user input on a specific question. Using a break in the for loop (truckInput method) allowed the user to end user input and continue to the menu(menu method), satisfying user story 2. It made sense to use separate methods to break down the project, and make it easier to code. I learned why I should be creating more methods, but could have done better at creating more methods.

The menu method uses a do while loop and switch to create the menu. Then each menu selection was added one at a time. I felt comfortable writing print statements. The different conditional statements and varying boolean took some time and were difficult to think out. Using the format given for loops and expressions from lecture made writing the code easier. I had to break down user story 3 into six parts. The print statements, the menu, and each individual selection. Doing this helped the task feel less daunting. The menu uses a do while to ensure that it will run at least one time. Using a do while to house the print statements and the switch allows for the user to choose another option after one is selected, until the user chooses to quit. This satisfied user story 4.   

Getters, setters, and toStrings are easily made by using command + option + s. Which made this project a little easier to code. Using these functions also helped organize the code in my mind. I made mistakes like adding the counter field to be displayed in the toString, but eventually was able to figure out how to remove it. This helped improve my knowledge of toStrings and how they work. 

I also had trouble getting my code to show the input for the food truck name. My output was showing null for the food truck name, even though I entered information. I had created a different variable to store the truck information early on when I was having trouble. When I created getters and setters, I tied the wrong variable to my setter, not showing the user input. I had to delete a setter and change some variables to get it to work. In the start of the day, I never thought I would have made this work.

### Applied Concepts
public and private access modifiers

constructors

if statements

do while loop

switch

for loop

getters and setters

toString

Arrays

booleans 

