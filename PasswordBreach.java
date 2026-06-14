import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

public class PasswordBreach{

    String Password;
    boolean isFound = false;

    PasswordBreach(String Password){
        this.Password = Password;
    }



        private static  HashSet<String> breach = null;

        public static void loadFile(){  // to load file

                 String filename = "C:\\Users\\user\\OneDrive\\Desktop\\10k-most-common.txt";

                breach = new HashSet<>();

            try(BufferedReader br = new BufferedReader(new FileReader(filename))){
                String line;
                while((line = br.readLine()) != null){
                    breach.add(line.trim().toLowerCase());
                }
        }


        catch(FileNotFoundException e){
            System.out.println("File was not found");
        }


        catch(IOException e){
            System.out.println("somethong went wrong");
        }


       }

       int CheckBreach(){  // to check breach

        if(breach == null){
            loadFile();

        }

        if(breach.contains(this.Password.toLowerCase())){
            isFound = true;

        }

        if(!isFound){

            return 4;

        }

        else{
            return 0 ;
        }

        
    }

}

    

