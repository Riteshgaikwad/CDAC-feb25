public class Q1{
    public static void main(String args[]){
        int [] arr={1,4,6,7,8,2,9,11,4,5};
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Greater number :"+largest);
        System.out.println("Smallest number :"+smallest);
    }
}


public class Q2 {
    public static void main(String args[]){
        int[] array={1,2,3,4,5,6,7};
        int start=0;
        int end=array.length-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        for(int n : array){
            System.out.print(n+" ");
        }
    }
    
}


public class Q3 {
    public static void main(String args[]){
        int[] arr={10,30,45,13,60,90,59};
        int largest=Integer.MIN_VALUE;
        int second_largest=Integer.MIN_VALUE;
        for(int n :arr){
            if(n > largest){
                second_largest=largest;
                largest=n;
            }else if(n>second_largest && n<largest){
                second_largest=n;
            }
        }
        System.out.print("Second Largest number is:"+second_largest);
    }
    
    
}

public class Q4 {
    public static void main(String args[]){
        int array[]={3,4,6,8,21,34,567,885};
        int odd_count=0;
        int even_count=0;
        for(int n : array){
            if(n %2==0){
                even_count++;
            }else{
                odd_count++;
            }
        }
        System.out.println("Even count:"+even_count);
        System.out.print("Odd count:"+odd_count);

    }
}


public class Q5 {
    public static void main(String args[]){
        int[] array={1,2,3,4,5,6,7,8,9};
        int sum=0;
        float avg=0;
        for(int num : array){
            sum +=num;
        }
        avg=sum/(array.length);
        System.out.println("Sum is:"+sum);
        System.out.print("Average is:"+avg);
    }
    
}




public class Q6 {
    public static void main(String args[]){
        int array[]={1,1,1,3,4,4,4,4,5,5,6,6,7,7};
        
        for(int n : array){
            System.out.print(n+" ");
        }
    }
    
}
