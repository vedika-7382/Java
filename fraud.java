import java.util.Scanner;
public class fraud {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        int total=0;
        int i;
        for(i=1;i<=8;i++){
            System.out.println("Enter transaction amount:");
            int amount=sc.nextInt();
            if(amount>100000){
                count+=1;
                total=total+amount;            
            }
        }
     System.out.println("Suspicious transaction:"+count);
     System.out.println("Total suspicious transaction value:"+total);
     sc.close();
    }
    
}
