import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;


/*
 * Created by forestnewark on 3/3/17.
 *
 * This is a simple Caesar Cipher program. It allows you to enter a message that it will then encode using a
  * randomly generated cipher key. You can then use
 */
public class Main {

    public static void main(String[] args) {

        menu();

    }
    private static void menu() {
        Scanner pick = new Scanner(System.in);
        System.out.println(C.RED +" Welcome to the simple Caesar Cipher Program" + C.RESET);
        System.out.println(C.CYAN+"-------------------------------------------"+C.RESET);
        System.out.println("        Select One of the Options below");
        System.out.println();
        System.out.println(C.YELLOW+"Option 1: ENCODE a Message");
        System.out.println(C.BLUE+"Option 2: DECODE a Message");
        System.out.println(C.RED+"Option 3: Exit!");
        System.out.println(C.CYAN+"-------------------------------------------"+C.RESET);
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

    private static void encode(){
        System.out.println();
        System.out.println(C.RED + "Welcome to the Message Encoder");
        System.out.println(C.CYAN+"-------------------------------------------"+C.RESET);
        System.out.println(C.GREEN+"Note: This tool will allow you to encode any message using a Caesar Cipher.");
        System.out.println("After providing your message you will be given an encoded message and a Cipher Key to use in decoding your message");
        System.out.println(C.WHITE+"Enter your message: "+C.RESET);
        Scanner sc = new Scanner(System.in);
        Message message = new Message();
        message.shiftNumber = message.generateKey();
        message.messageToEncrypt = sc.nextLine();
        System.out.println("Your Message to Encrypt is: " +  "{" + message.messageToEncrypt + "}");
        message.encodeMessage();
        System.out.println("Encrypted Message is: " + "{" + message.eMessage + "}");
        System.out.println(C.RED+"Your Cipher key is: " + message.shiftNumber);
        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection stringSelection = new StringSelection(message.eMessage);
        clpbrd.setContents(stringSelection, null);
        System.out.println(C.YELLOW+"Your Message has been copied to the clipboard!");
        for (int x =0 ; x<3;x++) {
            System.out.println();
        }

        menu();


    }

    public static void decode() {
        for (int x =0 ; x<3;x++) {
            System.out.println();
        }
        System.out.println(C.CYAN+"***"+C.RED+"Welcome to the Message Decoder"+C.CYAN+"***"+C.RESET);
        System.out.println(C.CYAN+"-------------------------------------------"+C.RESET);
        System.out.println(C.GREEN+"Note: This tool will provide allow you to DECODE any message using a Caesar Cipher.");
        System.out.println("You will will need to provide an encoded message and a cipher key");
        System.out.println(C.RESET+"Enter your message: "+C.RESET);
        Message message = new Message();
        Scanner sc = new Scanner(System.in);
        message.eMessage = sc.nextLine();
        System.out.println("Enter Your Cipher Key");
        message.shiftNumber = sc.nextInt();
        System.out.println(C.CYAN+"---------------------");
        message.decodeMessage();
        System.out.println(C.RESET+"Your Decrypted Message is:" + "{" +C.RED+message.dMessage + C.RESET + "}");
        for (int x =0 ; x<3;x++) {
            System.out.println();
        }
        menu();
        }


    }









