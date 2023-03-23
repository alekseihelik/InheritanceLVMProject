import java.util.ArrayList;
import java.util.UUID;

public class HardDrives {

    private static ArrayList<String> drives = new ArrayList<String>();
    private String uuid;
    private String name;
    private String size;

    public HardDrives(String name, String size){
        this.name = name;
        this.size = size;
        uuid = (UUID.randomUUID()).toString();
    }

    public static void getDrives(){
        for(int i=0;i<drives.size();i++){
            System.out.println(drives.get(i));
        }
    }

    public void addDrive(){
        drives.add(getName() + "[" + getSize() + "]" + "[" + getUuid() + "]");
    }

    public boolean isMade(){
        for(int i=0;i<drives.size();i++){
            if(getName().equals(drives.get(i).substring(0, drives.get(i).indexOf("[")))){
                return true;
            }
        }
        return false;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }
}
