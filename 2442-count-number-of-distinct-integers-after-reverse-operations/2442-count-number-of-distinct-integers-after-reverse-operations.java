// class Solution {
//     public int countDistinctIntegers(int[] nums) {
//         int [] arr = new int[nums.length];
//         for(int i =0 ;i <nums.length;i++){
//             int temp = nums[i];
//             int x =0 ;
//             while(temp>0){
//                 x= x*10+(temp%10);
//                 temp/=10;

//             }
//             arr[i]=x;
//         }
//         List<Integer> numbers = new LinkedList<>();
//         for(int i = 0; i <nums.length;i++){
//             if (!numbers.contains(nums[i])) {
//                 numbers.add(nums[i]);
//             }
//             if (!numbers.contains(arr[i])) {
//                 numbers.add(arr[i]);
//             }
//         }

//     return numbers.size();
        
        
//     }
// }






class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        
        for (int num : nums) {
            uniqueNumbers.add(num);
            
            int temp = num;
            int reversed = 0;
            while (temp > 0) {
                reversed = reversed * 10 + (temp % 10);
                temp /= 10;
            }
            
            uniqueNumbers.add(reversed);
        }
        
        return uniqueNumbers.size();
    }
}
