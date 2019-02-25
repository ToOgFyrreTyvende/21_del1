package ui;

import java.util.Scanner;

public class TUI {
    // Remove comment when functionality layer is made :)
    //private IFunctionality func;
    private Scanner scan;

    public TUI(/*IFunctionality func*/){
        // Remove comment when func layer is made :)
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
            System.out.println("Indtast valg:\n");
        }
    }

}
