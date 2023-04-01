import java.util.ArrayList;

public class HardDrives extends Data{

    private static ArrayList<String> drives = new ArrayList<String>();
    private int size;

    public HardDrives(String name, String size){
        super(name);
        this.size = Integer.parseInt(size.substring(0,size.length()));
    }

    public static void getDrives(){
        for(int i=0;i<drives.size();i++){
            System.out.println(drives.get(i));
        }
    }

    public String toString(){
        return super.getName() + "[" + getSize() + "]" + "[" + super.getUuid() + "]";
    }

    public int getSize() {
        return size ;
    }

}
