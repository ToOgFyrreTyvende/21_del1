package ui;

import java.util.Scanner;

public class TUI {
    // TODO Remove comment when functionality layer is made :)
    //private IFunctionality func;
    private Scanner scan;

    public TUI(/*IFunctionality func*/){
        // TODO Remove comment when func layer is made :)
        //this.func = func;
    }

    public void showMenu(){
        while (true){
            scan = new Scanner(System.in);
            System.out.println("---------------");
            System.out.println("1. Opret bruger");
            System.out.println("2. Vis brugere");
            System.out.println("3. Opdater bruger");
            System.out.println("4. Slet brugere");
            System.out.println("---------------");
            System.out.println("Indtast valg:");

            int userChoice = scan.nextInt();
            System.out.println("\n");
            scan.close();

            switch (userChoice){
                case 1:
                    scan = new Scanner(System.in);
                    System.out.println("|-- Opret bruger -- |");
                    System.out.println("Indtast ønskede userID:");
                    int userID1 = scan.nextInt();
                    System.out.println("Indtast ønskede brugernavn:");
                    String username1 = scan.nextLine();
                    scan.close();
                    System.out.println("Indtast ønskede initialer:");
                    scan = new Scanner(System.in);
                    String ini1 = scan.nextLine();
                    scan.close();
                    System.out.println("Indtast cpr-nummer:");
                    scan = new Scanner(System.in);
                    String cpr1 = scan.nextLine();
                    scan.close();
                    System.out.println("Indtast ønskede password:");
                    scan = new Scanner(System.in);
                    String password1 = scan.nextLine();
                    scan.close();
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
                    scan = new Scanner(System.in);
                    int userID3 = scan.nextInt();
                    scan.close();
                    System.out.println("Indtast nye ønskede brugernavn:");
                    scan = new Scanner(System.in);
                    String username3 = scan.nextLine();
                    scan.close();
                    System.out.println("Indtast nye ønskede initialer:");
                    scan = new Scanner(System.in);
                    String ini3 = scan.nextLine();
                    scan.close();
                    System.out.println("Indtast nye cpr-nummer:");
                    scan = new Scanner(System.in);
                    String cpr3 = scan.nextLine();
                    scan.close();
                    System.out.println("Indtast nye ønskede password:");
                    scan = new Scanner(System.in);
                    String password3 = scan.nextLine();
                    scan.close();
                    System.out.println("Indtast nye ønskede rolle:");
                    scan = new Scanner(System.in);
                    String role3 = scan.nextLine();
                    scan.close();
                    // TODO Update chosen user and print confirmation/error
                    break;
                case 4:
                    System.out.println("|-- Slet bruger -- |");
                    System.out.println("Indtast userID af ønskede bruger");
                    scan = new Scanner(System.in);
                    int userID4 = scan.nextInt();
                    scan.close();
                    // TODO print chosen user for confirmation
                    System.out.println("Ønsker du at slette denne bruger? (Y/n)");
                    scan = new Scanner(System.in);
                    String yesNo = scan.nextLine();
                    scan.close();
                    if (yesNo == "Y"){
                        // TODO run deleteUser method when exists
                    } else {
                        System.out.println("Slet bruger aflyst!\n");
                    }
                    break;
            }
        }
    }

}
