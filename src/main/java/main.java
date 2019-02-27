import ui.TUI;

public class main {
    public static void main(String[] args) {
        utils.SQLGenerator.generateTable();
        TUI ui = new TUI();
        ui.showMenu();
    }
}
