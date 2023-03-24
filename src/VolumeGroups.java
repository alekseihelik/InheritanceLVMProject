import java.util.ArrayList;

public class VolumeGroups extends Data{

    private ArrayList<PhysicalVolumes> pvs = new ArrayList<PhysicalVolumes>();

    public VolumeGroups(String name, PhysicalVolumes pv){
        super(name);
        pvs.add(pv);
    }

    public ArrayList<PhysicalVolumes> getPvs() {
        return pvs;
    }

}
