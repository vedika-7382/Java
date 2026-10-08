public class even {
    public static void main(String[]args){
        int[] numbers={1,2,3,4,5,6,7,8,9};
        int even=0;
        int odd=0;
        for(int num:numbers){
            if(num%2==0){
                even=even+num;
            }
            else{
                odd=odd+num;
            }
        }
        System.out.println("Total odd numbers"+odd);
        System.out.println(even);
            
    }
    
}
