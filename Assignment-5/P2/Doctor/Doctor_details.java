//! Write a program in Java to create a package doctor that contains a class named DoctorDetails with variables doctorName and doctorSpecialization. Initialize the variables with constructors. Display the doctor details. Create a main class in the patient package with the main method. Create an object of DoctorDetails and PatientDetails classes and show the records.

package Doctor;

public class Doctor_details {
    String doctorName;
    String doctorSpecialization;

    public Doctor_details(String doctorName, String doctorSpecialization) {
        this.doctorName = doctorName;
        this.doctorSpecialization = doctorSpecialization;
    }

    public void display() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Doctor Specialization: " + doctorSpecialization);
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }
}