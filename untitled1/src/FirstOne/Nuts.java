package FirstOne;

import FirstOne.Bolts;

public class Nuts{

    public int size;

    public Nuts (int s)
    {
        this.size = s;
    }
    public boolean Compare (Bolts b) {
        if (this.size == b.size) {
            return true;
        }
        else {
            return false;
        }
    }
}
