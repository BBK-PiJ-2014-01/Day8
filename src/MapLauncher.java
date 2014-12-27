/**
 * Created by Pierre on 27/12/2014.
 */
public class MapLauncher {
    public static void main(String[] args) {
        MapLauncher m = new MapLauncher();
        m.launch();
    }

    public void launch() {
        // Exercise 5.2 Running SingleMap Class

        SimpleMapImpl singleMap = new SimpleMapImpl(100);
        singleMap.put(17, "Peter");
        singleMap.put(99, "Karl");
        singleMap.put(34, "Jo");
        singleMap.put(28, "Bill");
        singleMap.put(28, "Dean");
        singleMap.put(94, "David");
        singleMap.put(72, "Mel");
        singleMap.put(3, "Will");

        System.out.println(singleMap.get(28));
        System.out.println(singleMap.get(17));
        System.out.println(singleMap.get(9));

        singleMap.remove(9);

        singleMap.remove(94);
        singleMap.remove(99);
        singleMap.remove(3);
        singleMap.remove(72);
        singleMap.remove(28);
        singleMap.remove(17);
        System.out.println(singleMap.isEmpty());
        singleMap.remove(34);
        System.out.println(singleMap.isEmpty());

    }
}
