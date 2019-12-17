package data_access;

import data_access.Course.Course;
import data_access.Course.CourseDaoList;
import data_access.Student.Student;
import data_access.Student.StudentDaoList;

import java.time.LocalDate;
import java.util.Scanner;

public class RunAccess {
    private StudentDaoList studentDaoList = new StudentDaoList();
    private CourseDaoList courseDaoList = new CourseDaoList();
    private Student student3 = new Student("Cai", "hemma@live.se", "heemma");
    private Course course3 = new Course("Java", LocalDate.parse("2019-09-29"), 15);

    public void School() {
        Scanner scanner = new Scanner(System.in);
        boolean play = true;
        while (play) {

            System.out.println("SchoolManagement" + scanner.nextLine());
            System.out.println("[1] Create Student & Create Course " + " [2] Register Student To Course & Remove Student From Course ");
            System.out.println("[3] Find Student   & Find Course   " + " [4] Edit Students              & Edit Courses ");
            System.out.println("--------------------------------------------[5] Exit-------------------------------------------");

            String menu = scanner.nextLine();
            switch (menu) {

            }
        }
    }

    public static void main(String[] args) {
        RunAccess run = new RunAccess();
        run.School();
    }
}
