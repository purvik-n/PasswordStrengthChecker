import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int strength = calculateStrength(password);
        if (strength < 3) {
            System.out.println("Strength: Weak 🔴");
        } else if (strength < 5) {
            System.out.println("Strength: Moderate 🟠");
        } else {
            System.out.println("Strength: Strong 🟢");
        }

        scanner.close();
    }

    private static int calculateStrength(String password) {
        int score = 0;

        if (password.length() >= 8)
            score++;
        if (password.matches(".*[a-z].*"))
            score++;
        if (password.matches(".*[A-Z].*"))
            score++;
        if (password.matches(".*[0-9].*"))
            score++;
        if (password.matches(".*[!@#$%^&*()-+=].*"))
            score++;

        return score;
    }
}
