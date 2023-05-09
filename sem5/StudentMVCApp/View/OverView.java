package sem5.StudentMVCApp.View;

import java.util.List;
import java.util.Scanner;

import sem5.StudentMVCApp.Controller.iGetView;
import sem5.StudentMVCApp.Model.Student;

/** Абстрактный класс. Предок для русского View и английского ViewEng */
public abstract class OverView implements iGetView{

    /** Вывод списка студентов */
    public void printAllStudent(List<Student> students)
    {
        /** в абстрактном классе можно и не наполнять метод */
        System.out.println("----------");
        for(Student person :students)
        {
            System.out.println(person);
        }
        System.out.println("XXXXXXXXXX");
    }

    /** Вывод сообщения message и чтение строки из консоли */
    public String prompt(String message) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(message);
            return in.nextLine();
        }
    }


}