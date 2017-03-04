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

        }

        //Turn Shifted Number Array back to Char Array (ENCODED)
        char[] encodeCharArray = new char[numbArray.length];
        for (int count=0; count < numbArray.length; count++) {
            char letter = (char) numbArray[count];
            encodeCharArray[count] = letter;

        }

        String encodedMessage = String.valueOf(encodeCharArray);
        System.out.println("Your Encoded Message is: " +encodedMessage);
        System.out.println("Your Cipher Key is: " + shiftNumber);

        //encoded Message to Char Array
        char[] decodeCharArray = encodedMessage.toCharArray();

        //Turn Char Array (encoded) into int Array (called decodeNumbArray). SUBTRACT ShiftNumber
        int[] decodeNumbArray = new int[decodeCharArray.length];
        for (int count = 0; count < decodeCharArray.length; count++) {
            int digit = decodeCharArray[count];
            decodeNumbArray[count] = digit - shiftNumber;

        }

        //Turn UN-Shifted Number Array back to Char Array (DECODED)
        char[] decodedCharArray = new char[decodeNumbArray.length];
        for (int count=0; count < decodeNumbArray.length; count++) {
            char letter = (char) decodeNumbArray[count];
            decodedCharArray[count] = letter;

        }

        String decodedMessage = String.valueOf(decodedCharArray);
        System.out.println("Your Decoded Message is: " + decodedMessage);










    }
}
