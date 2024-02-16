public class pro1 {

    public void goat(int a,int b,int c){
        if(a>b){
            if(a>c){
                System.out.println("a is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greatest");
            }
            else{
                System.out.println("c is greatest");
            }
        }
    }
    public void isPrime(int n){
        if(n==1 || n == 2){
            System.out.println("prime");
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                System.out.println("not a prime");
                return;
            }
        }
        System.out.println("prime");
    }
    public void oddEvenSum(int n){
        int count = 1,oddsum=0,evensum=0,num=0;
        while (n>0) {
            num = n%10;
            n=n/10;
            if(count%2 ==0){
                evensum=evensum+num;
            }
            else{
                oddsum = oddsum+num;
            }
            count++;
        }
        System.out.println("Oddcount = "+ oddsum + " Evencount = "+evensum);
    }

    public void swapPosNum(int n){
       int num=0,pos=1;
       double plac=0;
       while (n>0) {
        num = n%10;
        plac = plac + (int)pos*Math.pow(10,num-1);
        n=n/10;
        pos++;
       }
       System.out.println((int)plac);
    }
    public static void main(String[] args) {
        pro1 obj = new pro1();
        obj.swapPosNum(32145);
    }
}
