import java.util.ArrayList;
import java.util.Scanner;

/*
 * Created by forestnewark on 3/3/17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your message: ");
        int shiftNumber = 2;
        Scanner sc = new Scanner(System.in);
        Message message = new Message();
        message.messageToEncrypt = sc.nextLine();
        System.out.println("Your Message to Encrypt is: " + message.messageToEncrypt);

        //Turn String into Char Array
        char[] charArray = message.messageToEncrypt.toCharArray();

       //Turn Char Array into int Array (called numbArray). Add ShiftNumber
        int[] numbArray = new int[charArray.length];
        for (int count = 0; count < charArray.length; count++) {
            int digit = charArray[count];
            numbArray[count] = digit + shiftNumber;
            System.out.println(digit);
        }

        //Turn Shifted Number Array back to Char Array (ENCODED)
        char[] encodeCharArray = new char[numbArray.length];
        for (int count=0; count < numbArray.length; count++) {
            char letter = (char) numbArray[count];
            encodeCharArray[count] = letter;
            System.out.println(letter);
        }

        String encodedMessage = String.valueOf(encodeCharArray);
        System.out.println("Your Encoded Message is: " +encodedMessage);

        










       //Split string into characters
        /*String[] messageLetters = message.messageToEncrypt.split(("(?!^)"));

        for (int i=0; i < messageLetters.length; i++) {
            System.out.println("Element: " + messageLetters[i]);
        }

        //Convert
        int[] letterNumbers;
        for (int i=0; i < messageLetters.length; i++) {
            char myChar = messageLetters[i];
            int[i] = (int) myChar;

        }
        for (int i=0; i < letterNumbers.length; i++) {
            System.out.println("number: " + letterNumbers[i]);
        }
        */
    }
}
