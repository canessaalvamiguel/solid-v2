class Square{
}

class Triangle{
}

public class OpenClose {
    public static void main(String[] args){
        Square square = new Square();
        Triangle triangle = new Triangle();
    }

    static Double calculateArea(Object o){
        if( o  instanceof Square){
            //A = a^2
            return 0.0;
        }
        if( o instanceof Triangle){
            //A = h * b / 2
            return 0.0;
        }
        return 0.0;
    }
}