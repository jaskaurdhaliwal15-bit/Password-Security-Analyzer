import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Storeimf {

    private final LocalDateTime time;
    int Score;
    String strength;
    String isBreach ;

    Storeimf( LocalDateTime time, int Score ,String strength ,String isBreach ){
        this.time = time;
        this.Score = Score;
        this.strength = strength;
        this.isBreach = isBreach;

    }
    
       void file(){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
         String formattedTime = this.time.format(formatter);


        String name = "C:\\Users\\user\\OneDrive\\Documents\\store log.txt";

        try( FileWriter file = new FileWriter(name, true);
        BufferedWriter bw = new BufferedWriter(file)){

            bw.write(formattedTime + " | "+ " Score " + this.Score +  "/10 "+ " | "+ " Strength " + this.strength + " | "+ " Breach: " + this.isBreach);
            bw.newLine();


        }

        catch(FileNotFoundException e){
            System.out.println("File is not found");
        }

        catch(IOException e){
            System.out.println("Something is wrong");
        }

      }

}
