package Patient;

import Doctor.Doctor_details;

public class Main {
    public static void main(String[] args) {
        Doctor_details doctor = new Doctor_details("Dr. Dey", "Cardiologist");
        doctor.display();

        Patient_details patient = new Patient_details(1230, "Tushar");
        patient.display();

        System.out.println("Doctor Name: " + doctor.getDoctorName());
        System.out.println("Doctor Specialization: " + doctor.getDoctorSpecialization());
        System.out.println("Patient ID: " + patient.getPatientId());
        System.out.println("Patient Name: " + patient.getPatientName());
    }
}


//? To compile the program, use the following command:
//? javac -d . ../Doctor/Doctor_details.java Patient_details.java Main.java
//? To run the program, use the following command:
//? java Patient.Main