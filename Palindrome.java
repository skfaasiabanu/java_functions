import java.util.*;
public class Palindrome{
    public static void  palin(long num1)
    {    
        long num=num1;
          long reverse=0;
          
         while(num!=0)
         {
            long rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
         }
         if(reverse==num1)
         {
            System.out.println("palindrome");
         }
         else{
            System.out.println("not palindrome");
         }
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n ");
        long n=sc.nextLong();
        palin(n);
        

    }
}