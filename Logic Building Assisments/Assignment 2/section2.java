/*
 Question 1: Grade Classification
Write a program to classify student grades based on the following criteria:
 If the score is greater than or equal to 90, print "A"
 If the score is between 80 and 89, print "B"
 If the score is between 70 and 79, print "C"
 If the score is between 60 and 69, print "D"
 If the score is less than 60, print "F"
 */
import java.util.Scanner;

public class sec2Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the score:");
        int score=sc.nextInt();
        if(score>=90){
            System.out.print("A");
        }else if(score>=80 && score<90){
            System.out.print("B");
        }else if(score >=70 && score<80){
            System.out.print("C");
        }else if(score>=60 && score<70){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
        sc.close();
    }
}


/*
 Question 2: Days of the Week
Write a program that uses a nested switch statement to print out the day of the week based on an
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
is a weekday or weekend.
 */
import java.util.Scanner;

public class sec2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Day:");
        int day = sc.nextInt();
        switch (day) {
           case 1:
           case 2:
           case 3: 
           case 4:
           case 5:
           

                switch (day) {
                    case 1:
                        System.out.println("Monday");

                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                }
                System.out.print("Weekday");
                break;
            case 6:
            case 7:
                switch (day) {

                    case 6:
                        System.out.println("Saturday");
                        break;
                    case 7:
                        System.out.println("Sunday");

                }
                System.out.println("weekend");
                break;
        }
        sc.close();
    }

}


/*
 Question 3: Calculator
Write a program that acts as a simple calculator. It should accept two numbers and an operator
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse
to check if division by zero is attempted and display an error message.
 */
import java.util.Scanner;
public class sec2Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first number:");
        double a=sc.nextDouble();
        System.out.print("Input second number:");
        double b=sc.nextDouble();
        System.out.print("imput operation to perform(+,-,*,/):");
        char opr=sc.next().charAt(0);
        double result;
        switch (opr) {
            case '+':
                result=a+b;
                System.out.println("Result:"+result);
                break;
            case '-':
                result=a-b;
                System.out.println("Result:"+result);
                break;
            case '*':
                result=a*b;
                System.out.println("Result:"+result);
                break;
            case '/':
                if(b==0){
                    System.out.print("Not allowed to divisible by zero");
                }else{
                    result=a/b;
                    System.out.println("Result:"+result);
                }
                break;
            default:
            System.out.println("Invalid Operation! use +,-,*,/");
                break;
        }
        sc.close();
    }
}
/*
Question 4: Discount Calculation
Write a program to calculate the discount based on the total purchase amount. Use the following
criteria:
 If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
 If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
 If the total purchase is less than Rs.500, apply a 5% discount.
Additionally, if the user has a membership card, increase the discount by 5%.
*/

import java.util.Scanner;
public class sec2Q4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input your Purchase:");
        int purchase=sc.nextInt();
        System.out.print("Do you have membership Card?(0 for no , 1 for yes)");
        int card=sc.nextInt();
        double result;
        if(purchase>=1000){
            if(card==1){
                result=purchase*(25/100.0);
                System.out.println("Amount of discount:"+result);
            }else{
                result=purchase*(20/100.0);
                System.out.println("Amount of discount:"+result);
            }
        }else if(purchase>=500 && purchase<=999){
            if(card==1){
                result=purchase*(15/100.0);
                System.out.println("Amount of discount:"+result);
            }else{
                result=purchase*(10/100.0);
                System.out.println("Amount of discount:"+result);
            }
        }else{
            if(card==1){
                result=purchase*(10/100.0);
                System.out.println("Amount of discount:"+result);
            }else{
                result=purchase*(5/100.0);
                System.out.println("Amount of discount:"+result);
            }
        }
        sc.close();
    }
    
}

/*
Question 5: Student Pass/Fail Status with Nested Switch
Write a program that determines whether a student passes or fails based on their grades in three
subjects. If the student scores more than 40 in all subjects, they pass. If the student fails in one or
more subjects, print the number of subjects they failed in.
*/
import java.util.Scanner;
public class sec2Q5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first subject score:");
        int sub1=sc.nextInt();
        System.out.print("Enter second subject score:");
        int sub2=sc.nextInt();
        System.out.print("Enter third subject score:");
        int sub3=sc.nextInt();
        int count=0;
        switch (sub1 >= 40 ? 1 : 0) {
            case 1: // Passed
                break;
            case 0: // Failed
                count++;
        }

        switch (sub2 >= 40 ? 1 : 0) {
            case 1: // Passed
                break;
            case 0: // Failed
                count++;
        }

        switch (sub3 >= 40 ? 1 : 0) {
            case 1: // Passed
                break;
            case 0: // Failed
                count++;
        }

        
        switch (count) {
            case 0:
                System.out.println("Congratulations! You passed all subjects.");
                break;
            case 1:
                System.out.println("You failed in one subject.");
                break;
            case 2:
                System.out.println("You failed in two subjects.");
                break;
            case 3:
                System.out.println("You failed in all three subjects.");
                break;
            default:
                System.out.println("Invalid input.");
        }

        sc.close();
    }
    
}

