package FirstOne;

import sun.misc.Compare;

public class Bolts {
    //尺寸属性
    public int size;

    public Bolts (int s) {
        this.size = s;
    }

    public boolean Compare (Nuts n) {
        if (n.size == this.size) {
            return true;
        }
        else {
            return false;
        }
    }


}
