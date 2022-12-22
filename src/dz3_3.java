import java.util.ArrayList;
import java.util.Collections;


//На вход приходит ArrayList<Integer>. Отсортируйте в нем только четные числа.
//Пример: [10, 4, 5, 6, 7, 2, 2, 9] -> [2, 2, 5, 4, 7, 6, 10, 9]
public class dz3_3 {
    public static ArrayList<Integer> sortEven(ArrayList<Integer> list1) {
        ArrayList<Integer> even = new ArrayList<>();
        int j = 0;
        for (Integer integer : list1) {
            if (integer % 2 == 0) {
                even.add(integer);
            }
        }

        Collections.sort(even);
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) % 2 == 0) {
                list1.set(i, even.get(j));
                j++;
            }
        }
        return list1;
    }
}
