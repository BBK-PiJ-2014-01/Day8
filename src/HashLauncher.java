import java.util.Scanner;

/**
 * Created by Pierre on 28/12/2014.
 */
public class HashLauncher {

    public static void main(String[] args) {
        HashLauncher h = new HashLauncher();
        h.launch();
    }

    void launch() {
        Scanner scanner = new Scanner(System.in);
        int commandLine = scanner.nextInt();
        System.out.println("0 < "+HashUtilities.shortHash(commandLine)+" < 1000");
    }
}
