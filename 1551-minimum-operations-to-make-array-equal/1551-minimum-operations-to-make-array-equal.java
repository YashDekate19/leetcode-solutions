// class Solution {
//     public int minOperations(int n) {
//         int x = 0;
//         int sum = 0;
        
//         if(n%2!=0){
//             x = (2*(n/2))+1;
//             for(int i = 0 ; i<n/2;i++){
//                 sum +=((2*(n/2))+1)-((2*i)+1);
//             }

//             return sum;
//         }else{
//             x = (2*(n/2));
//             for(int i = 0 ; i<n/2;i++){
//                 sum +=(2*(n/2))-((2*i)+1);
//             }
//             return sum;
//         }

        
        
//     }
// }





class Solution {
    public int minOperations(int n) {
        int sum = 0;
        
        int target = n; 
        
        for (int i = 0; i < n / 2; i++) {
            int currentElement = (2 * i) + 1;
            sum += target - currentElement;
        }

        return sum;
    }
}
