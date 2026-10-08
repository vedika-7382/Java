import java.util.Scanner;
public class login_seq {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String correctpass="admin123";
        int i;
        for(i=1;i<=3;i++){
            System.out.println("Enter your passowrd: ");
            String pass=sc.nextLine();
            if(pass.equals(correctpass)){
                System.out.println("Login successful");
                break;
            }
            else{
                System.out.println("Incorrect password");
            }
            if(i==3){
                System.out.println("Account Locked");
            }

                
            }
sc.close();
        }

    }
    

