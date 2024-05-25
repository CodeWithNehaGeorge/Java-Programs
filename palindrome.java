import java.util.*;

class palindrome
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num,temp,n,rev=0;
        num=scan.nextInt();
        temp=num;
        while(num>0)
        {
          n=num%10;
          rev=rev*10+n;
          num=num/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome");
        }
        else
        {
          System.out.println("Not palindrome");
        }

    }
}