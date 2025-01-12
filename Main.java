import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<Integer> listOne = new ArrayList<Integer>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);
        listOne.add(4);
        listOne.add(5);


        for(int i:listOne) {
            System.out.println("Cuenta hacia adelante: " + i);
        }


        List<Integer> listTwo = new ArrayList<Integer>();

        ListIterator<Integer> iterator = listOne.listIterator(listOne.size());


        while (iterator.hasPrevious()) {
            listTwo.add(iterator.previous());
        }
        System.out.println("Cuenta atrás: " + listTwo);
    }
}

