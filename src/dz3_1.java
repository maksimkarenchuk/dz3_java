import java.util.ArrayList;

//На вход приходят два ArrayList<Integer> напишите метод, который проверяет два массива на равенство.
// Нужно реализовать алгоритм, не использовать метод equals.
public class dz3_1 {
    public static void main(String[] args) {

    }

    public static boolean equals(ArrayList<Integer> nums1, ArrayList<Integer> nums2) {
        if (nums1 == nums2) {
            return true;
        }

        if (nums1.size() != nums2.size()) {
            return false;
        }

        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) != nums2.get(i)) {
                return false;
            }
        }
        return true;
    }
}