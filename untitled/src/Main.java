import enums.Classes;
import enums.Courses;
import enums.Gender;
import enums.Religion;

import java.util.Scanner;

public class Main {
    static Principal principal = new Principal();
     static Students student = new Students();
     static NonAcademicStaff nonAcademicStaff = new NonAcademicStaff();
     static Teacher teacher = new Teacher();
    static AdmissionApplicants admissionApplicant = new AdmissionApplicants();
    static Scanner scanner = new Scanner(System.in);

    public static void checkName(int role, String name){
        switch (role){
            case 1:
                principal.name = name;
                break;
            case 2:
                student.name = name;
                break;
            case 3:
                teacher.name = name;


                break;
            case 4:
                nonAcademicStaff.name = name;
                break;
            default:
                System.out.println("Wrong option selected");
        }

    }
    public static void checkAge(int role, int age){
        switch (role){
            case 1:
                principal.age = age;
                break;
            case 2:
                student.age = age;
                break;
            case 3:
                teacher.age = age;
                break;
            case 4:
                nonAcademicStaff.age = age;

                break;
            default:
                System.out.println("Wrong option selected");
        }

    }
    public static void assignGender(int role, Gender gender){
        switch (role){
            case 1:
                principal.gender = gender;
                break;
            case 2:
                student.gender = gender;
                break;
            case 3:
                teacher.gender = gender;
                break;
            case 4:
                nonAcademicStaff.gender = gender;
                break;
            default:
                System.out.println("Wrong option selected");
        }

    }
    public static void assignReligion(int role, Religion religion){
        switch (role){
            case 1:
                principal.religion = religion;
                break;
            case 2:
                student.religion = religion;
                break;
            case 3:
                teacher.religion = religion;
                break;
            case 4:
                nonAcademicStaff.religion = religion;

                break;
            default:
                System.out.println("Wrong option selected");
        }

    }
    public static void outputFunction(int role){
        System.out.print("Enter your Name: ");
        String name = scanner.next();
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter your Gender(MALE/FEMALE): ");
        Gender gender = Gender.valueOf(scanner.next().toUpperCase());
        System.out.print("Enter your Religion(CHRISTIAN/MUSLIM/PAGAN): ");
        Religion religion = Religion.valueOf(scanner.next().toUpperCase());
        checkName(role, name);
        checkAge(role, age);
        assignGender(role,gender);
        assignReligion(role,religion);
    }
    public static void giveFunction(int role){

        switch (role){
            case 1:
                System.out.print("Enter your email: ");
                principal.setEmail(scanner.next());
                System.out.print("Enter your phone number: ");
                principal.setPhoneNumber(scanner.nextInt());
                System.out.print("Enter your Staff ID: ");
                principal.setSchoolId(scanner.next());
                System.out.print("Enter your years of experience: ");
                principal.setYearsOfExperience(scanner.nextInt());
                System.out.println();
                System.out.println("Welcome " + principal.name);
                System.out.println("""
                        What do you want to do today
                        1. Admit Student
                        2. Expel Student
                        3. Employ Staff
                        4. Terminate Staff
                        """
                );
                int option = scanner.nextInt();

                switch (option){
                    case 1:
                        Principal.admitStudent(admissionApplicant);
                        break;
                    case 2:
                        Principal.expelStudent(role,student);
                        break;
                    case 3:
                        Principal.employStaff(role,teacher,nonAcademicStaff);
                        break;
                    case 4:
                        Principal.terminateStaff(role,teacher,nonAcademicStaff);
                        break;
                    default:
                        System.out.println("You selected a wrong option");
                }
                System.out.println("Principal name is " + principal.name);
                System.out.println("Principal age is "+ principal.age);
                System.out.println("Principal gender is "+ principal.gender);
                System.out.println("Principal religion is "+ principal.religion);
                System.out.println("Principal email is "+ principal.getEmail());
                System.out.println("Principal phone number is "+ principal.getPhoneNumber());
                System.out.println("Principal Staff ID is "+ principal.getSchoolId());
                System.out.println("Principal has "+ principal.getYearsOfExperience() + " years of experience");
                break;



            case 2:
                System.out.print("Enter your student ID: ");
                student.setStudentId(scanner.next());
                System.out.print("What Class are you in?");
                student.setStudentClass(Classes.valueOf(scanner.next().toUpperCase()));
                Students.takeCourse(student.getStudentClass());
                student.setStudentCourse(Courses.valueOf(scanner.next().toUpperCase()));
                System.out.println("The course picked by " + student.name + " is " + student.getStudentCourse());

                System.out.println("Student name is " + student.name);
                System.out.println("Student age is "+ student.age);
                System.out.println("Student gender is "+ student.gender);
                System.out.println("Student religion is "+ student.religion);
                System.out.println("Student Class is "+ student.getStudentClass());
                System.out.println("Student Course is "+ student.getStudentCourse());
                System.out.println("Student School ID is "+ student.getStudentId());
                break;

            case 3:
                System.out.print("Enter your email: ");
                teacher.setEmail(scanner.next());
                System.out.print("Enter your phone number: ");
                teacher.setPhoneNumber(scanner.nextInt());
                System.out.print("Enter your Staff ID: ");
                teacher.setSchoolId(scanner.next());
                System.out.print("Enter your years of experience: ");
                teacher.setYearsOfExperience(scanner.nextInt());
                System.out.println();
                System.out.print("Hello " + teacher.name);
                Teacher.classToTeach();
                teacher.teachCourse = Courses.valueOf(scanner.next().toUpperCase());

                System.out.println("Teacher name is " + teacher.name);
                System.out.println("Teacher age is "+ teacher.age);
                System.out.println("Teacher gender is "+ teacher.gender);
                System.out.println("Teacher religion is "+ teacher.religion);
                System.out.println("Teacher email is "+ teacher.getEmail());
                System.out.println("Teacher phone number is "+ teacher.getPhoneNumber());
                System.out.println("Teacher Staff ID is "+ teacher.getSchoolId());
                System.out.println("Teacher has "+ teacher.getYearsOfExperience() + " years of experience");
                System.out.println(teacher.name + " is teaching " + Teacher.studentClass + " " + teacher.teachCourse);
                break;
            case 4:
                System.out.print("Enter your email: ");
                nonAcademicStaff.setEmail(scanner.next());
                System.out.print("Enter your phone number: ");
                nonAcademicStaff.setPhoneNumber(scanner.nextInt());
                System.out.print("Enter your Staff ID: ");
                nonAcademicStaff.setSchoolId(scanner.next());
                System.out.print("Enter your years of experience: ");
                nonAcademicStaff.setYearsOfExperience(scanner.nextInt());
                System.out.println();
                System.out.print("Hello " + nonAcademicStaff.name);
                NonAcademicStaff.selectDuty();


                System.out.println("Staff name is " + nonAcademicStaff.name);
                System.out.println("Staff age is "+ nonAcademicStaff.age);
                System.out.println("Staff gender is "+ nonAcademicStaff.gender);
                System.out.println("Staff religion is "+ nonAcademicStaff.religion);
                System.out.println("Staff email is "+ nonAcademicStaff.getEmail());
                System.out.println("Staff phone number is "+ nonAcademicStaff.getPhoneNumber());
                System.out.println("Staff Staff ID is "+ nonAcademicStaff.getSchoolId());
                System.out.println("Staff has "+ nonAcademicStaff.getYearsOfExperience() + " years of experience");
                System.out.println("You are on " + NonAcademicStaff.duty + " today");
                break;
            default:
                System.out.println("You entered the wrong option (Select 1-4)");
        }
    }

    public static void main(String[] args) {
        System.out.println("""
                Enter your Role
                1. Principal
                2. Student
                3. Teacher
                4. Non-Academic-Staff:\s""");
        int role = scanner.nextInt();
        outputFunction(role);
        giveFunction(role);






    }
}