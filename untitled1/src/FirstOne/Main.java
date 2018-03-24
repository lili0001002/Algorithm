package FirstOne;

import FirstOne.Bolts;

public class Main {

    public static void main(String[] args) {

        Bolts[] Barray = new Bolts[100];
        Nuts[] Narray = new Nuts[100];
        for (int i = 1 ; i <= 100 ; i++) {
            Barray[i].size = i;
            Narray[i].size = 101 - i;
        }
        for (int i =1; i <= 100 ; i++ ) {

        }
        //拿出一个螺母，在螺丝中进行匹配，并将其分为大的一堆和小的一堆，并将匹配完成的挑选出来
        //然后再拿此螺丝将螺母分为两堆，递归此过程
    }
}
