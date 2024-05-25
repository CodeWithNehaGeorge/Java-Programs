import java.util.*;

class search
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n,i,ele,flag=0;
        int a[]=new int[50];
        System.out.println("Enter the limit of the array:");
        n=scan.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter the element to be searched");
        ele=scan.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==ele)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found at position:"+(i+1));
        }
        else
        {
            System.out.println("Not found");
        }

    }
}