import enums.Classes;
import enums.Courses;

import java.util.Arrays;

public class Students extends Person{
    private String studentId;
    public Classes studentClass;
    public Courses studentCourse;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Classes getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(Classes studentClass) {
        this.studentClass = studentClass;
    }

    public Courses getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(Courses studentCourse) {
        this.studentCourse = studentCourse;
    }

    public static void takeCourse(Classes classes){
    if (classes.name().equals("JSS1") || classes.name().equals("JSS2") || classes.name().equals("JSS3") ){
        System.out.println(
                """
                        Courses Available:
                        1.Mathematics
                        2.Yoruba
                        3.English
                        """
        );



    }else if(classes.name().equals("SS1") || classes.name().equals("SS2") || classes.name().equals("SS3")){
        System.out.print("Are you an Art or Science student: ");
        String option = Main.scanner.next().toLowerCase();
        if(option.equals("science")){
            System.out.println(
                    """
                            Courses Available:
                            "1. Mathematics"
                            "2.Yoruba"
                            "3.English"
                            "4. Biology"
                            "5. Physics"
                            "6. Chemistry
                            """
            );
        } else if (option.equals("art")) {
            System.out.println(
                    """
                            Courses Available:
                            1. Mathematics
                            2.Yoruba
                            3.English
                            4. Government
                            5. History"""
            );
        }else{
            System.out.println("You entered a wrong spelling for Science/Art");
        }
    }else{
        System.out.println("You did not enter the right class");
    }
    }
}
