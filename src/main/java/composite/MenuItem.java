package composite;

class MenuItem implements MenuComponent {
    private String name;

    public MenuItem(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }
}
