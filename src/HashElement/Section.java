package HashElement;

/**
 * Created by Home on 04.02.2017.
 */
public class Section {
    Dot A;
    Dot B;

    public Section(){
        A= new Dot();
        B= new Dot();
        if(A.getX()==B.getX()&&A.getY()==B.getY()){
            A= new Dot();
            B= new Dot();
        }
    }

    @Override
    public String toString() {
        //return "A: ("+A.getX()+","+A.getY()+"); B: "+B.getX()+","+B.getY();
        return String.format("A (%d, %d); B (%d, %d)",A.getX(),A.getY(),B.getX(),B.getY());
    }

    public double lengthSection(){
        //A = √ ((X2-X1)²+(Y2-Y1)²).
        return Math.pow((B.getX()-A.getX()),2)+ Math.pow((B.getY()-A.getY()),2);
    }

    public double angleOX(){
        //tg f= ((y2-y1)/(x2-x1))
        return Math.tan((B.getY()-A.getY())/(B.getX()-A.getX()));
    }
}
