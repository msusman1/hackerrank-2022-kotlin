package day29;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class RemoteBase {
    public static void main(String[] args) throws IOException {
        System.out.print(oddNumbers(3,9));
    }

    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> odds = new ArrayList<>();
        if (l % 2 == 0) {
            l++;
        }
        if (r % 2 == 0) {
            r--;
        }
        for (int i = l; i <= r; i = i + 2) {
            odds.add(i);
        }
        return odds;
    }
}