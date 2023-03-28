public class piDay{
    public static void main(String[] args) {
        System.out.println("pi = " + pi);
    }
    public static double piDay(int n, boolean subtract){
        if(n >= 1000){
            return 0;
        }else{
            if(subtract==true){
                return -4.0/n + piDay(n + 2, false);
            }else{
                return 4.0/n + piDay(n + 2, true);
            }
           
        }
    }
}