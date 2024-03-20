import fr.lelouet.revision.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> tutoHashMap = new HashMap<String, ArrayList<Integer>>();

        System.out.println(tutoHashMap.toString());
        System.out.println(tutoHashMap.containsValue("TAT"));

        System.out.println(tutoHashMap.get("TYTY"));

    }
}