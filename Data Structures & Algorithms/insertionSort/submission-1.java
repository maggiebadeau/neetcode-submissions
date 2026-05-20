// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> iterations = new ArrayList<>();
        List<Pair> copy = new ArrayList<>();

        if (!pairs.isEmpty()) {
            copy.addAll(pairs);
            iterations.add(copy);
        }

        for (int i = 1; i < pairs.size(); i++) {
            Pair current = pairs.get(i);
            int j = i - 1;

            while (j >= 0 && pairs.get(j).key > current.key) {
                pairs.set(j + 1, pairs.get(j));
                j--;
            }

            pairs.set(j + 1, current);

            copy = new ArrayList<>();
            copy.addAll(pairs);
            iterations.add(copy);
        }

        return iterations;
    }
}
