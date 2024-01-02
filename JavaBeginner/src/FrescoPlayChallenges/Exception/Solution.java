package FrescoPlayChallenges.Exception;

class InvalidMessageException extends Exception {

    public InvalidMessageException(String message) {
        super(message);
    }

    @Override
    public String toString(){
        return "InvalidMessageException: " + getMessage();
    }
}

class Encrypter{

    public static String encryptMessage(String message) throws InvalidMessageException {
        String encryptedMessage = "";
        if(message.length()<=100 && Validator.validate(message)){
            for (char c : message.toCharArray()) {
                encryptedMessage = c + encryptedMessage;
            }
            return encryptedMessage.toLowerCase();
        }else{
            throw new InvalidMessageException("Try again with valid message");
        }
    }
}

class Validator {
    public static boolean validate(String message) {
        return message.matches("[A-Za-z0-9 ]+");
    }
}

public class Solution {

    public static void main(String[] args) {
        String message = "Kate Wins?let";

        try {
            String encrypted_message = Encrypter.encryptMessage(message);
            if(! encrypted_message.startsWith("InvalidMessageException"))
                System.out.println(encrypted_message);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}