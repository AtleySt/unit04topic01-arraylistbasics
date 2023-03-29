import java.util.ArrayList;

public class ArrayListUtilities {

    public static int getListMax(ArrayList<Integer> items) {
        int listMax = items.get(0);
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i) > listMax) {
                listMax = items.get(i);
            }
        }
        return listMax;
    }

    public static ArrayList<String> withoutLongWords(ArrayList<String> items) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).length() <= 5) {
                result.add(items.get(i));
            }
        }
        return result;
    }

    public static void removeLongWords(ArrayList<String> items) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).length() > 5) {
                items.remove(i);
            }
        }
    }

    public static ArrayList<Double> reversed(ArrayList<Double> items) {
        
    }
}