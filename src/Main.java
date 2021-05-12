public class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.chuvi();
        rec.dientich();
        Circle cir = new Circle();
        cir.chuViCircle();
        cir.dienTichCricle();

        Month thang = new Month();
        thang.thang(10);
        thang.thang1(2);

        Quadratic qua = new Quadratic();
        qua.resolve(1,-8,16);

        Triangle tri = new Triangle();
        tri.checkTriangle(-1,2,-8);
    }
}
