package labAss1;

public class Computer {
    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    boolean hasGpu = true;

    public Computer(String computerNumber, String lcdModel, int ramSize, int hddSize, boolean hasGpu) {
        this.computerNumber = computerNumber;
        this.lcdModel = lcdModel;
        this.ramSize = ramSize;
        this.hddSize = hddSize;
        this.hasGpu = hasGpu;
    }

    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    public String getLcdModel() {
        return lcdModel;
    }

    public void setLcdModel(String icdModel) {
        this.lcdModel = icdModel;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHddSize() {
        return hddSize;
    }

    public void setHddSize(int hddSize) {
        this.hddSize = hddSize;
    }

    public boolean isHasGpu() {
        return hasGpu;
    }

    public void setHasGpu(boolean hasGpu) {
        this.hasGpu = hasGpu;
    }


    public boolean equals(Computer obj) {

        return super.equals(obj);
    }
    public Computer clone(){
    return new Computer(this.computerNumber, this.lcdModel,this.hddSize,this.ramSize, this.hasGpu);
    }

}
