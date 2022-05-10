package java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class RandomData {

    private FileReader source;
    private String line;
    private String[] part;
    private int sum;
    private Random random = new Random();
    public String randImieMeskie() throws IOException {

        sum = 0;
        source = new FileReader("data/ImionaMeskie.csv");
        BufferedReader buffer = new BufferedReader(source);

        int choice = random.nextInt(20391590) + 1;

        while((line = buffer.readLine()) != null){

            part = line.split(",");
            sum += Integer.parseInt(part[2]);

            if(sum>choice){
                break;
            }
        }

        source.close();

        return part[0].charAt(0) + part[0].substring(1).toLowerCase();
    }

    public String randNazwiskoMeskie() throws IOException {

        sum = 0;
        source = new FileReader("data/NazwiskaMeskie.csv");
        BufferedReader buffer = new BufferedReader(source);

        Random random = new Random();

        int choice = random.nextInt(20391590) + 1;

        while((line = buffer.readLine()) != null){

            part = line.split(",");
            sum += Integer.parseInt(part[1]);

            if(sum>choice){

                break;
            }
        }

        source.close();

        return part[0].charAt(0) + part[0].substring(1).toLowerCase();
    }
}
