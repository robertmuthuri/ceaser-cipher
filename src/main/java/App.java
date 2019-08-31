import java.io.Console;

public class App {
    public static void main(String[]args){
        Console myConsole = System.console();
        System.out.println("What be you message oh mighty ceaser?");
        String inputText = myConsole.readLine();
        System.out.println("What be-est they key oh majesty?");
        int inputKey = Integer.parseInt(myConsole.readLine());
        Encoding input = new Encoding();
        String cipherText = input.encryptText(inputText, inputKey);
        System.out.println("Here is your encrypted message oh your majesty: " + cipherText);

        Decoding output = new Decoding();
        System.out.println("General, would you like to decrypt his majesty's message? If so enter appropriate key");
        int decryptKey = Integer.parseInt(myConsole.readLine());
        String decryptText = output.decryptText(cipherText, decryptKey);
        System.out.println("General, his majesty's message is: " + decryptText);
    }
}
