
//import java scanner package or else the methods I use won't work.
import java.util.Scanner;

//include the class. In this case, it's the name of the problem given.
public class VerifyingAges {
    
    
//this function aka method runs the program
    public static void main(String[] args) {
        
//bring a scanner into existence
            Scanner scan = new Scanner(System.in);

//minimum age variable isn't set as a specific number, but as an integer to be checked or compared            
            int minAge;
            minAge = scan.nextInt();
            
//number is the number of people who are the minimum age. It's a counter which gets added on ever while loop. 
//Because not only are we checking for age, we want to know how many peopel fit this criterion.          
            int number;
            number = 0;
            
//the total variable is the total people scanned whether or not they are the minimum age. It's a counter which gets added on every while loop. "double" also means the variable is a decimal
//this is important for the end when the percentage of under age users gets printed
            double total;
            total = 0;
            
//our program begins with a while loop that simply tests if there's anything next in the input.
            while (scan.hasNext())
            {               
//we know users input first, last, and age. So we can program the scanner to skip first and last names, then begin checking the integer for age and storing it as a variable to be compared.
                scan.next();
                scan.next();
                int age = scan.nextInt();
                
                if (age < minAge)
                {            
                    number++;
                }
                total++;
                
            }
            
//percent is a variable to store the percentage of under age users which is calculated by dividing total users by under age users
//the percent variable is listed as "double" because it contains decimals. This is also known as a "float" value
            double percent = number/total*100;
            
//we print the result using printf so that we can format the style of the results. %d will print a plain integer and %f will print a float to two decimal places.
            System.out.printf("%d %.2f", number, percent);
        }       
}
