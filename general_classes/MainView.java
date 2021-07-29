/*package general_classes;


import model.repository.UserRepository;
import model.repository.UserRepositoryImpl;
import view.EventView;


import java.io.IOException;
import java.util.Scanner;


public class MainView {

        UserRepository userRepository2 = UserRepositoryImpl.getInstance();

    public MainView() throws Exception {
    }

    public static void main(String[] args) throws Exception {
        MainView welcomeHit = new MainView();
        welcomeHit.Run();
    }


        public  void Run() throws Exception {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Welcome!");
                System.out.println("1. Sign in");
                System.out.println("2. Sign up");
                System.out.println("3. change password");
                System.out.println("Q. Exit");
                String selectedOption = scanner.nextLine();
                switch (selectedOption) {
                    case "1":
                        userRepository2.showall();
                        System.out.print("Write your Email: ");
                        String email = scanner.nextLine();
                        System.out.print("Write your password: ");
                        String password = scanner.nextLine();
                        boolean check = userRepository2.validateuser(email, password);
                        if (check == true) {
                            System.out.println("yay! welcome");
                            System.out.println(Session.getInstance().isadmin());
                            event();
                        } else {
                            System.out.println("Entered wrong credentials");
                            break;
                        }
                    case "2":
                        userRepository2.showall();
                        System.out.print("Write your Name: ");
                        String namenew = scanner.nextLine();
                        System.out.print("Write your Email: ");
                        String emailnew = scanner.nextLine();
                        System.out.print("Write your password (leangh of password needs to be 8 or more): ");
                        String passwordnew = scanner.nextLine();
                        System.out.println("Write your type of job by number");
                        System.out.println("1.campign manger,2.city headquarter manager,3.member of party,4.volunteer,5.technical support,6.telephone receptionist");
                        String typeofjob = scanner.nextLine();
                        System.out.println("Write your Telephone");
                        String telephone = scanner.nextLine();
                       // userRepository2.Enteruser(namenew, emailnew, passwordnew, typeofjob, telephone);
                        System.out.println("new user added!!");
                        break;
                    case "3":
                        System.out.print("Write your Email: ");
                        String emailforget = scanner.nextLine();
                        System.out.print("Write your new password: ");
                        String passwordforget = scanner.nextLine();
                        boolean check1 = userRepository2.changepassword(emailforget, passwordforget);
                        if (check1 == true) {
                            userRepository2.showall();
                        } else {
                            System.out.println("try again for now bye bye..");
                            break;
                        }
                    case "Q":
                    case "q":

                    default:
                        System.out.println("Goodbye");
                        System.exit(0);


                }


            }
        }


        public static void event() throws IOException, ClassNotFoundException {
        EventView welcomeHit = new EventView();
        welcomeHit.Eventscliimpl();
    }
}

*/