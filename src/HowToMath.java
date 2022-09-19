public class HowToMath {

    public static void main(String[] args) {
        // +
        // -
        // *
        // / -- quotient
        // % -- remainder
        System.out.println(5/2);
        System.out.println(5%2);
        System.out.println(5.0/2);


        // Order of Ops
        // ()
        // Unary ops: ! ++ -- and - (negation)
        // * / %
        // + -
        // = += -= *= /= %=
        // ,

        int num =10;
        System.out.println(num);

        num = num + 5;
        System.out.println(num);

        num = 7 + 10 * 2;
        System.out.println(num);

        num *= 2;       //  num = num * 2;
        System.out.println(num);

        num /= 5;
        System.out.println(num);

        num++;      //adds 1
        System.out.println(num);

        num--;      //subtracts 1
        System.out.println(num);


        // casting
        int one = 11;
        int two = 5;
        double dec = (double)one/two;

        System.out.println(dec);
    }
}
