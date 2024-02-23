public class feb2324 {
    static void namePrint(int n){
        if(n==0){
            return;
        }
        System.out.println("Pratik");
        namePrint(n-1);
    }



    public static void main(String[] args) {
        namePrint(5);
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
