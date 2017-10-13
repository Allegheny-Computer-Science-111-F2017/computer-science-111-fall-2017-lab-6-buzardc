# Reflection by

This lab required me to write a file called `ManipulateDNA`. The first step
involved replacing the letters within a string of DNA with their respective
compliments. After my first attempt, I realized that simply replacing each
letter with it's compliment would cause a dilemna.

After replacing the first complimentary letter, I would quickly change it right
back to its original letter in the next command. To get around this dilemna I
gave each letter in the dna string a pseudo letter so that it would not get
double replaced.The hardest step in this assignment was deleting a random dna
letter from the input string and then replacing it with a random letter.

I understood how to choose a random character from the string from previous
labs, but it took me a while to understand how to remove it from the string. To
delete it from the string I created two seperate substrings that excluded the
chosen letter. When replacing it with a new letter I simply created a new
random letter and added it in between the two strings.
