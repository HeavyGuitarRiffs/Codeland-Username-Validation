import java.util.*; 
import java.io.*;

class Main {

  public static String CodelandUsernameValidation(String str) {
    // code goes here  
    return str;

       if(str.length() < 4 || str.length() > 25){
      return "false";
    }
    if(!Character.toString(str.charAt(0)).matches("[a-zA-Z]")){
      return "false";
    }
    if(!str.matches("^[a-zA-Z0-9_]*$")){
      return "false";
    }
    if(str.charAt(str.length()-1) == '_'){
      return "false";
    }
    return "true";
  }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}
