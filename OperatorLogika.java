public class OperatorLogika {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && a); //true && true --> output: true
        System.out.println(a && b); //true && flase --> output: flase
        System.out.println(b && a); //flase && true --> output: flase
        System.out.println(b && b); //flase && true --> output: flase
    }
}
