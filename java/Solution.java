import java.util.*;

public class Solution {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(15);
        list.add(52);

        Random rand = new Random(100);
        int chaos = rand.nextInt(10);

        int[] arr = {12, 55, 22, 33};
        Arrays.sort(arr);
        String[] sArr = {"Banana", "Apple", "apple"};
        Arrays.sort(sArr);
        List<String> strList = new ArrayList<String>();

        for (int x : arr) {
            System.out.println(x);
        }
        for (String x : sArr) {
            System.out.println(x);
            strList.add(x);
        }
//        Arrays.sort(sArr,Comparator.reverseOrder());
//        for(String x: sArr) {
//            System.out.println(x);
//        }

        Integer[] list_to_arr = list.toArray(new Integer[0]);
        Arrays.sort(list_to_arr);

        for (int x : list_to_arr) {
            System.out.println(x);
        }

        String[] string_arr = strList.toArray(new String[0]);
        for (String x : string_arr) {
            System.out.println(x);

        }


        int t = Arrays.binarySearch(sArr, "apple");
        int f = Arrays.binarySearch(sArr, "grape");

        System.out.printf("%d %d\n", t, f);

        String str = "Hello World!";
//        for(char x : str.toCharArray()){
//            System.out.println(x);
//        }
        System.out.println(str.substring(0, 5));
        String[] str_split = str.split(" ");
        for (String x : str_split) {
            System.out.println(x);
        }
        String new_sen = str.substring(0, 3) + "~lll" + str.substring(3);
        String new_sen2 = str_split[0] + " new " + str_split[1];
        System.out.println(new_sen);
        System.out.println(new_sen2);

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Java", 0);
        if (map.containsKey("Java"))
            System.out.println(map.get("Java"));
        map.put("Python", map.getOrDefault("Python", 3));
        System.out.println(map.get("Python"));
        System.out.println(map.get("Java"));
        System.out.println(map.values());
        System.out.println(map.values().getClass().getSimpleName());
        System.out.println(map.keySet());
        System.out.println(map.keySet().getClass().getSimpleName());

        double d = -3.15;
        d = Math.abs(d);
        System.out.println(d);
        System.out.println(Math.ceil(d));
        System.out.println(Math.floor(d));
        String d_round = String.format("%.1f", d);
        System.out.println(d_round);

        double p = Math.pow(d, d);
        double s = Math.sqrt(d);
        String d_substring1 = String.format("%.3f", p);
        String d_substring2 = String.format("%.3f", s);
        System.out.println(d_substring1);
        System.out.println(d_substring2);

        int[] arr1 = {4, 2, 3, 1, 5};
        int[] tmp = Arrays.copyOfRange(arr1, 1, 3);
        for (int x : tmp)
            System.out.println(x);
        List<Integer> li = new ArrayList<Integer>();
        for (int x:arr1){
            li.add(x);
        }
        Collections.sort(li,Comparator.reverseOrder());

        Iterator it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

    }
}