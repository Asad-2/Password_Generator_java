import java.util.Random;
import java.util.Scanner;
public class Password_Generator {

    public static String generatePassword(int length, String characterSet) {
        Random random = new Random(); //used to generate Random Number
        StringBuilder password = new StringBuilder();  // used to store password

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            char randomChar = characterSet.charAt(index);
            password.append(randomChar);
        }

        return password.toString();
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your password Length: ");
            int length = scanner.nextInt();

            System.out.println("Enter the character that you want to used in Password: ");
            String Password_Character = scanner.next();

            String generatedPassword = generatePassword(length, Password_Character);
            System.out.println("Generated Password: " + generatedPassword);
        }





}
