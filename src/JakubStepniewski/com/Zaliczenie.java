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
        String data = "2017-12-23";
        int ocena;
        int j = 0;
        int marked = 0;
        String Wynik;

        File file = new File("src/data/zaliczenie.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        for(int i = 0; i < records; ) {

            Id_przedmiotu = randomData.RandomNumber(0,29);
            nr_albumu = j;
            nr_wykladowcy = Id_przedmiotu;
            ocena = randomData.RandomNumber(2,5);
            marked = 0;


            termin = 1;
            Wynik = Insert + i + ", " + Id_przedmiotu + ", " + nr_albumu + ", " + nr_wykladowcy + ", " + termin + ", Date '"+ data + "', "+ ocena + ");\n";
            i++;
            writer.print(Wynik);


            if(ocena < 3) {
                ocena = randomData.RandomNumber(2,5);
                termin = 2;
                Wynik = Insert + i + ", " + Id_przedmiotu + ", " + nr_albumu + ", " + nr_wykladowcy + ", " + termin + ", Date '"+ data + "', "+ ocena + ");\n";
                i++;
                writer.print(Wynik);
            }

            if(ocena < 3) {
                ocena = randomData.RandomNumber(2,5);
                termin = 3;
                Wynik = Insert + i + ", " + Id_przedmiotu + ", " + nr_albumu + ", " + nr_wykladowcy + ", " + termin + ", Date '"+ data + "', "+ ocena + ");\n";
                i++;
                writer.print(Wynik);
            }



            j++;



            //System.out.println(Wynik);

        }
        writer.close();
    }
}
