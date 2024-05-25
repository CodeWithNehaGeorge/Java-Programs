import java.util.*;

class count
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a[]=new int [50];
        int limit,i,ceven=0,codd=0;
        System.out.println("Enter limit of the array:");
        limit=scan.nextInt();
        for(i=0;i<limit;i++)
        {
            a[i]=scan.nextInt();
        }
        for(i=0;i<limit;i++)
        {
            if(a[i]%2==0)
            {
                ceven++;
            }
            else
            {
                codd++;
            }
        }
        System.out.println("Even no"+ceven);
        System.out.println("Odd no"+codd);
    }
}