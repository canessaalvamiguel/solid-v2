interface Shape{
    double area();
}

class Square implements Shape{
    @Override
    public double area() {
        //A = a^2
        return 0.0;
    }
}

class Triangle implements Shape{
    @Override
    public double area() {
        //A = h * b / 2
        return 0.0;
    }
}

public class OpenClose {
    public static void main(String[] args){
        Square square = new Square();
        Triangle triangle = new Triangle();
    }

    static Double calculateArea(Shape o){
        return o.area();
    }
}