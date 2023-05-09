package sem5.StudentMVCApp.View;

import java.util.List;
import sem5.StudentMVCApp.Model.Student;

public class ViewEng extends OverView {

    /** переопределение вывода для английской версии */
    @Override
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-----Output students list-----");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("-----End of students list-----");
    }
}