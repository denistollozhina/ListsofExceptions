import java.util.ArrayList;

public class ArrayListExceptionHandling {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for (int i = 0; i < myList.size(); i++) {
            try {
                Object element = myList.get(i);
                if (element instanceof Integer) {
                    Integer castedValue = (Integer) element;
                    System.out.println("Casted value: " + castedValue);
                } else {
                    throw new ClassCastException("Cannot cast to Integer");
                }
            } catch (ClassCastException e) {
                System.out.println("Exception occurred at index " + i);
                System.out.println("Error message: " + e.getMessage());
                System.out.println("Value of the object: " + myList.get(i));
                System.out.println();
            }
        }
    }
}
