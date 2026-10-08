import java.util.Scanner;
public class monthly_sales {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int total=0;
        int high_sale=0;
        int highest=0;
        int lowest=0;
        int i;
        for(i=1;i<=12;i++){
            System.out.println("Enter sales for month: ");
            int sales=sc.nextInt();
            total=total+sales;
            if(i==1){
                highest=sales;
                lowest=sales;
            }
            else{
                if(sales>highest){
                    highest=sales;
                }
                if(sales<lowest){
                    lowest=sales;
                }
            }
            if(sales>100000){
                high_sale++;
            }
        }
            double average=total/12.0;
            double percentage=(high_sale/12.0)*100;
            System.out.println("Total annual sales: "+total);
            System.out.println("Average monthly sales: "+average);
            System.out.println("Highest monthly sales: "+highest);
            System.out.println("Lowest monthly sales: "+lowest);
            System.out.println("Number of months with sales above 100000: "+high_sale);
            System.out.println("Percentage of high sales: "+percentage);

        sc.close();
        
    }
    
}
