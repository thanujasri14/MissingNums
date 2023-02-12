import java.util.ArrayList;


public class UniqueEle {
    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,2,3,2,4,1,5,1,6 };
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(list.contains(arr[i])){
                continue;
            }
            else
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
