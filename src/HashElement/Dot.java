package HashElement;

/**
 * Created by Home on 04.02.2017.
 */
public class Dot {
    final int x,y;

    public Dot(){
        x=(int)(Math.random()*50);
        y=(int)(Math.random()*50);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
