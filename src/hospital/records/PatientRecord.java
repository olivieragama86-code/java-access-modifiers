package hospital.records;

public class PatientRecord {
    private String name;
    private String appointmentDate;
    private String medicalInfo;
    private double bill;

    public PatientRecord(String name, String appointmentDate,
                         String medicalInfo, double bill) {
        this.name = name;
        this.appointmentDate = appointmentDate;
        this.medicalInfo = medicalInfo;
        this.bill = bill;
    }

    // public: visible by everyone
    public String getName() { return name; }
    public String getAppointmentDate() { return appointmentDate; }

    // protected: subclasses only (doctors)
    protected String getMedicalInfo() { return medicalInfo; }
    protected void updateMedicalInfo(String info) { this.medicalInfo = info; }

    // default (package-private): same package only (administration)
    double getBill() { return bill; }
}