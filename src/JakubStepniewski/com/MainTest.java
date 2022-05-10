package JakubStepniewski.com;

import java.io.*;

public class MainTest {
    public static void main(String args[]) throws IOException {

        RandomData randomData = new RandomData();
        String Imie = randomData.randImieMeskie();
        String Nazwisko = randomData.randNazwiskoMeskie();
        System.out.println("Imie: " + Imie);
        System.out.println("Nazwisko: " + Nazwisko);

        Imie = randomData.randImieZenskie();
        Nazwisko = randomData.randNazwiskoZenskie();
        System.out.println("Imie: " + Imie);
        System.out.println("Nazwisko: " + Nazwisko);

        System.out.println(randomData.RandomNumber(25,30));
    }
}
