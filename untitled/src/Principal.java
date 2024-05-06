public class Principal extends Staff{

    public static void admitStudent(AdmissionApplicants applicant){
        System.out.print("What is the applicant age? ");
        applicant.age = Main.scanner.nextInt();
        if(applicant.age >= 10){
            System.out.println("What is the name of the applicant to be admitted: ");
            applicant.name = Main.scanner.next();
            System.out.println(applicant.name + " you have been admitted");
        }
        else{
            System.out.println(applicant.name+ ", sorry you cannot be admitted because you are less than ten years");
        }
    }

    public static void expelStudent(int role, Students student){
        if (role != 1){
            System.out.println("You do not have access to expel a student");
        }else {
            System.out.print("Enter the name of the student you want to expel: ");
            student.name = Main.scanner.next();
            System.out.println(student.name + " has been expelled from this institution");
        }
    }
    public static void employStaff(int role, Teacher teacher,NonAcademicStaff nonAcademicStaff){
        if (role != 1){
            System.out.println("You do not have the right to employ a staff");
        }
        else{
            System.out.println("Do you want to employ: "+
                                "1. A Teacher" +
                                "2. A Non-Academic Staff");
            int option = Main.scanner.nextInt();
            if (option == 1){
                System.out.print("Enter the teacher name: ");
                teacher.name = Main.scanner.next();
                System.out.println(teacher.name +" has been employed");
            } else if (option == 2) {
                System.out.print("Enter the staff name: ");
                nonAcademicStaff.name = Main.scanner.next();
                System.out.println(nonAcademicStaff.name+ " has been employed");
            }else{
                System.out.println("You selected a wrong option");
            }
        }
    }
    public static void terminateStaff(int role, Teacher teacher,NonAcademicStaff nonAcademicStaff){
        if (role != 1){
            System.out.println("You do not have the right to terminate a staff");
        }
        else{
            System.out.println("Do you want to terminate: "+
                    "1. A Teacher" +
                    "2. A Non-Academic Staff");
            int option = Main.scanner.nextInt();
            if (option == 1){
                System.out.print("Enter the teacher name: ");
                teacher.name = Main.scanner.next();
                System.out.println(teacher.name +" has been terminated");
            } else if (option == 2) {
                System.out.print("Enter the staff name: ");
                nonAcademicStaff.name = Main.scanner.next();
                System.out.println(nonAcademicStaff.name+ " has been terminated");
            }else{
                System.out.println("You selected a wrong option");
            }
        }
    }

}
