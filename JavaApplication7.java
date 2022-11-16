
package javaapplication7;


public class JavaApplication7 {

  
    public static void main(String[] args) {
        
        Point p1 = new Point();
        p1.setXY(-1, 1);
        //System.out.println(p1.getX() + " " + p1.getY());
        System.out.println(p1 + ", lenght = " + p1.getLength());
        
        Point p2 = new Point(4, 3);
        System.out.println(p2 + ", length = " + p2.getLength());
        
        Point p3 = p1.addTo(p2);
        System.out.println(p3);
        
        Point p4 = new Point(3, 4);
        if(Points.equals(p3, p4)) System.out.println("OK");
    }
    
}
