package JakubStepniewski.com;

import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        /*
        RandomData randomData = new RandomData();

        randomData.init();

        String Imie = randomData.randImieMeskie();
        String Nazwisko = randomData.randNazwiskoMeskie();
        System.out.println(Imie + " " + Nazwisko);

         */


        Wykladowca wykladowca = new Wykladowca();
        wykladowca.GenerateWykladowca(100);



    }
}
