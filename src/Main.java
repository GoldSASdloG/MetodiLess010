import java.util.Scanner;

public class Main {

    static int addTwo (int a) {
        a += 5;
        System.out.println("Значение int a = " + a);
        return a;
    }

    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner in = new Scanner (System.in);

        String number = in.next ();
        int result = Integer. parseInt (number);

        System.out. println ("Значение result = " + result);
        result = 10; //берем и переписываем резулт на 10 зачем я не знаю

        result = addTwo (result) ;
        System. out.println (addTwo (result));
        System. out. println (result);

    }
}