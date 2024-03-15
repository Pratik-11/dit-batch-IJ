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

    static void printTable(int n, int res){
        if(res == 0){
            return;
        }
        printTable(n, res-1);
        System.out.println(n + " x " + res + " = " + n*res);
    }

    static String printTableString(int n,int res){
        if(res == 0){
            return " ";
        }
        String result =  printTableString(n, res-1);
        String s = (n + " x " + res + " = " + n*res + "\n") ;
        result = result + s;
        // System.out.println(s);
        return result;
    }

    static void PlallinDrom(int n,int reverse, int orig){
        if( n == 0){
            System.out.println(reverse == orig);
            return;
        }
        reverse = (reverse*10 + n%10);
        PlallinDrom(n/10,reverse,orig);
    }

    static boolean PlallinDromB(int n,int reverse, int orig){
        if( n == 0){
            return (reverse == orig);
        }
        reverse = (reverse*10 + n%10);
        return PlallinDromB(n/10,reverse,orig);
    }
 
    public static void main(String[] args) {
        // System.out.println(fact(5));
        // factV(5, 1);
        // printTable(5, 10);
        System.out.println(printTableString(5, 10));
        PlallinDrom(101,0,101);
        System.out.println(PlallinDromB(101,0,101));
    }
}
