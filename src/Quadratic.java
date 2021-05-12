public class Quadratic {
    void resolve(double a, double b,double c){
        double denta = Math.pow(b,2) - 4*a*c;
        if (denta < 0){
            System.out.println("Phương trình vô nghiệm!");
        }
        else if (denta ==0){
            System.out.println("Phương trình có 1 nghiệm x1=x2 = " + (-b)/(2*a) );
        }
        else{
            System.out.println("Phương trình có 2 nghiệm là: ");
            System.out.println("x1 = " + ((-b)+Math.sqrt(denta))/(2*a));
            System.out.println("x2 = " + ((-b)-Math.sqrt(denta))/(2*a));
        }
    }
}
