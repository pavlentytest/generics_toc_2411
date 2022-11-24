public class Main {
    public static void main(String[] args) {

        Student<Integer> ivan = new Student<Integer>("Ivan", 482823);
        Student<String> olga = new Student<String>("Olga","N23423DF");
        Student<Character> petr = new Student<Character>("Petr",'A');

    }
}
class Student<V> {
    private String name;
    private V id;

    public Student(String name, V id) {
        this.name = name;
        this.id = id;
    }

    public V getId() {
        return id;
    }
}