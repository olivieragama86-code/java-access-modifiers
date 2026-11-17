package hospital.main;

import hospital.records.AdministrationDepartment;
import hospital.records.PatientRecord;
import hospital.staff.DoctorAccess;
import hospital.staff.ReceptionistAccess;

public class Main {
    public static void main(String[] args) {
        // Doctor: can view and update medical info
        DoctorAccess doctor = new DoctorAccess("Mary Achieng",
                "20/11/2026", "Malaria - on treatment", 150000);
        doctor.viewMedicalInfo();
        doctor.updateInfo("Malaria - recovered");
        doctor.viewMedicalInfo();

        // Receptionist: basic details only
        PatientRecord patient = new PatientRecord("John Okello",
                "22/11/2026", "Hypertension", 80000);
        new ReceptionistAccess().viewBasicDetails(patient);

        // Administration: financial records
        new AdministrationDepartment().showFinancialRecord(patient);

        // patient.getBill();         // ERROR: package-private
        // patient.getMedicalInfo();  // ERROR: protected
    }
}