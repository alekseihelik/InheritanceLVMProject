import java.util.ArrayList;

public class HardDrives extends Data{

    private static ArrayList<String> drives = new ArrayList<String>();
    private int size;
    private String unit;

    public HardDrives(String name, String size){
        super(name);
        this.size = Integer.parseInt(size.substring(0,size.length()-1));
        unit = size.substring(size.length()-1);
    }

    public static void getDrives(){
        for(int i=0;i<drives.size();i++){
            System.out.println(drives.get(i));
        }
    }

    public void addDrive(){
        drives.add(super.getName() + "[" + getSize() + getUnit() + "]" + "[" + super.getUuid() + "]");
    }

    public boolean isMade(){
        for(int i=0;i<drives.size();i++){
            if(super.getName().equals(drives.get(i).substring(0, drives.get(i).indexOf("[")))){
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }

    public String getUnit() {
        return unit;
    }
}
