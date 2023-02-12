import java.util.ArrayList;
public class MissingNum {
    public static void main(String[] args) {
     
        int[] arr= new int[]{1, 4, 5, 7, 9};
        ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr[i]+1 != arr[i+1]){
                    list.add(arr[i]+1);
                }
                else
                continue;
            }
            System.out.println(list);
    }
}
