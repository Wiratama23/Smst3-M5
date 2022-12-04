package Modul5;

import java.util.*;

public class Tugas2 {
    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(-75,-10,0,30,0,-30,90,70,89,-50,-55,-30));
        //sort
        data.sort(Comparator.naturalOrder());
        System.out.println("Hasil Sort : "+data);

        //find element
        ListIterator<Integer> itr = data.listIterator();
        Scanner input = new Scanner(System.in);
        System.out.print("\nInput Element : ");
        int a = input.nextInt();
        System.out.print("Index : ");
        while(itr.hasNext()){
            if(itr.next().equals(a)){
                System.out.print((itr.nextIndex()-1)+ " ");
            }
        }
        System.out.println();
    }
}
