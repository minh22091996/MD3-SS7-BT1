package rikkei.academy;

public class Main {

    public static void main(String[] args) {
	Shape[] doituong = new Shape[3];
    doituong[0] = new Rectangle();
    doituong[1] = new Square();
    doituong[2] = new Circle();

        System.out.println("Circle");
        System.out.println("truoc khi thay doi " +((Circle) doituong[2]).getRadius());
        ((Circle) doituong[2]).reside(5);
        System.out.println("sau khi thay doi " +((Circle) doituong[2]).getRadius());

        System.out.println("Rectangle");
        System.out.println("truoc khi thay doi " +((Rectangle) doituong[0]).getArea());
        ((Rectangle) doituong[0]).reside(7);
        System.out.println("sau khi thay doi " +((Rectangle) doituong[0]).getArea());

        System.out.println("Square");
        System.out.println("truoc khi thay doi " +((Square) doituong[1]).getArea());
        ((Square) doituong[1]).reside(7);
        System.out.println("sau khi thay doi " +((Square) doituong[1]).getArea());





    }
}
//        for (Shape index : doituong ) {
//
//            if(index instanceof Circle ){
//                System.out.println("truoc khi thay doi");
//                System.out.println(doituong[2]);
//                IResizeable iResizeable = (Circle) index;
//                iResizeable.reside(4);
//                System.out.println( "sau khi thay doi circle: \n" + index);
//            }if(index instanceof Rectangle){
//                System.out.println("truoc khi thay doi");
//                System.out.println(doituong[0]);
//               IResizeable iResizeable = (Rectangle) index;
//               iResizeable.reside(5);
//                System.out.println("sau khi thay doi rectangle : \n" + index);
//            }if(index instanceof Square){
//                System.out.println("truoc khi thay doi");
//                System.out.println(doituong[1]);
//                IResizeable iResizeable = (Square) index;
//                iResizeable.reside(7);
//                System.out.println("sau khi thay doi square" + index);
//            }
//        }