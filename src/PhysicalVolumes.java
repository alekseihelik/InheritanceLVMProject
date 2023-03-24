public class PhysicalVolumes extends Data{

    private int size;
    private HardDrives hardDrive;

    public PhysicalVolumes(String name, HardDrives drive){
        super(name);
        hardDrive = drive;
        size = hardDrive.getSize();
    }

    public int getSize() {
        return size;
    }

    public HardDrives getHardDrive() {
        return hardDrive;
    }

    public String toString(){
        return super.getName() + ": [" + size + hardDrive.getUnit() + "] [" + super.getUuid() + "]";
    }
}
