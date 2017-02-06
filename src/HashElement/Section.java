package HashElement;


public class Section {
    Dot A;
    Dot B;

    public Section() {
        A = new Dot();
        B = new Dot();
        while (A.getX() == B.getX() && A.getY() == B.getY()) {
            A = new Dot();
            B = new Dot();
        }
    }

    @Override
    public String toString() {
        //return "A: ("+A.getX()+","+A.getY()+"); B: "+B.getX()+","+B.getY();
        return String.format("A(%3d,%3d); B(%3d,%3d)", A.getX(), A.getY(), B.getX(), B.getY());
    }

    public double lengthSection() {
        //A = √ ((X2-X1)²+(Y2-Y1)²).
        return Math.sqrt(Math.pow((B.getX() - A.getX()), 2) + Math.pow((B.getY() - A.getY()), 2));
    }

    public int angleOX() {
        //tg f= ((y2-y1)/(x2-x1))
        //return (int)(Math.tan((B.getY()-A.getY())/(B.getX()-A.getX())));
        if (B.getY() == A.getY()) {
            return 0;
        } else if (A.getX() == B.getX()) {
            return 90;
        }
        else {
            float fi = ((float) (B.getY() - A.getY()) / (B.getX() - A.getX()));
            if (fi<0){
                return (int)(fi*(-1));
            }
            else return (int)(fi);
        }
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;

        Section section = (Section) o;

//        if (A != null ? !A.equals(section.A) : section.A != null) return false;
//        return B != null ? B.equals(section.B) : section.B == null;
        if (((Section) o).getA().getX()==A.getX()&&
                ((Section) o).getA().getY()==A.getY()&&
                ((Section) o).getB().getX()==B.getX()&&
                ((Section) o).getB().getY()==B.getY()){
            return true;
        }
        return false;
    }


    public Dot getA() {
        return A;
    }

    public Dot getB() {
        return B;
    }
}
