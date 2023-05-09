package sem5.StudentMVCApp.Controller;

import java.util.List;
import sem5.StudentMVCApp.Model.Student;

/** интерфейс для всех любых вью */
public interface iGetView {
    void printAllStudent(List<Student> students);
    String prompt(String message);
}