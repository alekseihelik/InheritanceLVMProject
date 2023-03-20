import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to the LVM system.");
        String cmd = "";
        while(!(cmd.equalsIgnoreCase("exit"))){
            System.out.print("cmd#: ");
            cmd = s.nextLine();
            if(cmd.contains("install-drive")){
                String[] split = cmd.split(" ");
                HardDrives drive = new HardDrives(split[1], split[2]);
                System.out.println("Drive " + split[1] + " installed");
                drive.addDrive();
            }
            if(cmd.contains("list-drives")){
                HardDrives.getDrives();
            }
        }
    }
}
