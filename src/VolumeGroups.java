import java.util.ArrayList;

public class VolumeGroups extends Data{

    private ArrayList<PhysicalVolumes> pvs = new ArrayList<PhysicalVolumes>();
    private ArrayList<LogicalVolumes> lvs = new ArrayList<LogicalVolumes>();

    public VolumeGroups(String name, PhysicalVolumes pv){
        super(name);
        pvs.add(pv);
    }

    public ArrayList<PhysicalVolumes> getPvs()  {
        return pvs;
    }

    public ArrayList<LogicalVolumes> getLvs() {
        return lvs;
    }

    public void addPv(PhysicalVolumes pv){
        pvs.add(pv);
    }

    public void addLv(LogicalVolumes lv){
        lvs.add(lv);
    }

    public ArrayList<String> getPvNames(){
        ArrayList<String> pvNames = new ArrayList<>();
        for (PhysicalVolumes pv : pvs)
        {
            pvNames.add(pv.getName());
        }
        return pvNames;
    }

    public int space(){
        int space = 0;
        for(PhysicalVolumes pv : pvs){
            space+= pv.getSize();
        }
        return space;
    }
    public int spaceLeft(){
        int space = 0;
        for (LogicalVolumes lv : lvs)
        {
            space += lv.getSize();
        }
        return space()-space;
    }

    public String toString()
    {
        return super.getName() + ": Total:[" + space() + "] Available:[" + spaceLeft() + "] " + getPvNames().toString() + " [" + super.getUuid().toString() + "]";
    }
}
