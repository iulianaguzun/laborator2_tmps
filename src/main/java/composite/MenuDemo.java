package composite;

public class MenuDemo {
    public static void main(String[] args) {
        Menu menu = new Menu("Main composite.Menu");
        Menu submenu = new Menu("Submenu");

        // Add leaf elements to the submenu
        submenu.add(new MenuItem("Submenu item 1"));
        submenu.add(new MenuItem("Submenu item 2"));

        // Add the submenu to the main menu
        menu.add(submenu);

        // Add more leaf elements to the main menu
        menu.add(new MenuItem("Main menu item 1"));
        menu.add(new MenuItem("Main menu item 2"));

        // Display the entire menu
        menu.display();
    }
}






