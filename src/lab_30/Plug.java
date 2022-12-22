package lab_30;

import java.io.FileWriter;
import java.io.IOException;

public class Plug {
    static void writeResults() {
        try {
            FileWriter fw = new FileWriter("src\\lab_31\\TestResults.md");

            fw.write("# Результаты тестирования \n");

            fw.write("## Тест factorial()\n");
            if (MathFTest.factorialTest) {
                fw.write("Тесты прошли успешно\n");
            }
            else {
                fw.write("Тесты прошли неудачно\n");
            }

            fw.write("## Тест pow()\n");
            if (MathFTest.powTest) {
                fw.write("Тесты прошли успешно\n");
            }
            else {
                fw.write("Тесты прошли неудачно\n");
            }

            fw.write("## Тест checkIP()\n");
            if (IPcheckTest.checkIPTest) {
                fw.write("Тесты прошли успешно\n");
            }
            else {
                fw.write("Тесты прошли неудачно\n");
            }

            System.out.println("Результаты успешно записаны");
            fw.flush();
        }
        catch (IOException e) {
            System.out.println("Ошибка: \n" + e.getMessage());
        }
    }
}