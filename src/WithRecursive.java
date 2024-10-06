public class WithRecursive {
    public static String logFunc(double n){
        if( n == 0) return "Done";
        n = Math.floor(n /2);
        return logFunc(n);
    }
}
