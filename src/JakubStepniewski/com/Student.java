package JakubStepniewski.com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Student {
    public void generateStudent(int records) throws IOException {
        String Insert = "INSERT INTO student (nr_albumu, imie, nazwisko, wiek, nr_gr) VALUES (";
        RandomData randomData = new RandomData();
        randomData.init();
        String Imie;
        String Nazwisko;
        int Wiek;
        int Nr_gr;

        File file = new File("src/data/student.txt");
        PrintWriter writer = new PrintWriter(file);
        writer.print("");

        for(int i = 0; i < records; i++) {
            if (randomData.RandomNumber(1, 2) == 1) {
                Imie = randomData.randImieMeskie();
                Nazwisko = randomData.randNazwiskoMeskie();
            } else {
                Imie = randomData.randImieZenskie();
                Nazwisko = randomData.randNazwiskoZenskie();
            }

            Wiek = randomData.RandomNumber(18,26);
            Nr_gr = randomData.RandomNumber(0,999);

            String Wynik = Insert + i + ", '" + Imie + "', '" + Nazwisko + "', '" + Wiek + "', " + Nr_gr +");\n";

            //System.out.println(Wynik);
            writer.print(Wynik);

        }
        writer.close();
    }
}
