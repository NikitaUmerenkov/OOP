package sem4.StudentService;

import java.util.ArrayList;
import java.util.List;

import sem4.StudentDomen.Student;
import sem4.StudentDomen.StudentGroup;
import sem4.StudentDomen.UserComparator;

public class StudentGroupService {

    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }

    public List<StudentGroup> getAll()
    {
        return this.groups;
    }
    
    public List<Student> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}