package sem4.Controllers;

import sem4.StudentDomen.User;

public interface iUserController<T extends User> {
    void create(String firstName, String secondName, int age);
}