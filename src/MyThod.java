

import java.security.PublicKey;

public class MyThod {

    public static void main(String[] args) {
    MyThod m = new MyThod();
////        Câu 1
//        sum();
    m.Hello();
        int data = m.sum(10, 30);
        System.out.println(data);
    }

//    public static void sum () {
//        String a = "Name";
//        System.out.println("Ket qua = " + a.repeat(10));

    public void Hello () {
        System.out.println("Xin chao cac ban" );
    }

    public static int sum (int a, int b) {
        int data = a+ b;
        return a+ b;
    }

//    }

//    public static void bum () {
//        String b = "Hai";
////        System.out.println("Ket qua tra ve " + b.split("-",10));
//    }

//    public int Test (int a, int b) {
//        int P = a + b;
//        return P;
//    }
    }


