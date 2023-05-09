package sem5.GenericInheriance;

public class User<T,V> {
    private T firstName;
    private T secondName;
    private V age;

    public User(T firstName, T secondName, V age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getSecondName() {
        return secondName;
    }

    public void setSecondName(T secondName) {
        this.secondName = secondName;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}