package Modul5;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Size : ");
        int[] res = new int[Integer.parseInt(input.nextLine())];

        System.out.print("Input Data : ");
        String[] splitArr = input.nextLine().split(" ");

        float positif = 0, zero = 0, negatif = 0;
        System.out.print("Sort : ");
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
        System.out.printf("Positif  : %.2f\n", positif/res.length);
        System.out.printf("Zero     : %.2f\n", zero/res.length);
        System.out.printf("Negatif  : %.2f\n", negatif/res.length);

    }
}
