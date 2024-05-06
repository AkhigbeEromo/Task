import enums.Classes;
import enums.Courses;

public class Teacher extends Staff {
    public static Classes studentClass;
    public Courses teachCourse;

    public static void classToTeach() {
        System.out.println(" which class do you teach: ");
        Teacher.studentClass =  Classes.valueOf(Main.scanner.next().toUpperCase());
        if (studentClass.name().equals("JSS1") || studentClass.name().equals("JSS2") || studentClass.name().equals("JSS3")) {
            System.out.println("You are teaching the Junior class");
            System.out.println(
                    """
                            Courses Available:
                            1.Mathematics
                            2.Yoruba
                            3.English
                            """);
        } else if (studentClass.name().equals("SS1") || studentClass.name().equals("SS2") || studentClass.name().equals("SS3")) {
            System.out.print("Are you an Art or Science Teacher: ");
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
        }
    }
}
