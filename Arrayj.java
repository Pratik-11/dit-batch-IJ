public class Arrayj {

    static int[] arrOccurenceHelper(int[] arr,int index, int count,int element){   
        if(index == arr.length){
            int[] arr1 = new int[count];
            return arr1;
        }
        if(arr[index] == element){
            count++;
        }
        int[] arr1 = arrOccurenceHelper(arr, index+1, count, element);
        if(arr[index] == element){
            arr1[count-1] = index;
            count--;
        }
        return arr1;
    }

    // static String revStringHelper(String str,int count){

    // }

    static String revString(String str){
        if(str == ""){
            return " ";
        }
        String r = revString(str.substring(1));
        r = r + str.charAt(0);
        return r;
    }

    static int[] arrOccurence(int[] arr,int index,int element){
        return arrOccurenceHelper(arr, index, 0, element);
    }
    public static void main(String[] args) {
        // int[] arr = { 1,2,3,2,3,2,3,2,2,2};
        // for(int i : arrOccurence(arr, 0, 2)){
        //     System.out.println(i);
        // }
        System.out.println(revString("abcd"));
    }
}
