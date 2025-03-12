
/*
Q1: Write a program to swap two numbers without using a third variable and without
using arithmetic operators like + or - .
Hint : Use bitwise XOR ^ operator.
*/
  public class Q1{
    public static void main(String args[]){
        int a=10,b=15;
        System.out.println("Before Swapping A is :"+a+" and B is :"+b);
        a=a^b; // 1010  xor 1111 = 0101 =5
        b=a^b;// 0101 xor 1111  = 1010 =10
        a=a^b;// 0101 xor 1010 = 1111 =15
        System.out.println("after Swapping A is :"+a+" and B is :"+b);

    }
}
/*
Q2: Write a program to check whether a given number is even or odd using only bitwise
operators .
Hint : Use n & 1 to check.
*/



  public class Q2 {
    public static void main(String args[]){
        int num=4;
        if((num & 1) ==0){
            System.out.print("Number "+num +" is Even");
        }else{
            System.out.print("Number "+num +" is Odd");
        }
    }
    
}
/*
Q3: Implement a program that calculates the sum of digits of an integer using modulus
( % ) and division ( / ) operators .
  
*/
Q3: Implement a program that calculates the sum of digits of an integer using modulus
( % ) and division ( / ) operators .
  
public class Q3 {
    public static void main(String args[]){
        int num=1234;
        int sum=0;
        int n=num;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.print("The sum of digit of number "+num+" is "+sum);
    }
    
}

/*
Q4: Write a program to find whether a given number is divisible by 3 without using the
modulus ( % ) or division ( / ) operators.
Hint : Use subtraction and bitwise shifts .
*/  



/*

*/

  public class Q5 {
    public static void main(String args[]){
        int a=10,b=12;
        System.out.println("a is "+a+ " b is "+b);
        a+=b; // a= a + b (10+12=22)
        b-=a;// b= b - a (12-22=-10)
        b= -b; // -(-10)=10
        a-=b;// a= a - b (22-10=12)
        System.out.print("a is "+a+ " b is "+b);
    }
    
}


/*
Q6: Write a program to find the largest of three numbers using only the ternary operator
( ? : ) .
*/
public class Q6 {
    public static void main(String args[]){
        int a=4,b=2,c=7;
        int largest=(a>b)?((a>c)? a:c):((b>c)?b:c);  
        System.out.println("Largest number is :"+largest);
    }
    
}


/*
Q7: Implement a Java program that checks whether a given year is a leap year or not using
logical ( && , || ) operators
*/
import java.util.Scanner;

public class Q7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);   
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.print(year+" is a leap year");
        }else{
            System.out.print(year+" is not a leap year");
        }
        sc.close();
    }
    
}



/*
Q8: Write a program that takes three boolean inputs and prints true if at least two of
them are true .
Hint : Use logical operators ( && , || ).
*/
import java.util.Scanner;

public class Q8 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean a=sc.nextBoolean();
        boolean b=sc.nextBoolean();
        boolean c=sc.nextBoolean();
        if(a&&b || b&&c || c&&a){
            System.out.print("True");
        }else {
            System.out.print("False");
        }
        sc.close();
    }
    
}



import java.util.Scanner;
public class Q9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print((num>=20 && num<=50)? num + " lies in range": num+ " dont lies in range");
        sc.close();

    }
    
}


import java.util.Scanner;
public class Q10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character :");
        char c = sc.next().charAt(0);
        String result=(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')? "Vowel":"Consonant" ;
        System.out.print("The character "+c+" is :"+result);
        sc.close();
    }
}


import java.util.Scanner;
public class Q11 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        if(num<0){
            num=-num;
        }
        if((num & (num-1))==0){
            System.out.println(num+ " is power of 2");
        }else{
            System.out.print(num+" is not a power of 2");
        }
    }
    
}


import java.util.Scanner;
public class Q12 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        int result=num << 3;
        System.out.print("The number multiplied by 8 is :"+result);
    }    
}

