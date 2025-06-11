public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        System.out.println("--- Attempting to add a valid user ---");
        userManager.addUser("example@domain.com", "password123");

        System.out.println("\n--- Attempting to add an invalid user ---");
        userManager.addUser("invalid-email", "1234");
    }
}