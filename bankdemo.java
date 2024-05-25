import java.util.*;

class bank
{
    int accno;
    String cname;
    double balance;
    void setData(int a,String n,double bal)
    {
        this.accno=a;
        this.cname=n;
        this.balance=bal;
    }
    void getData()
    {
        System.out.println("Account Number:"+this.accno);
        System.out.println("Name:"+this.cname);
        System.out.println("Balance:"+this.balance);
    }
    void deposit(double amt)
    {
        this.balance=this.balance+amt;
    }
    void withdraw(double amt)
    {
        if(amt>this.balance)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
          this.balance=this.balance-amt;
        }
    }
    void checkbalance()
    {
        System.out.println("Balance:"+this.balance);
    }
    void updatename(String name)
    {
        this.cname=name;
    }
}

class bankdemo
{
    public static void main(String args[])
    {
        int no;
        String na;
        double b,amt;
        Scanner scan=new Scanner(System.in);
        bank b1=new bank();
        System.out.println("Enter the account number");
        no=scan.nextInt();
        System.out.println("Enter name:");
        na=scan.nextLine();
        na=scan.nextLine();
        System.out.println("Enter Balance:");
        b=scan.nextDouble();
        b1.setData(no,na,b);
        b1.getData();
        System.out.println("Enter the amount to be deposited:");
        amt=scan.nextDouble();
        b1.deposit(amt);
        b1.checkbalance();
        System.out.println("Enter the amount to be deposited:");
        amt=scan.nextDouble();
        b1.withdraw(amt);
        b1.checkbalance();
        System.out.println("Enter new name:");
        na=scan.nextLine();
        na=scan.nextLine();
        b1.updatename(na);
        b1.getData();
    }
}