import java.util.Scanner;
public class highest {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int highest=0;
        int second=0;
        int i;
        for(i=1;i<=5;i++){
            System.out.println("Enter the salary: ");
            int s=sc.nextInt();
            if(s>highest){
                second=highest;
                highest=s;
            }
            else if(s>second && s!=highest){
                    second=s;
                }
        }
            System.out.println("highest salary:"+highest);
            System.out.println("Second highest salary:"+second);
sc.close();    
}  
}

