import java.util.Scanner;
public class transaction_risk{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int low=0;
        int medium=0;
        int high=0;
        int i;
        for(i=1;i<=10;i++){
            System.out.println("Enter transaction amount: ");
            int amount=sc.nextInt();
            if(amount<=10000){
                System.out.println("Low risk");
                low+=1;
            }
            else if(amount<=50000){
                System.out.println("Medium risk");
                medium+=1;
            }
            else{
                System.out.println("High risk");
                high+=1;

            }
        }
            System.out.println("Total low risk transaction:"+low);
            System.out.println("Total medium risk transaction:"+medium);
            System.out.println("Total high risk transaction:"+high);
sc.close();
        }
    }

