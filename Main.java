import java.util.Scanner;
class UserDetails{
    Scanner sc=new Scanner(System.in);
    void details(){}
    void register(){}
    void login(){
     System.out.println("Enter your Name");
     String Name=sc.nextLine();
     System.out.println("Your Name is "+ Name);
     System.out.println("Enter your Country");
     String Country=sc.nextLine();
     System.out.println("Your Country is "+ Country);
     System.out.println("Enter your Pincode");
     int pincode=sc.nextInt();
     System.out.println("Your Pincode is "+ pincode);
    }

}
public class Main{
    public static void main(String args[]){
    System.out.println("Hello");   
    System.out.println("Hello Everyone"); 
    System.out.println("XYZ Testing");
    UserDetails obj=new UserDetails();
    obj.login();

    }
}