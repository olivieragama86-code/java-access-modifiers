package hospital.records;

// Same package as PatientRecord, so it can use getBill()
public class AdministrationDepartment {
    public void showFinancialRecord(PatientRecord p) {
        System.out.println("[ADMIN] " + p.getName() + " owes: " + p.getBill());
    }
}