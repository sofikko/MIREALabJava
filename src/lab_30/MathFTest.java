package lab_30;

import org.junit.Assert;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class MathFTest {
    static boolean factorialTest=false;
    static boolean powTest=false;

    public void pow() {
        Assert.assertEquals(1, MathF.pow(5, 0));
        Assert.assertEquals(27,MathF.pow(3,3));
        Assert.assertEquals(144,MathF.pow(12,2));
        Assert.assertEquals(49,MathF.pow(-7,2));
        Assert.assertEquals(-1024,MathF.pow(-4,5));
        powTest=true;
        writeMathFTestResults();
    }

    public void factorial() {
        Assert.assertEquals(1,MathF.factorial(0));
        Assert.assertEquals(1,MathF.factorial(1));
        Assert.assertEquals(2,MathF.factorial(2));
        Assert.assertEquals(6,MathF.factorial(3));
        Assert.assertEquals(24,MathF.factorial(4));
        Assert.assertEquals(120,MathF.factorial(5));
        factorialTest=true;
        writeMathFTestResults();
    }

    static void writeMathFTestResults() {
        try {
            FileWriter fw = new FileWriter("src\\lab_31\\MathTestsResults.md");

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

            System.out.println("Результаты успешно записаны");
            fw.flush();
        }
        catch (IOException e) {
            System.out.println("Ошибка: \n" + e.getMessage());
        }
    }
}