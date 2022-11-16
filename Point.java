
package javaapplication7;

public class Point {
    private double x, y;
    private double length;
   
    private int id;
    private static int counter = 0;
            
            

    public Point() {
        this(0, 0);
    }
    
    

    public Point(double x, double y) {
        setXY(x, y);
        id = counter++;
    }

    
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
        length();
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
        length();
    }
    public final void setXY(double x, double y){
        setX(x);
        setY(y);
        
    }
    public double getLength() {
        return length;
    }

    public static int getCounter() {
        return counter;
    }

    
    

    @Override
    public String toString() {
        return id + ": (" + x + ", " + y + ")";
    }
    public Point addTo(Point rValue){
        return new Point(this.x + rValue.x,this.y + rValue.y);
    }
    private void length(){
        length = Math.sqrt(x*x + y*y);
}
}