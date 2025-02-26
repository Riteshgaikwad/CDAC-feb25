// 1. Write a program to calculate the sum of the first 50 natural numbers.
public class Q1 {
    public static void main(String args[]){
        int n=50;
        int sum=0;
        while (n>0) {
            sum=sum+n;
            n--;
        }
        System.out.println("The sum of first 5o natural number is :"+sum);
    }
    
}
// 2. Write a program to compute the factorial of the number 10.
public class Q2 {
    public static void main(String args[]){
        int n=10;
        int fact=1;
        while (n>0) {
            fact=fact*n;
            n--;

        }
        System.out.println("Factorial of number 10 is :"+fact);
    }
    
}
// 3. Write a program to print all multiples of 7 between 1 and 100.
public class Q3 {
    public static void main(String args[]){
        for(int i=1;i<=100;i++){
            if(i%7==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
// 4. Write a program to reverse the digits of the number 1234. The output should be 4321.
public class Q4 {
    public static void main(String args[]){
        int digit=1234;
        int rev=0;
        while (digit>0) {
            int rem=digit%10;
            rev=rev*10+rem;
            digit/=10;
        }
        System.out.println("Reverse of a number is:"+rev);
    }
    
}
// 5. Write a program to print the Fibonacci sequence up to the number 21.
public class Q5 {
    public static void main(String args[]){
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        int num=0;
        while (num<21) {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            num=c;
        }
    }
    
}
// 6. Write a program to find and print the first 5 prime numbers.
public class Q6 {
    public static void main(String args[]){
         int count = 0;  
        int num = 2;  
        
        System.out.println("First 5 prime numbers are:");
        while(count < 5) {  
            if(isPrime(num)) { 
                System.out.print(num + " ");
                count++; 
            }
            num++; 
        }
    }
    

    public static boolean isPrime(int n) {
        if(n <= 1) return false; 
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) return false;  
        }
        return true;
    }
    }
    
}
// 7. Write a program to calculate the sum of the digits of the number 9876. The output should be
// 30 (9 + 8 + 7 + 6).
public class Q7 {
    public static void main(String args[]){
        int digit=9876;
        int sum=0;
        while (digit>0) {
            int rem=digit%10;
            sum=sum+rem;
            digit/=10;
        }
        System.out.println("Sum of the digit is:"+sum);
    }
    
}
// 8. Write a program to count down from 10 to 0, printing each number.
public class Q8 {
    public static void main(String args[]){
        int n=10;
        while (n>=0) {
            System.out.print(n+" ");
            n--;
        }
    }
    
}
//9. Write a program to find and print the largest digit in the number 4825.

public class Q9 {
    public static void main(String args[]){
        int digit=4825;
        int largest=0;
        while (digit>0) {
            int rem=digit%10;
            if(largest<rem){
                largest=rem;
            }
            digit/=10;
        }
        System.out.println("Largest number in digit is:"+largest);
    }
    
}
//10. Write a program to print all even numbers between 1 and 50.
public class Q10 {
    public static void main(String args[]){
        for(int i=1;i<50;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
// 11. Write a Java program to demonstrate the use of both pre-increment and post-decrement
// operators in a single expression
public class Q11 {
    public static void main(String args[]){
        int i = 5;
        int j = 10;
        int result = ++i + j--;
        
        System.out.println("Value of i after pre-increment: " + i); // 6
        System.out.println("Value of j after post-decrement: " + j); // 9
        System.out.println("Result of the expression (++i + j--): " + result); // 6 + 10 = 16
    }
    
}


/*
 12. Write a program to draw the following pattern:
*****
*****
*****
*****
*****
 */
public class Q12 {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
/*
 13. Write a program to print the following pattern:
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
14.
 */
public class Q13 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print(i);
                }else{
                    System.out.print(i+"*");
                }
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print(i);
                }else{
                    System.out.print(i+"*");
                }
            }
            System.out.println();
        }
    }
    
}
/*
 14. Write a program to print the following pattern:
*
**
***
*****
*******
*********
 */
public class Q14 {
    public static void main(String args[]){
        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
/*
 15. Write a program to print the following pattern:
*
**
***
****
*****
 */
public class Q15 {
    public static void main(String args[]){
        for(int i=0;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        
    }
    
}
/*
 16. Write a program to print the following pattern:
*
***
*****
*******
 */
public class Q16 {
    public static void main(String args[]){
        for(int i=0;i<=5;i++){
            for(int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
/*
 17. Write a program to print the following pattern:
*****
****
***
**
*
 */
public class Q17 {
    public static void main(String args[]){
        for(int i=5;i>0;i--){
            for(int j=0;j<2*(5-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    
}
/*
 18. Write a program to print the following pattern:
*
***
*****
*******
*****
***
*
 */
public class Q18 {
    public static void main(String args[]){
        for(int i=1;i<5;i++){
            for(int j=i;j<=5-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=3;i>=1;i--){
            for(int j=i;j<=5-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
/*
 19. Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5
 */
public class Q19 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if(i==1){
                    System.out.print(i);
                }else{
                    System.out.print(j+"*");
                }
            }
            System.out.println();
        }
    }
}
/*
 20. Write a program to print the following pattern:
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1
 */
public class Q20 {
    public static void main(String args[]){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                if(j==i){
                    System.out.print(j);
                }
                else{
                    System.out.print(j+"*");
                }
                
            }
            System.out.println();
        }
    }
    
}
/*
 21. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9
 */
public class Q21 {
    public static void main(String args[]){
        int num = 1; 
        for(int i=1; i<=5; i++){ 
            num = 1; 
            for(int j=1; j<=i; j++){
                System.out.print(num);
                if(j < i) {
                    System.out.print("*"); 
                }
                num += 2; 
            }
            System.out.println(); 
        }
    }
    
}
public class Q22 {
    public static void main(String args[]){
        for(int i=4;i>=1;i--){
            for(int j=i;j<=5-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=1;i<5;i++){
            for(int j=i;j<=5-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
    
}
/*
23. Write a program to print the following pattern:
11111
22222
33333
44444
55555
 */
public class Q23 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
/*
 24. Write a program to print the following pattern:
1
22
333
4444
55555
 */
public class Q24 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
/*
 25. Write a program to print the following pattern:
1
12
123
1234
12345
 */
public class Q25 {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }   
    }
    
}
/*
 26. Write a program to print the following pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
public class Q26 {
    public static void main(String args[]){
        int count=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
              
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    
}
