import java.util.*;

class Calculator
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num1,num2,sum,diff,mul;
        double n1,n2,remainder;
        char ch;
        do
        {
            System.out.println("1.Addition '+'");
            System.out.println("2.Subtraction '-'");
            System.out.println("3.MUltiplication '*'");
            System.out.println("4.Division '/'");
            System.out.println("5.EXit");
            System.out.println("Enter your choice:");
            ch=scan.next().charAt(0);
            switch(ch)
            {
                case '+':System.out.println("Enter num1:");
                         num1=scan.nextInt();
                         System.out.println("Enter num2:");
                         num2=scan.nextInt();
                         sum=num1+num2;
                         System.out.println("Sum:"+sum);
                         break;
                case '-':System.out.println("Enter num1:");
                         num1=scan.nextInt();
                         System.out.println("Enter num2:");
                         num2=scan.nextInt();
                         diff=num1-num2;
                         System.out.println("Difference"+diff);
                         break;
                case '*':System.out.println("Enter num1:");
                         num1=scan.nextInt();
                         System.out.println("Enter num2:");
                         num2=scan.nextInt();
                         mul=num1*num2;
                         System.out.println("Product:"+mul);
                         break;
                case '/':System.out.println("Enter num1:");
                         n1=scan.nextDouble();
                         System.out.println("Enter num2:");
                         n2=scan.nextDouble();
                         remainder=n1/n2;
                         System.out.println("Remainder:"+remainder);
                         break;
                case '$':System.exit(0);
            }

        }while(true);
    }
}