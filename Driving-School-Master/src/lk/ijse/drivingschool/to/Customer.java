package lk.ijse.drivingschool.to;

public class Customer {
    private String admission_numberr;
    private String full_namee;
    private int age;
    private String gender;
    private String nic;
    private String address;
    private String telephone_numberr;
    private String email;
    private String license_typee;
    private String Transmission_Type;
    private String vehicle_class;
    private double course_fee;
    private double amount;
    private String date;

    public Customer(String admission_numberr, String full_namee, int age, String gender, String nic, String address, String telephone_numberr, String email, String license_typee, String transmission_Type, String vehicle_class, double course_fee, double amount, String date) {
        this.admission_numberr = admission_numberr;
        this.full_namee = full_namee;
        this.age = age;
        this.gender = gender;
        this.nic = nic;
        this.address = address;
        this.telephone_numberr = telephone_numberr;
        this.email = email;
        this.license_typee = license_typee;
        Transmission_Type = transmission_Type;
        this.vehicle_class = vehicle_class;
        this.course_fee = course_fee;
        this.amount = amount;
        this.date = date;
    }

    public Customer(String admission_numberr, String full_namee, String telephone_numberr, String license_typee) {
        this.admission_numberr = admission_numberr;
        this.full_namee = full_namee;
        this.telephone_numberr = telephone_numberr;
        this.license_typee = license_typee;
    }

    public String getAdmission_numberr() {
        return admission_numberr;
    }

    public void setAdmission_numberr(String admission_numberr) {
        this.admission_numberr = admission_numberr;
    }

    public String getFull_namee() {
        return full_namee;
    }

    public void setFull_namee(String full_namee) {
        this.full_namee = full_namee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone_numberr() {
        return telephone_numberr;
    }

    public void setTelephone_numberr(String telephone_numberr) {
        this.telephone_numberr = telephone_numberr;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicense_typee() {
        return license_typee;
    }

    public void setLicense_typee(String license_typee) {
        this.license_typee = license_typee;
    }

    public String getTransmission_Type() {
        return Transmission_Type;
    }

    public void setTransmission_Type(String transmission_Type) {
        Transmission_Type = transmission_Type;
    }

    public String getVehicle_class() {
        return vehicle_class;
    }

    public void setVehicle_class(String vehicle_class) {
        this.vehicle_class = vehicle_class;
    }

    public double getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(double course_fee) {
        this.course_fee = course_fee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}