
/**
 * Write a description of class OrderedPair here.
 *
 * @Alyssa Xu
 * @version (a version number or a date)
 */
public class OrderedPair{
    double x;
    double y;
    public OrderedPair (){
        x = 0;
        y = 0;
    }

    public OrderedPair(double a, double b){
        x = a;
        y=b;
    }

    public String toString() {
        return "(" + x + "," + y + " ) " ;
    }

    public double getX(){
        return y; 

    }

    public double getY(){
        return x;
    }
}
