import java.util.*;

class grade
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int marks;
        System.out.println("Enter the marks:");
        marks=scan.nextInt();
        if(marks>=90)
        {
            System.out.println("A grade");
        }
        else if(marks>=80 && marks<90)
        {
            System.out.println("B grade");
        }
        else if(marks>=70 && marks<80)
        {
            System.out.println("C grade");
        }
        else if(marks>=60 && marks<70)
        {
            System.out.println("D grade");
        }
        else
        {
            System.out.println("Fail");
        }

    }
        
}
