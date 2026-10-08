import java.util.Scanner;
public class employee_performance {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int highest=0;
        int lowest=100;
        int i;
        for(i=1;i<=6;i++){
            System.out.println("Enter performance score:");
            int score=sc.nextInt();
            if(score>=80){
                System.out.println("Excellent");
            }
            else if(score>=60){
                System.out.println("Good");
            }
            else if(score>=40){
                System.out.println("Average");;
            }
            else{
                System.out.println("Poor");
            }
            if(score>highest){
                highest=score;
            }
            if(score<lowest){
                lowest=score;
            }
        }
        System.out.println("Highest score: "+highest);
        System.out.println("Lowest score: "+lowest);
        sc.close();
    }
    
}
