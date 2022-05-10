package JakubStepniewski.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zaliczenie {
    public void generateZaliczenie(int records) throws FileNotFoundException {
        String Insert = "INSERT INTO zaliczenie VALUES (";
        RandomData randomData = new RandomData();
        int Id_przedmiotu;
        int nr_albumu;
        int nr_wykladowcy;
        int termin;
        String data = "Date '2017-12-23'";
        int ocena;
        int j = 0;

        File file = new File("src/data/zaliczenie.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        for(int i = 0; i < records; ) {

            Id_przedmiotu = randomData.RandomNumber(0,29);
            nr_albumu = i;
            nr_wykladowcy = i;
            ocena = randomData.RandomNumber(2,5);


            if(ocena > 2) {
                termin = 1;
                String Wynik = Insert + i + ", " + Id_przedmiotu + ", " + nr_albumu + ", " + nr_wykladowcy + ", " + termin + ", "+ data + ", "+ ocena + ");\n";
                i++;
                writer.print(Wynik);
            }else {
                ocena = randomData.RandomNumber(2,5);
            }

            if(ocena > 2) {
                termin = 2;
                String Wynik = Insert + i + ", " + Id_przedmiotu + ", " + nr_albumu + ", " + nr_wykladowcy + ", " + termin + ", "+ data + ", "+ ocena + ");\n";
                i++;
                writer.print(Wynik);
            }else {
                ocena = randomData.RandomNumber(2,5);
            }

            if(ocena > 2) {
                termin = 3;
                String Wynik = Insert + i + ", " + Id_przedmiotu + ", " + nr_albumu + ", " + nr_wykladowcy + ", " + termin + ", "+ data + ", "+ ocena + ");\n";
                i++;
                writer.print(Wynik);
            }



            //System.out.println(Wynik);

        }
        writer.close();
    }
}
