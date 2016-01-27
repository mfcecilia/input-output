# input-output
VT Programming team lecture

Verifying Ages <br />
Time Limit: 2 seconds

You have been assigned to verify the ages of users on a new social media website. The programmer in charge of the registration forgot to stop users who were too young from registering, and now it is your job to figure out exactly how many users should not be on the website! You will be provided a list of all the users on the site, and you must output the number and the percentage of users that are not old enough.

Input <br />
Each input will consist of a single test case. The first line of input will contain a single integer NN (10≤N≤2510≤N≤25) denoting the minimum age a user must be to be allowed on the site. This will be followed by a list of users, with each user on its own line of text. There will always be at least one user.

Each user will be provided in the following format: “FirstName LastName Age”.

Output <br />
Output will be the number of users that are below the minimum age requirement, followed by the percentage of users that were below the minimum age. Output this percentage rounded to 2 decimal places.

Sample Input 1	
18 <br />
Padme Amidala 14 <br />
Anakin Skywalker 9 <br />
Obi-Wan Kenobi 25 <br />
Mace Windu 40 <br />
Darth Maul 22 <br />
Sheev Palpatine 50 <br />
Qui-Gon Jinn 60

Sample Output 1 <br />
2 28.57
