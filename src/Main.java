import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
       int[] arr={10,20,20,10,10,20,5,20};
       List<Integer> frequency=new ArrayList<>();
       int counter=0;
        System.out.println("array:"+Arrays.toString(arr));
        System.out.println("tekrar sayıları:");

       for (int i=0;i<arr.length;i++){
           for (int j=0;j<arr.length;j++){
               if ( arr[i]==arr[j] ){
                    counter++;


               }

           }
           if (!(frequency.contains(arr[i]))&& counter>0){
               frequency.add(arr[i]);
               System.out.println(arr[i]+" sayısı "+counter+"  kere tekrar edildi");
           }
            counter=0;

       }



    }
}