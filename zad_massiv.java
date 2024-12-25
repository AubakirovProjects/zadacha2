import java.util.ArrayList;
import java.util.Comparator;

class StringContainer {
    private ArrayList<String> container; 

    public StringContainer() {
        container = new ArrayList<>(); 
    }

    public void addString(String str) {
        container.add(str);
        container.sort(Comparator.comparingInt(String::length));
    }

    public String getLongest() {
        if (container.isEmpty()) {
            return null; 
        }
        return container.get(container.size() - 1); 
    }

    public double getAverageLength() {
        if (container.isEmpty()) {
            return 0.0; 
        }
        int totalLength = 0;
        for (String str : container) {
            totalLength += str.length(); 
        }
        return (double) totalLength / container.size(); 

    public void displayStrings() {
        System.out.println("Строки в контейнере:");
        for (String str : container) {
            System.out.println(str);
        }
    }
}

public class StringContainerTest {
    public static void main(String[] args) {
        StringContainer stringContainer = new StringContainer();

        stringContainer.addString("apple");
        stringContainer.addString("banana");
        stringContainer.addString("cherry");
        stringContainer.addString("date");
        stringContainer.addString("fig");

        stringContainer.displayStrings();

        System.out.println("Самая длинная строка: " + stringContainer.getLongest());

        System.out.println("Средняя длина строк: " + stringContainer.getAverageLength());
    }
}