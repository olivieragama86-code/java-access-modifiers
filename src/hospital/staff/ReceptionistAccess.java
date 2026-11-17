package hospital.staff;

import hospital.records.PatientRecord;

public class ReceptionistAccess {
    public void viewBasicDetails(PatientRecord p) {
        System.out.println("[RECEPTIONIST] " + p.getName()
                + " - Appointment: " + p.getAppointmentDate());
        // p.getMedicalInfo();  // ERROR: protected
        // p.getBill();         // ERROR: package-private
    }
}