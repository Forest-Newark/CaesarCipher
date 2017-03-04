import java.util.ArrayList;
import java.util.Scanner;

/*
 * Created by forestnewark on 3/3/17.
 */
public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) {
        menu();

    }
    public static void menu() {
        Scanner pick = new Scanner(System.in);
        System.out.println("Welcome to the simple Caesar Cipher Program");
        System.out.println("-------------------------------------------");
        System.out.println("Select One of the Options below");
        System.out.println("Option 1: ENCODE a Message");
        System.out.println("Option 2: DECODE a Message");
        System.out.println("Option 3: Exit!");
        System.out.println("-------------------------------------------");
        System.out.println("Enter your selection here: ");
        int menuPick =pick.nextInt();
        if (menuPick == 1) {
            encode();
        }else if (menuPick == 2) {
            decode();
        }else {
            System.out.println("Goodbye");
            System.exit(0);
        }

    }

    public static void encode() {
        System.out.println("Welcome to the Message Encoder");
        System.out.println("Enter your message: ");
        Scanner sc = new Scanner(System.in);
        Message message = new Message();
        message.shiftNumber = message.generateKey();
        message.messageToEncrypt = sc.nextLine();
        System.out.println("Your Message to Encrypt is: " +  "{" + message.messageToEncrypt + "}");
        message.encodeMessage();
        System.out.println("Encrypted Message is: " + "{" + message.eMessage + "}");
        System.out.println("Your Cipher key is: " + message.shiftNumber);
        menu();


    }

    public static void decode() {
        System.out.println("Welcome to the Message Encoder");
        Message message = new Message();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Message: ");
        message.eMessage = sc.nextLine();
        System.out.println("Enter Your Cipher Key");
        message.shiftNumber = sc.nextInt();
        System.out.println("---------------------");
        message.decodeMessage();
        System.out.println("Your Decrypted Message is:" + "{" + message.dMessage + "}");
        menu();

    }






}
