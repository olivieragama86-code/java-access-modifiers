package hospital.staff;

import hospital.records.PatientRecord;

public class DoctorAccess extends PatientRecord {
    public DoctorAccess(String name, String date, String info, double bill) {
        super(name, date, info, bill);
    }

    public void viewMedicalInfo() {
        System.out.println("[DOCTOR] " + getName() + ": " + getMedicalInfo());
    }

    public void updateInfo(String newInfo) {
        updateMedicalInfo(newInfo);
        System.out.println("[DOCTOR] Medical info updated.");
    }
    // getBill() is NOT accessible here (different package)
}