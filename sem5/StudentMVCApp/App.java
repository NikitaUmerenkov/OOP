package sem5.StudentMVCApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sem5.StudentMVCApp.Controller.Controller;
import sem5.StudentMVCApp.Controller.iGetModel;
import sem5.StudentMVCApp.Controller.iGetView;
import sem5.StudentMVCApp.Model.FileRepo;
import sem5.StudentMVCApp.Model.Model;
import sem5.StudentMVCApp.Model.ModelHashMap;
import sem5.StudentMVCApp.Model.Student;
import sem5.StudentMVCApp.View.View;
import sem5.StudentMVCApp.View.ViewEng;

public class App {
    public static void main(String[] args) throws Exception {

       List<Student> students = new ArrayList<Student>();
       Student s1 = new Student("Сергей", "Иванов", 21, (long)101);
       Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
       Student s3 = new Student("Иван", "Петров", 22, (long)121);
       Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
       Student s5 = new Student("Даша", "Цветкова", 25, (long)171);
       Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);

       
       FileRepo fileRepo = new FileRepo("StudentDb.txt");
    //    for(Student pers :students)
    //    {
    //     fileRepo.addStudent(pers);
    //    }
    //    fileRepo.saveAllStudentToFile();
    
      iGetModel model = new Model(students);
      iGetModel modelFileRepo = fileRepo;
      iGetModel modelHashMap = new ModelHashMap(students);

      

      // ---подключение View или ViewEng
      iGetView view = new View();
      iGetView viewEng = new ViewEng();
      
      try (Scanner in = new Scanner(System.in)) {
         boolean flagLangInput = true;
         int num = -1;
         while (flagLangInput) {
            System.out.print("Продолжить на русском (1 - да, 0 - переключение на ViewEng): ");
            if (in.hasNextInt()){
               num = in.nextInt();
               System.out.println(num);
               if (num == 0 || num == 1) {
                  flagLangInput = false;
               }
            }
         }

         if (num == 0) {
            view = viewEng;
         }
         // --------------------
      }
      Controller control = new Controller(view, modelHashMap);
      control.run();
      // control.updateView();
       
    }
}