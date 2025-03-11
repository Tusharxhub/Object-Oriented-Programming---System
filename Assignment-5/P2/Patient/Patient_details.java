package Patient;
public class Patient_details {

    int patient_Id;
    String patient_Name;

    public Patient_details(int patient_Id, String patient_Name) {
        this.patient_Id = patient_Id;
        this.patient_Name = patient_Name;
    }
    public void display() {
        System.out.println("Patient ID: " + patient_Id);
        System.out.println("Patient Name: " + patient_Name);
    }

    public int getPatientId() {
        return patient_Id;
    }

    public String getPatientName() {
        return patient_Name;
    }
}