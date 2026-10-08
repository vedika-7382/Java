import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int successful=0;
    int rejected=0;
    int i;
    for(i=1;i<=10;i++){
        System.out.println("Enter withdrawl amount:");
        int amount=sc.nextInt();
        if(amount<=0){
            System.out.println("Rejected:Invalid amount");
        }
        else if(amount%500!=0){
            System.out.println("Rejected:Amount must be multiple of 500");
        }
        else if(amount>20000){
            System.out.println("Rejected:Maximum withdrawl limit is 20000");
        }
        else{
            System.out.println("Withdrawl successful");
            successful+=1;
            continue;
        }
        rejected+=1;

    } 
    System.out.println("Successful transaction: "+successful);
    System.out.println("Rejected transaction: "+rejected);

    sc.close(); 
}
}
