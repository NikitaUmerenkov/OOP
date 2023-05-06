package sem4.Controllers;

import sem4.StudentDomen.Student;
import sem4.StudentService.StudentGroupService;
import sem4.StudentService.StudentService;

public class StudentController implements iUserController<Student> {

    private final StudentService dataService = new StudentService();
    private final StudentGroupService groupService = new StudentGroupService();
    
    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }
    
}