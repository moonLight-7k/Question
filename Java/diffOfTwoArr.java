import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class diffOfTwoArr {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            set2.add(n);
        }

        Set<Integer> set1Copy = new HashSet<>(set1);

        set1.removeAll(set2);
        set2.removeAll(set1Copy);

        return Arrays.asList(new ArrayList<>(set1), new ArrayList<>(set2));

    }
}
