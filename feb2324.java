public class feb2324 {
    static void namePrint(int n){
        if(n==0){
            return;
        }
        System.out.println("Pratik");
        namePrint(n-1);
        System.out.println("Pr");
    }

    static void sumOfDigits(int n,int sum){
        if (n == 0) {
            System.out.println("Sum of digits = " +sum );
            return;
        }
        else{
            sumOfDigits(n/10,sum+n%10);
        }
    }

    static void sumOddEven(int n,int odd,int even){
        if (n == 0) {
            System.out.println("ODD = "+ odd +" EVEN = "+ even);
            return;
        }
        else{
            if(n%2 == 0){
                sumOddEven(n-1, odd, even+n);
            }
            else{
                sumOddEven(n-1, odd+n, even);
            }
        }
    }

    static int sumEvenOdd(int n){
        if(n == 0){
            return 0;
        }
        else{
            if(n%2 == 0){
                return even+n;
            }
            else{
                return odd+n;
            }
        }
    }



    public static void main(String[] args) {
        sumOfDigits(11221,0);
        sumOddEven(3, 0, 0);
        int range =4;
        // for(int row = 1 ; row < range ; row ++){
        //     for(int col = 1 ; col <  ; col ++){
        //         if( (row + col) % 2 == 0 ){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println(" ");
        // }
        for(int row = 0 ; row < range ; row ++){
            for(int space = 1 ; space < range - row ; space ++){
                System.out.print(" ");
            }
            int odd = 2*row +1;
            for(int star = 0 ; star < odd ; star ++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
