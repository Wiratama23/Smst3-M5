package Modul5;
import java.util.Arrays;
import java.util.Scanner;

public class Tugas1 {
    int[] data;
    public Tugas1(int[] data){
        this.data = data;
    }
    public int[] sorting(int[] data) {
        for (int index = 0; index < data.length; index++) {
            for (int elemen = index + 1; elemen < data.length; elemen++) {
                int temp;
                if (data[elemen] < data[index]) {
                    temp = data[index];
                    data[index] = data[elemen];
                    data[elemen] = temp;
                }
            }
        }
        return data;
    }
    public void Search(int input) {
        String out;
        int i = 0;
        boolean empty = true;
        System.out.print("Index : ");
        while (i < data.length) {
            if (data[i] == input) {
                out = Integer.toString(i);
                System.out.print(out + " ");
                empty = false;
            }
            i++;
        }
        if(empty){
            System.out.println("Index tidak ditemukan");
        }
        System.out.println();

    }
    public void Display() {
        Scanner input = new Scanner(System.in);
        System.out.println("Total data = " + data.length);
        System.out.println("Data : " + Arrays.toString(data));
        System.out.println("Hasil Sorting " + Arrays.toString(sorting(data)));

        System.out.print("Cari : ");
        int i = input.nextInt();
        Search(i);
    }
    public static void main(String[] args) {
        int []data = new int[]{-75,-10,0,30,0,-30,90,70,89,-50,-55,-30};
        Tugas1 tug = new Tugas1(data);
        tug.Display();
    }
}
