import java.util.Scanner;
public class result {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student name:");
        String name=sc.nextLine();
        System.out.println("Maths: ");
        int math=sc.nextInt();
        System.out.println("Data structure: ");
        int ds=sc.nextInt();
        System.out.println("OOPS: ");
        int oops=sc.nextInt();
        System.out.println("English: ");
        int eng=sc.nextInt();
        System.out.println("OS: ");
        int os=sc.nextInt();

        System.out.println("Name: "+name);
        int total= math +ds +oops +eng +os;
        System.out.println("Total marks obtained: "+total);
        int percentage= (total*100)/500;
        System.out.println("Percentage: "+percentage);

        if(percentage>=90){
            System.out.println("Grade A+");
        }
        else if(percentage>=80){
            System.out.println("Grade A");
        }
        else if(percentage>=70){
            System.out.println("Grade B");
        }
        else if(percentage>=60){
            System.out.println("Grade C");
        }
        else if(percentage>=40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }
        sc.close();

    }
    
}
