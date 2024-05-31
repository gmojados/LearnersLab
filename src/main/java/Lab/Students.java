package Lab;

public final class Students extends People {
    private static final Students INSTANCE = new Students();
    Person student1;
    Person student2;

    private Students() {
        student1 = new Person(1, "s1");
        student2 = new Person(2, "s2");

        add(student1);
        add(student2);
    }

    public static Students getInstance(){
        return INSTANCE;
    }

}
