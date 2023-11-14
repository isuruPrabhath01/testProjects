package lk.ijse.drivingschool.to;

public class Instructor {
   private String instructor_id ;
   private String instructor_name ;
   private String instructor_type ;
   private String driving_license ;
   private String telephone_number;

    public Instructor() {
    }

    public Instructor(String instructor_id, String instructor_name, String instructor_type, String driving_license, String telephone_number) {
        this.instructor_id = instructor_id;
        this.instructor_name = instructor_name;
        this.instructor_type = instructor_type;
        this.driving_license = driving_license;
        this.telephone_number = telephone_number;
    }





    public String getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(String instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }

    public String getInstructor_type() {
        return instructor_type;
    }

    public void setInstructor_type(String instructor_type) {
        this.instructor_type = instructor_type;
    }

    public String getDriving_license() {
        return driving_license;
    }

    public void setDriving_license(String driving_license) {
        this.driving_license = driving_license;
    }

    public String getTelephone_number() {
        return telephone_number;
    }

    public void setTelephone_number(String telephone_number) {
        this.telephone_number = telephone_number;
    }
}
