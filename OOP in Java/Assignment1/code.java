//1.Write a Java Program to declare and initialize all eight primitive data types and print their values.
public class Data1 {
    public static void main(String args[]){
        int a =10;
        float f=2.34f;
        char ch='h';
        byte b=12;
        short s=345;
        long l=452456;
        double d=3.456786436;
        boolean bool=true;
        System.out.println("Integer :"+a);
        System.out.println("Float :"+f);
        System.out.println("Character :"+ch);
        System.out.println("Byte :"+b);
        System.out.println("Short :"+s);
        System.out.println("Long :"+l);
        System.out.println("Double :"+d);
        System.out.println("Boolean :"+bool);
    }    
}


//2.Write a Java program that takes two integers as input and performs all arithmetic operation on them.
import java.util.Scanner;
public class Data2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1=sc.nextInt();
        System.out.print("Enter number 2:");
        int num2=sc.nextInt();
        System.out.println("Addtion:"+(num1+num2));
        System.out.println("Substraction:"+(num1-num2));
        System.out.println("Multiplication:"+(num1*num2));
        System.out.println("Division:"+(double)(num1/num2));
        System.out.println("Modulous:"+(num1%num2));
        sc.close();
    }    
}


//3.Implement a Java program to demonstrate implicit and explicit type casting.
public class Data3 {
    public static void main(String args[]){
        float f=34.56f;
        byte b=23;
        System.out.println("Implicit Conversion:-");
        int n=b;//Implicit type casting 
        System.out.println("Byte value into integer:"+n);
        int a=(int)f; // Explicit type-casting
        System.out.println("Float converted to integer:"+a);

    }
    
}


// 4. Create a Java Program that converts a given integer to a double and vice versa using wrapper classes.
public class Data4 {
    public static void main(String args[]){
        //Convert Integer to double
        Integer value=123;
        double value1=value.doubleValue();
        System.out.println("Integer to double value:"+value1);
        //Converting Double to integer
        Double d=34.4556;
        int d1=d.intValue();
        System.out.println("Double to integer value:"+d1);
    }
    
}


// 5. Write a Java program to swap two numbers using a temporary variable and without using a temporary variable.
public class Data5 {
    public static void main(String args[]){
        int a=10,b=12;
        System.out.println("Using third variable:-");
        System.out.println("Before swapping a is"+a+" b is "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a is:"+a+" b is "+b);
        System.out.println("Without third variable:-");
        int num1=12,num2=15;
        System.out.println("Before swapping num1 is "+num1+" num2 is "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping num1 is "+num1+" num2 is "+num2);

    }
    
}

// 6. Develop a program that takes user input for a character and prints whether it is a vowel or consonant.
import java.util.Scanner;
public class Data6 {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character:-");
        char ch=sc.next().charAt(0);
        sc.close();
        if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
            System.out.println("It is a vowel");
        }else{
            System.out.println("It is a Consonant");
        }
    }
}


 //7. Create a Java program to check whether a given number is even or odd using command-line arguments.
 
public class Data7 {
    public static void main(String args[]){
        if(args.length==0){
            System.out.println(" provide a number as a command-line argument.");
            return;
        }
        try{
            int num = Integer.parseInt(args[0]);
            if(num%2==0){
                System.out.print("Number is Even");
            }else{
                System.out.print("Number is Odd");
            }
        }catch(NumberFormatException e){
            System.out.println("Invalid input!");
        }
    }
    
}


