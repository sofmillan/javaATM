public class User {
    private String name;
    private int age;
    private int id;
    private int category;
    private int password;

    public User(String name, int age, int id, int category, int password) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.category = category;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public int getCategory() {
        return category;
    }

    public int getPassword() {
        return password;
    }
}
