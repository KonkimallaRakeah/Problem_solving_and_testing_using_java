import java.util.*;
public class Hash_FCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();
            map.put(hashtag, map.getOrDefault(hashtag, 0) + 1);
        }
        for (String hashtag : map.keySet()) {
            System.out.println(hashtag + " " + map.get(hashtag));
        }
    }
}