public class LogicalVolumes extends Data{

    private int size;
    private String volumeGroup;

    public LogicalVolumes(String name, String size, String group){
        super(name);
        this.size = Integer.parseInt(size.substring(0, size.length()));
        volumeGroup = group;
    }

    public int getSize() {
        return size;
    }

    public String getVolumeGroup() {
        return volumeGroup;
    }

    public String toString()
    {
        return super.getName() + ": [" + size  + "] [" + volumeGroup + "] [" + super.getUuid().toString() + "]";
    }
}
