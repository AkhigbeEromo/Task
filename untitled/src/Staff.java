public abstract class Staff extends Person{
    private int phoneNumber;
    private String email;
    private String schoolId;
    private int yearsOfExperience;


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(String schoolId) {
        this.schoolId = schoolId;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", schoolId='" + schoolId + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
