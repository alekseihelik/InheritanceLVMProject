public class LogicalVolumes extends Data{

    private int size;
    private String group;

    public LogicalVolumes(String name, String size, String group){
        super(name);
        this.size = Integer.parseInt(size.substring(0, size.length()));
        this.group = group;
    }

    public int getSize() {
        return size;
    }

    public String getGroup() {
        return group;
    }

    public String toString()
    {
        return super.getName() + ": [" + size  + "] [" + group + "] [" + super.getUuid().toString() + "]";
    }
}
