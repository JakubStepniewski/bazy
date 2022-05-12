package JakubStepniewski.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Zaliczenie {
    public void generateZaliczenie(int records,int maxIdPrzedmiotu) throws FileNotFoundException {
        String Insert = "INSERT INTO zaliczenie VALUES (";
        RandomData randomData = new RandomData();
        int Id_przedmiotu;
        int nr_albumu;
        int nr_wykladowcy;
        int termin;
        String data = "2022-6-12";
        int ocena;
        int i = 0;
        String Wynik;
        int dataRandom = 0;
        int sizePrzedmioty = 30;


        String daty[][] = new String[sizePrzedmioty][3];
        for(int k = 0; k<sizePrzedmioty ; k++){
            do{
                dataRandom = randomData.RandomNumber(1,14);
            }while (dataRandom == 4 || dataRandom == 5 || dataRandom == 11 || dataRandom == 12);
            daty[k][0] = "2022-6-" + dataRandom;

            do{
                dataRandom = randomData.RandomNumber(15,29);
            }while (dataRandom == 16 || dataRandom == 18 || dataRandom == 19 || dataRandom == 25 || dataRandom == 26);
            daty[k][1] = "2022-6-" + dataRandom;

            do{
                dataRandom = randomData.RandomNumber(1,14);
            }while (dataRandom == 3 || dataRandom == 4 || dataRandom == 10 || dataRandom == 11);
            daty[k][2] = "2022-9-" + dataRandom;
        }



        File file = new File("src/data/zaliczenie.csv");
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        for(int j = 0; j < records; ) {

            //Id_przedmiotu = randomData.RandomNumber(0,maxIdPrzedmiotu);
            Id_przedmiotu = 0;
            nr_albumu = j;
            nr_wykladowcy = Id_przedmiotu;


            for(Id_przedmiotu = 0;Id_przedmiotu <30;Id_przedmiotu++){

                ocena = randomData.RandomNumber(2,5);
                termin = 1;
                Wynik = i + "," + Id_przedmiotu + "," + nr_albumu + "," + nr_wykladowcy + "," + termin + ","+ daty[Id_przedmiotu][termin-1] + ","+ ocena + "\n";
                i++;
                writer.print(Wynik);


                if(ocena < 3) {
                    ocena = randomData.RandomNumber(2,5);
                    termin = 2;
                    Wynik = i + "," + Id_przedmiotu + "," + nr_albumu + "," + nr_wykladowcy + "," + termin + ","+ daty[Id_przedmiotu][termin-1] + ","+ ocena + "\n";
                    i++;
                    writer.print(Wynik);
                }

                if(ocena < 3) {
                    ocena = randomData.RandomNumber(2,5);
                    termin = 3;
                    Wynik = i + "," + Id_przedmiotu + "," + nr_albumu + "," + nr_wykladowcy + "," + termin + ","+ daty[Id_przedmiotu][termin-1] + ","+ ocena + "\n";
                    i++;
                    writer.print(Wynik);
                }


            }
            j++;
            //System.out.println(Wynik);

        }
        writer.close();
    }
}
