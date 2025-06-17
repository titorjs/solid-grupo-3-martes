package srp;

public class UserManager {
    private final UserValidator validator;
    private final UserRepository repository;
    private final NotificationService notificationService;

    public UserManager() {
        this.validator = new UserValidator();
        this.repository = new UserRepository();
        this.notificationService = new NotificationService();
    }

    public void addUser(String email, String password) {
        if (validator.validateUser(email, password)) {
            repository.save(email, password);
            notificationService.sendWelcomeEmail(email);
        } else {
            System.out.println("Invalid email or password. User not added.");
        }
    }
}