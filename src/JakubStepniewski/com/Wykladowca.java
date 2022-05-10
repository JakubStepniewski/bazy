package JakubStepniewski.com;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Wykladowca {
   public void GenerateWykladowca() throws IOException {
       String Insert = "INSERT INTO wykladowca (nr_wykl, imie, nazwisko, stopien) VALUES (";
       RandomData randomData = new RandomData();
       String Imie;
       String Nazwisko;
       String Stopien;

       File file = new File("src/data/test.txt");
       PrintWriter writer = new PrintWriter(file);
       writer. print("");

       for(int i = 0; i<100; i++){
           if(randomData.RandomNumber(1,2) == 1){
               Imie = randomData.randImieMeskie();
               Nazwisko = randomData.randNazwiskoMeskie();
           }else{
               Imie = randomData.randImieZenskie();
               Nazwisko = randomData.randNazwiskoZenskie();
           }

           switch (randomData.RandomNumber(1,3)){

               default:
                   Stopien = "mgr";
                   break;

               case 1:
                   Stopien = "dr";
                   break;

               case 2:
                   Stopien = "prof";
                   break;
           }


           String Wynik = Insert + i + ", '" + Imie + "', '" + Nazwisko + "', '" + Stopien + "');\n";

           //System.out.println(Wynik);
           writer.print(Wynik);

       }

       writer.close();
   }
}
