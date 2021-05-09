import java.lang.Math;
public class Circle {
    int r = 8;
    double chuViCircle(){
        double f;
        f = 2*r*Math.PI;
        System.out.println("Chu vi hình tròn là: " + f);
        return f;
    }
    double dienTichCricle(){
        double g;
        g = Math.pow(r,2)*Math.PI;
        System.out.println("Diện tích hình tròn là: " + g);
        return g;
    }
}
