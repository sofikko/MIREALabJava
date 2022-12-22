package lab_30;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.*;

public class IPcheckTest {

    static boolean checkIPTest = false;

    public void checkIP() {
        assertTrue(IPcheck.checkIP("127.0.0.1"));
        assertTrue(IPcheck.checkIP("255.255.255.0"));
        assertFalse(IPcheck.checkIP("1300.6.7.8"));
        assertFalse(IPcheck.checkIP("abc.def.gha.bcd"));
        checkIPTest = true;
        writeCheckIPTestResults();
    }

    static void writeCheckIPTestResults() {
        try {
            FileWriter fw = new FileWriter("src\\lab_31\\CheckIPTestsResults.md");

            fw.write("# Результаты тестирования \n");

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