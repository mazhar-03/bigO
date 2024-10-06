public class OOfLogN {
    public static int logn(double n){
        int count = 0;
        while(n > 1){
            n = Math.floor(n/2);
            count++;
        }
        return count;
    }
}
