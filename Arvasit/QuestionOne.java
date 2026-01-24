// import java.util.ArrayList;
// import java.util.HashMap;

// public class QuestionOne {
//     public static int[] sumVal(int[] nums, int target) {

//         List<List<Integer, Integer>> list = new ArrayList<>();

//         HashMap<Integer, Integer> map = new HashMap<>();
//         HashMap<Integer, Integer> arr = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {

//             int compliment = nums[i] - target;

//             if (arr.containsKey(compliment)) {
//                 map.put(i, arr.get(compliment));
//             } else {
//                 arr.put(nums[i], i);
//             }
//         }

//         //[[0,1], [1,2]]

//     }

//     // Question 2

//     public static boolean PatternMatch(String str, String pattern){
//         HashMap<Character, Integer> map = new HashMap<>();

//         HashMap<Character, Integer> patt = new HashMap<>();


//     }

//     // Question 3

//     public static void AddAll(int[] nums, int n) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         for (int i = 0; i < n; i++) {
//             arr.add(nums[i]);
//         }

//     }

//     public static void addNumber(int num) {
//         arr.add(num);
//     }

//     public static void removeNumber(int num) {
//         arr.remove(num);
//     }

//     public static int getMax(){
//         int max = Integer.MIN_VALUE;

//         for(int i  = 0; i < arr.size(); i++){
//             max = Math.max(max, arr.get(i));
//         }
//         return max;
//     }

//        public static int getMin(){
//         int min = Integer.MAX_VALUE;

//         for(int i  = 0; i < arr.size(); i++){
//             min = Math.min(min, arr.get(i));
//         }
//         return min;
//     }

//     public static boolean checkEmpty(){
//         if(arr.size() == 0){
//             return true;
//         }
//         return false;
//     }

// }
