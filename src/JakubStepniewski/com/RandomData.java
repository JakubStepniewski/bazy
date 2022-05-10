package JakubStepniewski.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class RandomData {

    private FileReader File;
    private String line;
    private String[] part;
    private int sum;
    private Random random = new Random();
    private int range;
    private ArrayList<Data> imionaMeskie = new ArrayList<>();
    private ArrayList<Data> nazwiskaMeskie = new ArrayList<>();
    private ArrayList<Data> imionaZenskie = new ArrayList<>();
    private ArrayList<Data> nazwiskaZenskie = new ArrayList<>();


    public void init() throws IOException {

        FileReader File = new FileReader("src/data/ImionaMeskie.csv");
        BufferedReader buffer = new BufferedReader(File);
        while ((line = buffer.readLine()) != null) {
            part = line.split(",");
            Data data = new Data();
            data.setNazwa(part[0]);
            data.setLiczba(Integer.parseInt(part[2]));
            imionaMeskie.add(data);
        }

        File = new FileReader("src/data/ImionaZenskie.csv");
        buffer = new BufferedReader(File);
        while ((line = buffer.readLine()) != null) {
            part = line.split(",");
            Data data = new Data();
            data.setNazwa(part[0]);
            data.setLiczba(Integer.parseInt(part[2]));
            imionaZenskie.add(data);
        }

        File = new FileReader("src/data/NazwiskaMeskie.csv");
        buffer = new BufferedReader(File);
        while ((line = buffer.readLine()) != null) {
            part = line.split(",");
            Data data = new Data();
            data.setNazwa(part[0]);
            data.setLiczba(Integer.parseInt(part[1]));
            nazwiskaMeskie.add(data);
        }

        File = new FileReader("src/data/NazwiskaZenskie.csv");
        buffer = new BufferedReader(File);
        while ((line = buffer.readLine()) != null) {
            part = line.split(",");
            Data data = new Data();
            data.setNazwa(part[0]);
            data.setLiczba(Integer.parseInt(part[1]));
            nazwiskaZenskie.add(data);
        }
    }

    public String randImieMeskie(){
        range = 0;
        sum = 0;
        for(int i = 0 ; i < imionaMeskie.size() ; i++){
            range += imionaMeskie.get(i).getLiczba();
        }

        int choice = random.nextInt(range);

        for(int i = 0 ; i < imionaMeskie.size() ; i++){
            sum += imionaMeskie.get(i).getLiczba();
            if(choice < sum){
                return imionaMeskie.get(i).getNazwa();
            }
        }

        return "Błąd";
    }

    public String randImieZenskie(){
        range = 0;
        sum = 0;
        for(int i = 0 ; i < imionaZenskie.size() ; i++){
            range += imionaZenskie.get(i).getLiczba();
        }

        int choice = random.nextInt(range);

        for(int i = 0 ; i < imionaZenskie.size() ; i++){
            sum += imionaZenskie.get(i).getLiczba();
            if(choice < sum){
                return imionaZenskie.get(i).getNazwa();
            }
        }

        return "Błąd";
    }

    public String randNazwiskoMeskie(){
        range = 0;
        sum = 0;
        for(int i = 0 ; i < nazwiskaMeskie.size() ; i++){
            range += nazwiskaMeskie.get(i).getLiczba();
        }

        int choice = random.nextInt(range);

        for(int i = 0 ; i < nazwiskaMeskie.size() ; i++){
            sum += nazwiskaMeskie.get(i).getLiczba();
            if(choice < sum){
                return nazwiskaMeskie.get(i).getNazwa();
            }
        }

        return "Błąd";
    }

    public String randNazwiskoZenskie(){
        range = 0;
        sum = 0;
        for(int i = 0 ; i < nazwiskaZenskie.size() ; i++){
            range += nazwiskaZenskie.get(i).getLiczba();
        }

        int choice = random.nextInt(range);

        for(int i = 0 ; i < nazwiskaZenskie.size() ; i++){
            sum += nazwiskaZenskie.get(i).getLiczba();
            if(choice < sum){
                return nazwiskaZenskie.get(i).getNazwa();
            }
        }

        return "Błąd";
    }


    public int RandomNumber(int beginning, int end){
        return random.nextInt(beginning,end+1);
    }
}
