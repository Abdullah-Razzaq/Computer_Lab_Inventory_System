package labAss1;

public class Lab {
    private String labId;
    private Computer computers[];
    private LabStatus status;
    private Employee labAttendant;

    public Lab(String labId, Computer[] computers, LabStatus status, Employee labAttendant) {
        this.labId = labId;
        this.computers = computers;
        this.status = status;
        this.labAttendant = labAttendant;
    }

    public String getLabId() {
        return labId;
    }

    public void setLabId(String labId) {
        this.labId = labId;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public LabStatus getStatus() {
        return status;
    }

    public void setStatus(LabStatus status) {
        this.status = status;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }
    public void addComputer( Computer computers){
    return this.computers.
    }
    public boolean removeComputer(String computerNumber){
return ;
    }
    public Computer getComputer(String computerNumber){

    }
}
