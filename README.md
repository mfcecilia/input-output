# input-output
VT Programming team lecture

Verifying Ages
Time Limit: 2 seconds

You have been assigned to verify the ages of users on a new social media website. The programmer in charge of the registration forgot to stop users who were too young from registering, and now it is your job to figure out exactly how many users should not be on the website! You will be provided a list of all the users on the site, and you must output the number and the percentage of users that are not old enough.

Input
Each input will consist of a single test case. The first line of input will contain a single integer NN (10≤N≤2510≤N≤25) denoting the minimum age a user must be to be allowed on the site. This will be followed by a list of users, with each user on its own line of text. There will always be at least one user.

Each user will be provided in the following format: “FirstName LastName Age”.

Output
Output will be the number of users that are below the minimum age requirement, followed by the percentage of users that were below the minimum age. Output this percentage rounded to 2 decimal places.

Sample Input 1	
18
Padme Amidala 14
Anakin Skywalker 9
Obi-Wan Kenobi 25
Mace Windu 40
Darth Maul 22
Sheev Palpatine 50
Qui-Gon Jinn 60

Sample Output 1
2 28.57
