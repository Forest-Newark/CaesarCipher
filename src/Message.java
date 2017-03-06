import java.util.Random;

/*
 * Created by forestnewark on 3/3/17.
 */
public class Message {
    String messageToEncrypt;
    String eMessage;
    String dMessage;
    int shiftNumber;

    //Generate cipherKey
    public int generateKey() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }

    //Encode Method
    public String encodeMessage() {

        //Turn String into Char Array
        char[] toEncodeCharArray = messageToEncrypt.toCharArray();

        //Turn Char Array into int Array (called numbArray). Add ShiftNumber
        int[] encodeNumberArray = new int[toEncodeCharArray.length];
        for (int count = 0; count < toEncodeCharArray.length; count++) {
            int digit = toEncodeCharArray[count];
            encodeNumberArray[count] = digit + shiftNumber;

        }

        //Turn Shifted Number Array back to Char Array (ENCODED)
        char[] encodedCharArray = new char[encodeNumberArray.length];
        for (int count=0; count < encodeNumberArray.length; count++) {
            char letter = (char) encodeNumberArray[count];
            encodedCharArray[count] = letter;

        }

        this.eMessage = String.valueOf(encodedCharArray);
        return eMessage;
    }

    //Decode Method
    public String decodeMessage() {

        //encoded Message to Char Array
        char[] toDecodeCharArray = this.eMessage.toCharArray();

        //Turn Char Array (encoded) into int Array (called decodeNumbArray). SUBTRACT ShiftNumber
        int[] toDecodeNumberArray = new int[toDecodeCharArray.length];
        for (int count = 0; count < toDecodeCharArray.length; count++) {
            int digit = toDecodeCharArray[count];
            toDecodeNumberArray[count] = digit - shiftNumber;

        }

        //Turn UN-Shifted Number Array back to Char Array (DECODED)
        char[] decodedCharArray = new char[toDecodeNumberArray.length];
        for (int count=0; count < toDecodeNumberArray.length; count++) {
            char letter = (char) toDecodeNumberArray[count];
            decodedCharArray[count] = letter;

        }

        String decodedMessage = String.valueOf(decodedCharArray);
        this.dMessage = decodedMessage;
        return dMessage;
    }





}
