package Modul5;

import java.util.*;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Size : ");
        int size = Integer.parseInt(input.nextLine());

        System.out.print("Input Data : ");
        String data;
        data = input.nextLine();
        String[] splitArr = data.split(" ");

        float positif = 0, zero = 0, negatif = 0;
        int[] res = new int[size];
        System.out.println("Result :");
        for (int i = 0; i < splitArr.length; i++) {
            res[i] = Integer.parseInt(splitArr[i]);
            if (res[i] < 0){
                negatif++;
            } else if (res[i] == 0){
                zero++;
            } else if (res[i] > 0) {
                positif++;
            }
        }

        Arrays.sort(res);
        System.out.println(Arrays.toString(res));

        System.out.printf("Positif  : %.2f\n", positif/size);
        System.out.printf("Zero     : %.2f\n", zero/size);
        System.out.printf("Negatif  : %.2f\n", negatif/size);

    }
}
