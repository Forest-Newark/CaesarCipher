import java.util.ArrayList;
import java.util.Scanner;

/*
 * Created by forestnewark on 3/3/17.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter your message: ");

        Scanner sc = new Scanner(System.in);
        Message message = new Message();
        message.shiftNumber = message.generateKey();
        message.messageToEncrypt = sc.nextLine();


        System.out.println("Your Message to Encrypt is: " +  "{" + message.messageToEncrypt + "}");
        message.encodeMessage();
        System.out.println("Encrypted Message is: " + "{" + message.eMessage + "}");
        System.out.println("Your Cipher key is: " + message.shiftNumber);

        System.out.println("Now Decoding Message");
        System.out.println("......");
        System.out.println("......");
        System.out.println("Your Decoded Message is: " + message.decodeMessage());


    }
}
