class Bank_Account{
    int accountNo;
    String username;
    String email;
    String accountType;
    int accountBalance;

    public Bank_Account(int accountNo,String username,
        String email,String accountType,int accountBalance){
        this.accountNo = accountNo;
        this.username = username;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }
    public void displayAccountDetails(){
        System.out.println("AccountNo "+accountNo+" is having "
            +accountBalance+"Rs. in account");
    }
    public String getAccountDetails(){
        return "AccountNo "+ accountNo+" is having "+accountBalance
        +" Rs. in account";
    }
}
public class A4{
    public static void main(String[] args){
        Bank_Account ba1= new Bank_Account(101,"jenil","goheljenil21@gmail.com","SA",15);
        Bank_Account ba2= new Bank_Account(102,"jenil","borichajenil11@gmail.com","CA",125);

        ba1.displayAccountDetails();
        String ans = ba2.getAccountDetails();

        System.out.println(ans);
    }
}