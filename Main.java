import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        int choice = 0;
        int total;
        boolean Found;
        String bre;
        String str;

        System.out.println("************************");
        System.out.println("Welcome to password analyzer");
        System.out.println("****************************");


        while(choice != 2){

            System.out.println("Choose one");
            System.out.println("1.Analyz password");
            System.out.println("2.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
            System.out.println("Enter your password");
            password = sc.nextLine();

            PasswordStructure ps = new PasswordStructure(password);
            PasswordBreach  pb = new PasswordBreach(password);

            int strength =  ps.strengthCheck() ;
            int Breachpoints = pb.CheckBreach();

            total = strength + Breachpoints;

            if(Breachpoints == 4){

                Found = true;

                System.out.println("Password was not found in breaches list");

            }

            else{
                Found = false;

                System.out.println("Password was found in breached list");
            }

            System.out.println("Total points " + total);


            
        if(total >= 8){

            str = "Very strong";
            System.out.println(str);
        }


        else if (total >= 6){

            str = "Strong";
            System.out.println(str);
        }
            else if(total >= 4){

                str = "Medium";
                System.out.println(str);
            }     
            else{

                str = "weak";
                System.out.println(str);
            } 
            LocalDateTime dateTime = LocalDateTime.now(); 

            System.out.println(dateTime);

            if(Found){
                bre = "NO";
            }

            else{

                bre = "YES";
            }
            Storeimf Store = new Storeimf(dateTime, total, str,bre );

            Store.file();

        }

       }    

       System.out.println("Bye! Have a nice day");
        
        



        sc.close();
    }
    
}
