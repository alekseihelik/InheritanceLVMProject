import java.util.UUID;
public class Data {

    private UUID uuid;
    private String name;

    public Data(String name){
     this.name = name;
     uuid = UUID.randomUUID();
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }
}
