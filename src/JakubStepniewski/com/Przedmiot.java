package JakubStepniewski.com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Przedmiot {
    public void generatePrzedmiot(int records) throws IOException {
        String Insert = "INSERT INTO przedmiot VALUES (";
        RandomData randomData = new RandomData();
        randomData.init();

        File file = new File("src/data/przedmiot.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.print("");

        String nazwa;
        String typ;
        String Wynik;

        List<String> nazwyPrzedmiotow = new ArrayList<>();

        nazwyPrzedmiotow.add("Polski");
        nazwyPrzedmiotow.add("Matematyka");
        nazwyPrzedmiotow.add("Fizyka");
        nazwyPrzedmiotow.add("Programowanie w c++");
        nazwyPrzedmiotow.add("Programowanie w c");
        nazwyPrzedmiotow.add("Programowanie obiektowe");
        nazwyPrzedmiotow.add("Bazy dancyh 1");
        nazwyPrzedmiotow.add("Bazy danych 2");
        nazwyPrzedmiotow.add("Sieci");
        nazwyPrzedmiotow.add("Algorytmy");

        int j = 0;
        for(int i = 0; i < nazwyPrzedmiotow.size(); i++) {
            nazwa = nazwyPrzedmiotow.get(i);
            typ = "laboratorium";
            Wynik = Insert + j + ", '" + nazwa + "', '" + typ +"');\n";
            j++;
            writer.print(Wynik);
            typ = "ćwiczenia";
            Wynik = Insert + j + ", '" + nazwa + "', '" + typ +"');\n";
            j++;
            writer.print(Wynik);
            typ = "wykład";
            Wynik = Insert + j + ", '" + nazwa + "', '" + typ +"');\n";
            j++;
            writer.print(Wynik);
        }
        writer.close();

    }
}
