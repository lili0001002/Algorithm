package SecondOne;

import java.util.Random;

public class Sort {
    public static void main (String[] args) {
        //生成随机数数组
        int [] ints = new int[100];
        for (int i = 1 ; i <= 100 ; i ++) {
            ints[i-1] = i;
        }
        for (int j = 100 ; j > 0 ; j -- ) {
            int random = new Random().nextInt(j);
            int x;
            x = ints[j-1];
            ints[j-1] = ints[random];
            ints[random] = x;
         }
         QuickSort(ints,0,99);
        for (int kk: ints
             ) {
            System.out.println(kk);
        }
    }
    public static void QuickSort (int[] a ,int low , int high ) {
        if (low < high) {
            int p = Partition(a,low,high);
            QuickSort(a,low,p-1);
            QuickSort(a,p+1,high);
        }
    }
    public static  int Partition(int[] a ,int low ,int high) {
        int p = a[low];
        while (low < high) {
            while (low < high && a[high] > p) --high;
            a[low] = a[high];
            while (low < high && a[low] < p) ++ low;
            a[high] = a[low];
        }
        a[low] = p;
        return low;
    }
}
