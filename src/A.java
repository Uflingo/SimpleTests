/**
 * Created by ASentsov on 21.06.2017.
 */
public class A {
    public static void main(String[] args) {
        String s1 = new String("ads");
        System.out.println(s1);
        String s2 = new String("ads");
        System.out.println(s1.hashCode());



//        System.out.println("Start");
//        System.out.println(s.hashCode());
//        System.out.println(s);
//        change(s);
//        System.out.println("After change");
//        System.out.println(s.hashCode());
//        System.out.println(s);

    }
    public static void change(String s){
        System.out.println("in method before assigment");
        System.out.println(s.hashCode());
        System.out.println(s);
        s = new String("ads");
        System.out.println("in method after assigment");
        System.out.println(s.hashCode());
        System.out.println(s);

    }
}
