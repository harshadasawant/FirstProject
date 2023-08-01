import java.io.IOException;

public class ExceptionExample {

    void show() throws IOException{
//       throw new IOException();
//        System.out.println("After throw");

    }
    void show1() throws ArithmeticException{
        throw new ArithmeticException();
    }
    void show2() throws MyException{
        throw new MyException();
    }


    public static void main(String[] args) throws IOException {
        ExceptionExample obj = new ExceptionExample();

//        try {
////            obj.show();
////            obj.show2();
//        }catch(IOException | ArithmeticException  e){
//            e.printStackTrace();
//        }
        System.out.println("after try");
//        try {
//            obj.show1();
//        }catch(RuntimeException e){
//            e.printStackTrace();
//        }
        System.out.println("after runtime exception");

        String s = null;
        System.out.println(s.equals("Hello"));

    }
}

class MyException extends RuntimeException{

}
