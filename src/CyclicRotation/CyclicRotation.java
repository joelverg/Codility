package CyclicRotation;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class CyclicRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 4;
        if(arr.length == k){
            System.out.println("Return the int[] arr");
            System.exit(0);
        }else {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();

            for(int i = 0; i < arr.length; i++){
                arrayList.add(arr[i]);
            }

            ArrayList<Integer> newArrayList = new ArrayList<Integer>();
            for (int i = 0; i < (arrayList.size()-(k-1)); i++){
                newArrayList.add(arrayList.get((k-1)+i));
            }
            ArrayList<Integer> bagoArrayList1 = new ArrayList<Integer>();

            for(int i = 0; i < newArrayList.size(); i++){
                bagoArrayList1.add(newArrayList.get(i));
            }

            for (int i = 0; i < (arrayList.size() - newArrayList.size()); i++){
                bagoArrayList1.add(arr[i]);
            }

            int[] x = new int[bagoArrayList1.size()];
            for (int i=0; i < x.length; i++)
            {
                x[i] = bagoArrayList1.get(i).intValue();
                System.out.println(x[i]);
            }
        }

    }
}
