import java.io.Console;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
    public static void main(String[]args){
        String inputText = " ";
        Console myConsole = System.console();
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What be you message oh mighty ceaser?");
         try{
             inputText = bufferedReader.readLine();
             System.out.println("What be-est they key oh majesty?");
             int inputKey = Integer.parseInt(bufferedReader.readLine());
             Encoding input = new Encoding();
             String cipherText = input.encryptText(inputText, inputKey);
             System.out.println("Here is your encrypted message oh your majesty: " + cipherText);

             Decoding output = new Decoding();
             System.out.println("General, would you like to decrypt his majesty's message? If so enter appropriate key");
             int decryptKey = Integer.parseInt(bufferedReader.readLine());
             String decryptText = output.decryptText(cipherText, decryptKey);
             System.out.println("General, his majesty's message is: " + decryptText);
         }
         catch(IOException e) {
             e.printStackTrace();
        }
    }
}
