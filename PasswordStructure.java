public class PasswordStructure {

    String password ;
    boolean isUpperCase = false;
    boolean islowerCase = false;
    boolean specialChar = false;
    boolean isDigit = false;
    int point = 0;
    PasswordStructure(String password){

        this.password = password;

    }

     int strengthCheck(){

        for(int i = 0 ; i < this.password.length() ; i++){
            char ch = this.password.charAt(i);

            if(Character.isUpperCase(ch)){
                isUpperCase = true;
            }

            else if (Character.isLowerCase(ch)){
                islowerCase = true;
            }

            else if (Character.isDigit(ch)){
                isDigit = true;
            }

            else{
                specialChar = true;
            }



        }

        if(isUpperCase){
            point++;
        }

        if(islowerCase){
            point++;
        }

        if(isDigit){
            point++;
        }
        if(specialChar){
            point++;
        }

        if( this.password.length() >= 12){
            point+= 2;
        }

        else if(this.password.length() >= 8){
            point++;
        }



        return point;


    }
    
}
