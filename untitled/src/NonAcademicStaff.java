public class NonAcademicStaff extends Staff{
    public static String duty;

    public static void selectDuty(){
        System.out.println("What will you like to do today? ");
        NonAcademicStaff.duty = Main.scanner.next();
    }
}
