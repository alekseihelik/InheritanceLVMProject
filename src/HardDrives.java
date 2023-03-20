import java.util.ArrayList;
import java.util.UUID;

public class HardDrives {

    private static ArrayList<String> drives;
    private String uuid;
    private String name;
    private String size;

    public HardDrives(String name, String size){
        this.name = name;
        this.size = size;
        uuid = (UUID.randomUUID()).toString();
        drives.add(name + "[" + size + "]" + "[" + uuid + "]");
    }
    
    public static void getDrives(){
        for(int i=0;i<drives.size();i++){
            System.out.println(drives.get(i));
        }
    }
}
