import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Taking string Input
        String s = sc.nextLine();
        //The best possible solution to this problem is to use a HashMap.
        //For efficiency, we can also use an array of integers of size 255. As there are 255 unique chars in Java
        //I have used both methods for this solution.
        //Both Solutions have a Time Complexity of O(n)
        System.out.println("Calculating frequency using HashMap");
        HashMap<Character, Integer> map = frequencyHashMap(s);
        for(char c: map.keySet()) {
            System.out.println(c + " : " + map.get(c));
        }
        System.out.println("Calculating Frequency using Array");
        int[] arr = frequencyArray(s);
        for(int i = 0; i < 255; i++) {
            if(arr[i] > 0) {
                System.out.println((char) i + " : " + arr[i]);
            }
        }
    }
    static HashMap<Character, Integer> frequencyHashMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
    static int[] frequencyArray(String s) {
        int[] arr = new int[255];
        for(char c: s.toCharArray()) {
            arr[(int) c]++;
        }
        return arr;
    }
}