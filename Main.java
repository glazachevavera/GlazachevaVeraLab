import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // Считывание четырех целых чисел
        int X = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        // Вмещается ли первый пакет в контейнер
        if (X >= A)
            // Вмещается ли второй пакет в контейнер при лежащем в нем первом пакете
            if (X-A >= B)
                // Вмещается ли третий пакет в контейнер при лежащих в нем первом и втором пакетах
                if (X-A-B >= C)
                    out.print(0);
                else
                    out.print(1);
            else
                // Вмещается ли третий пакет в контейнер при лежащем в нем первом пакете
                if (X-A >= C)
                    out.print(1);
                else
                    out.print(2);
        else
            // Вмещается ли второй пакет в контейнер
            if (X >= B)
                // Вмещается ли третий пакет в контейнер при лежащем в нем втором пакете
                if (X-B >= C)
                    out.print(1);
                else
                    out.print(2);
            else
                // Вмещается ли третий пакет в контейнер
                if (X >= C)
                    out.print(2);
                else
                    out.print(3);
    }
}
