public class mar15 {

    static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n*fact(n-1);
    }


    static void factV(int n,int res){
        if (n == 1) {
            System.out.println(res);
            return;
        }
        res = res*n;
        factV(n-1, res);
    }
 
    public static void main(String[] args) {
        System.out.println(fact(5));
        factV(5, 1);
    }
}
