import java.util.*;

class matrix
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int r,c,i,j,r1,c1;
        int a[][]=new int [50][50];
        int b[][]=new int [50][50];
        int d[][]=new int [50][50];
        System.out.println("Enter the number of rows:");
        r=scan.nextInt();
        System.out.println("Enter the number of columns");
        c=scan.nextInt();
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix1");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Enter the number of rows of matrix 2:");
        r1=scan.nextInt();
        System.out.println("Enter the number of columns of matrix 2");
        c1=scan.nextInt();
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                b[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix2");
        for(i=0;i<r1;i++)
        {
            for(j=0;j<c1;j++)
            {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("SUM");
        if(r==r1 && c==c1)
        {
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    d[i][j]=a[i][j]+b[i][j];
                }
            }
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++)
                {
                    System.out.print(d[i][j]+"\t");
                }
                System.out.println("\n");
            }
            System.out.println("Transpose");
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    System.out.print(d[j][i]+"\t");
                }
                System.out.println("\n");
            }
        }
        else
        {
            System.out.println("Addition not possible");
        }
    }
}