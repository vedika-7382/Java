public class num {
    public static void main(String[]args){
        int sum=0;
        int[]numbers={10,20,30,40};
        for(int num:numbers){
            sum=sum+num;
            System.out.println(num);
        }
        System.out.println("Total:"+sum);
    }
    
}
