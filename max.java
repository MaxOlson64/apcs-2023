public class max{
     
    
    public static void main(String[] args) {
        System.out.println("some string to print");
        System.out.println(power(2,17));
        System.out.println(powerIter(57,55 ));   
    }
    
    static int power(int a, int b){
        if (b == 1){
            return a;
        }else{
            int nextPower = power(a, b/2);
            if(b%2==1){
             return nextPower * nextPower *a;
                
            }else{
            return nextPower * nextPower *a;
            }
        }
    }
    static int powerIter(int a, int b){
        int result = 1;
        for(int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }
}