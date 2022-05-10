package java;

import java.io.*;

public class MainTest {
    public static void main(String args[]) throws IOException {

        RandomData randomData = new RandomData();
        String Imie = randomData.randImieMeskie();
        System.out.println(Imie);

        String Nazwisko = randomData.randNazwiskoMeskie();
        System.out.println(Nazwisko);
    }
}
