package ui;

import functionality.IUserFunctionality;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TUI {
    // TODO Remove comment when functionality layer is made :)
    private IUserFunctionality func;
    private Scanner scan;
    private boolean keepGoing = true;
    //private boolean validUserChoice = true;

    public TUI(IUserFunctionality func){
        // TODO Remove comment when func layer is made :)
        this.func = func;
    }

    public void showMenu(){
        while (keepGoing){
            scan = new Scanner(System.in);
            int userChoice;

            System.out.println("---------------");
            System.out.println("1. Opret bruger");
            System.out.println("2. Vis brugere");
            System.out.println("3. Opdater bruger");
            System.out.println("4. Slet brugere");
            System.out.println("0. Afslut program");
            System.out.println("---------------");
            System.out.println();
            System.out.println("Indtast valg: ");

            try {
                userChoice = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Indtast venligst et tal!\n");
                showMenu();
                break;
            }

            System.out.println();

            switch (userChoice){
                case 1:
                    System.out.println("|-- Opret bruger -- |");
                    System.out.println("Indtast ønskede userID:");
                    int userID1 = scan.nextInt();

                    System.out.println("Indtast ønskede brugernavn:");
                    String username1 = scan.next();

                    System.out.println("Indtast ønskede initialer:");
                    String ini1 = scan.next();

                    System.out.println("Indtast cpr-nummer:");
                    String cpr1 = scan.next();

                    System.out.println("Indtast ønskede password:");
                    String password1 = scan.next();
                    System.out.println();

                    // -------------------- Testing -------------------- //
                    System.out.println("|------- Testing -------|");
                    System.out.println("Bruger indtastning var:");
                    System.out.println("userID:\t\t" + userID1);
                    System.out.println("username:\t" + username1);
                    System.out.println("ini:\t\t" + ini1);
                    System.out.println("cpr:\t\t" + cpr1);
                    System.out.println("pass:\t\t" + password1);
                    // ---------------------- End ---------------------- //

                    // TODO Run createUser method here when created
                    // TODO Confirm/report success/failure
                    break;
                case 2:
                    System.out.println("|-- Vis brugere --|");
                    // TODO Get list of users
                    // TODO Print list
                    break;
                case 3:
                    System.out.println("|-- Opdater brugere --|");
                    System.out.println("Indtast userID af ønskede bruger:");
                    int userID3 = scan.nextInt();
                    System.out.println("Indtast nye ønskede brugernavn:");
                    String username3 = scan.next();
                    System.out.println("Indtast nye ønskede initialer:");
                    String ini3 = scan.next();
                    System.out.println("Indtast nye cpr-nummer:");
                    String cpr3 = scan.next();
                    System.out.println("Indtast nye ønskede password:");
                    String password3 = scan.next();
                    System.out.println("Indtast nye ønskede rolle:");
                    String role3 = scan.next();

                    // -------------------- Testing -------------------- //
                    System.out.println("|------- Testing -------|");
                    System.out.println("userID:\t\t" + userID3);
                    System.out.println("username:\t" + username3);
                    System.out.println("ini:\t\t" + ini3);
                    System.out.println("cpr:\t\t" + cpr3);
                    System.out.println("pass:\t\t" + password3);
                    System.out.println("role:\t\t" + role3);
                    // ---------------------- End ---------------------- //
                    // TODO Update chosen user and print confirmation/error
                    break;
                case 4:
                    System.out.println("|-- Slet bruger -- |");
                    System.out.println("Indtast userID af ønskede bruger");
                    int userID4 = scan.nextInt();
                    // TODO print chosen user for confirmation
                    System.out.println("Ønsker du at slette denne bruger? (Y/n)");
                    String yesNo = scan.next();
                    if ("Y".equals(yesNo)){
                        // TODO run deleteUser method when exists
                    } else {
                        System.out.println("Slet bruger aflyst!\n");
                    }
                    // -------------------- Testing -------------------- //
                    System.out.println("|------- Testing -------|");
                    System.out.println("ID:\t\t" + userID4);
                    System.out.println("Y/n:\t" + yesNo);
                    // ---------------------- End ---------------------- //
                    break;
                case 0:
                    System.out.println("|-- Afslut program --|");
                    System.out.println("Bye bye!");
                    keepGoing = false;
                    break;
                default:
                    System.out.println("|-- Indtast venligst en valid mulighed fra listen! --|\n");
                    break;
            }
        }
        // TODO Run something that ensures data doesn't die maybe?
        // TODO (Not sure) Close any connections still open?
    }

}
