import java.util.*;

class Student
{
    static int count=0;
    int rollno;
    String name;
    double mark1,mark2;
    void setData(int r,String n,double m1,double m2)
    {
        this.rollno=r;
        this.name=n;
        this.mark1=m1;
        this.mark2=m2;
        count++;
    }
    void getData()
    {
        System.out.println("Rollno:"+this.rollno);
        System.out.println("Name:"+this.name);
        System.out.println("Mark1:"+this.mark1);
        System.out.println("Mark2:"+this.mark2);
    }
    void getTotal()
    {
        double total;
        total=this.mark1+this.mark2;
        System.out.println("Total:"+total);
    }
    protected void finalize()
    {
        count--;
    }
    static void totalcount()
    {
        System.out.println("Count:"+count);
    }
}

class StudentDemo
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int roll,ch;
        double m1,m2;
        String na;
        Student s1=new Student();
        System.out.println("Enter roll no:");
        roll=scan.nextInt();
        System.out.println("Enter name:");
        na=scan.nextLine();
        na=scan.nextLine();
        System.out.println("Enter mark1:");
        m1=scan.nextDouble();
        System.out.println("Enter mark2:");
        m2=scan.nextDouble();
        s1.setData(roll,na,m1,m2);
        s1.getData();
        s1.getTotal();
        Student s2=new Student();
        System.out.println("Enter roll no:");
        roll=scan.nextInt();
        System.out.println("Enter name:");
        na=scan.nextLine();
        na=scan.nextLine();
        System.out.println("Enter mark1:");
        m1=scan.nextDouble();
        System.out.println("Enter mark2:");
        m2=scan.nextDouble();
        s2.setData(roll,na,m1,m2);
        s2.getData();
        s2.getTotal();
        Student.totalcount();
        System.out.println("Would you like to delete student 1 or student 2:");
        ch=scan.nextInt();
        if(ch==1)
        {
            s1=null;
            System.gc();
            System.runFinalization();
            Student.totalcount();
        }
        else if(ch==2)
        {
            s2=null;
            System.gc();
            System.runFinalization();
            Student.totalcount();
        }
    }
}