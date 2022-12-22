import java.util.ArrayList;

public class dz3_4 {

    //На вход приходт ArrayList<Integer> удалите из него четные числа (на итератор)
    public static ArrayList<Integer> saveOdd(ArrayList<Integer> list1) {
        list1.removeIf(integer -> integer % 2 == 0);
        return list1;
    }

}

