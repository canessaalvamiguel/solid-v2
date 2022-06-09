class Square_ {

}

class Triangle_ {

}

public class No_OpenClose{
    public static void main(String[] args){
        Square_ square = new Square_();
        Triangle_ triangle = new Triangle_();
    }
    static Double calculateArea(Object o){
        if( o instanceof Square_){
            //A = a^2
            return 0.0;
        }

        if( o instanceof Triangle_){
            //A = h * b / 2
            return 0.0;
        }

        return 0.0;
    }
}