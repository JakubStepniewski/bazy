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
        wykladowca.generateWykladowca(30);

        Student student = new Student();
        student.generateStudent(3500);

        Zaliczenie zaliczenie = new Zaliczenie();
        zaliczenie.generateZaliczenie(3500,29);

        Przedmiot przedmiot = new Przedmiot();
        przedmiot.generatePrzedmiot();



    }
}
