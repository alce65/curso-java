import base.Square;

public class Functions {

    public static Square Foo(Square sqFoo) {
        Square newSq = new Square(sqFoo);
        newSq.side *= 2;
        return newSq;
    }

    public static void main(String[] args) {
        
        Square sq1 = new Square(10);
        Square dSq = Foo(sq1);
        System.out.println(sq1); // side: 10
        System.out.println(dSq); // side: 20
    }
}
