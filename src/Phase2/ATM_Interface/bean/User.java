package Phase2.ATM_Interface.bean;

public class User {
    private String userName;
    private int password;
    private long accNum;
    private double balance;

    public User(String userName, int password, long accNum, double balance){
        this.userName = userName;
        this.password = password;
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public long getAccNum(){
        return  accNum;
    }

    public void setAccNum(long accNum){
        this.accNum = accNum;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", Account Num ='" + accNum + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
