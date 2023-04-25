package composite;

import java.util.ArrayList;
import java.util.List;

class Menu implements MenuComponent {
    private List<MenuComponent> items = new ArrayList<>();
    private String name;

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent item) {
        items.add(item);
    }

    public void remove(MenuComponent item) {
        items.remove(item);
    }

    public void display() {
        System.out.println(name);
        for (MenuComponent item : items) {
            item.display();
        }
    }
}









