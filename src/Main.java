import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {

    protected static final String TEXT = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";


    public static void main(String[] args) {

        char[] element = TEXT.toLowerCase().toCharArray();
        Map<Character, Integer> symbs = new HashMap<>();

        for (int i = 0; i < element.length; i++) {
            if (Character.isLetter(element[i])) {
                Integer count = symbs.get(element[i]);
                if (count == null) {
                    symbs.put(element[i], 1);
                } else {
                    symbs.put(element[i], ++count);
                }
            }
        }

        Integer max = getMax(symbs);
        Integer min = getMin(symbs);


        System.out.println("Максимальное кол-во вхождений: ");

        for (Map.Entry<Character, Integer> symb : symbs.entrySet()) {
            if (Objects.equals(symb.getValue(), max)){
                System.out.println("[" + symb.getKey() + " :" + symb.getValue() + "] ");
            }
        }

        System.out.println("Минимальное кол-во вхождений: ");

        for (Map.Entry<Character, Integer> symb : symbs.entrySet()) {
            if (Objects.equals(symb.getValue(), min)){
                System.out.println("[" + symb.getKey() + " :" + symb.getValue() + "] ");
            }
        }
    }

    protected static Integer getMax(Map<Character, Integer> symbs) {
        int max = Integer.MIN_VALUE;

        for (Map.Entry<Character, Integer> symb : symbs.entrySet()) {
            if (symb.getValue() > max) {
                max = symb.getValue();
            }
        }

        return max;
    }

    protected static Integer getMin(Map<Character, Integer> symbs) {
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> symb : symbs.entrySet()) {
            if (min > symb.getValue()) {
                min = symb.getValue();
            }
        }

        return min;
    }
}