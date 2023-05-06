package sem4.Controllers;

import sem4.StudentDomen.Teacher;
import sem4.StudentService.TeacherService;

public class TeacherController implements iUserController<Teacher> {

	private final TeacherService dataTeacherService = new TeacherService();

	@Override
	public void create(String firstName, String secondName, int age) {
		dataTeacherService.create(firstName, secondName, age);
	}
}