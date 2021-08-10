package BinaryGap;

import java.util.ArrayList;

public class BinaryGap {
    public static void main(String[] args) {
        int N = 32;
        String binaryString = Integer.toBinaryString(N);
        String str[] = binaryString.split("");
        ArrayList<String> arr = new ArrayList<String>();

        for(int i = 0; i < str.length; i++){
            arr.add(str[i]);
        }

        System.out.println(arr);
        int counter1 =0;
        int counter2 = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals("0")){
                counter1++;
            }
            else{
                if(counter1 > counter2){
                    counter2 = counter1;
                }
                counter1 = 0;
            }
        }
        System.out.println(counter2);


    }
}
