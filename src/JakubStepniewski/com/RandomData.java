package JakubStepniewski.com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class RandomData {

    private FileReader File;
    private String line;
    private String[] part;
    private int sum;
    private Random random = new Random();
    private int range;
    private String source;
    private List<Data> ImieMeskie;

    /*
    public void init() throws IOException {

        FileReader File = new FileReader("src/data/ImionaMeskie.csv");
        BufferedReader buffer = new BufferedReader(File);
        while((line = buffer.readLine()) != null) {
            part = line.split(",");
            ImieMeskie.add(part[0];Integer.parseInt(part[2]))
        }

    }

     */
    public String randImieMeskie() throws IOException {

        sum = 0;
        source = "src/data/ImionaMeskie.csv";
        File = new FileReader(source);
        BufferedReader buffer = new BufferedReader(File);

        int range = setRange(2);

        int choice = random.nextInt(range-1) + 1;

        while((line = buffer.readLine()) != null){

            part = line.split(",");
            sum += Integer.parseInt(part[2]);

            if(sum>choice){
                break;
            }
        }

        File.close();

        return part[0].charAt(0) + part[0].substring(1).toLowerCase();
    }

    public String randNazwiskoMeskie() throws IOException {

        sum = 0;
        source = "src/data/NazwiskaMeskie.csv";
        File = new FileReader(source);
        BufferedReader buffer = new BufferedReader(File);

        Random random = new Random();

        range=setRange(1);

        int choice = random.nextInt(range-1) + 1;

        while((line = buffer.readLine()) != null){

            part = line.split(",");
            sum += Integer.parseInt(part[1]);

            if(sum>choice){

                break;
            }
        }

        File.close();

        return part[0].charAt(0) + part[0].substring(1).toLowerCase();
    }

    public int setRange(int charAt) throws IOException {
        int range = 0;

        File = new FileReader(source);
        BufferedReader buffer = new BufferedReader(File);

        while((line = buffer.readLine()) != null){

            part = line.split(",");
            range += Integer.parseInt(part[charAt]);
        }

        return range;
    }

    public String randImieZenskie() throws IOException {

        sum = 0;
        source = "src/data/ImionaZenskie.csv";
        File = new FileReader(source);
        BufferedReader buffer = new BufferedReader(File);

        int range = setRange(2);

        int choice = random.nextInt(range-1) + 1;

        while((line = buffer.readLine()) != null){

            part = line.split(",");
            sum += Integer.parseInt(part[2]);

            if(sum>choice){
                break;
            }
        }

        File.close();

        return part[0].charAt(0) + part[0].substring(1).toLowerCase();
    }

    public String randNazwiskoZenskie() throws IOException {

        sum = 0;
        source = "src/data/NazwiskaZenskie.csv";
        File = new FileReader(source);
        BufferedReader buffer = new BufferedReader(File);

        Random random = new Random();

        range=setRange(1);

        int choice = random.nextInt(range-1) + 1;

        while((line = buffer.readLine()) != null){

            part = line.split(",");
            sum += Integer.parseInt(part[1]);

            if(sum>choice){

                break;
            }
        }

        File.close();

        return part[0].charAt(0) + part[0].substring(1).toLowerCase();
    }

    public int RandomNumber(int beginning, int end){
        return random.nextInt(beginning,end+1);
    }
}
