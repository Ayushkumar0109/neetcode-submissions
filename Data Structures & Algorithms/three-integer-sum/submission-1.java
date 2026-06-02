// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> result = new ArrayList();
//         Set<List<Integer>> s1 = new HashSet();
//         Arrays.sort(nums);
//         int i=0;
//         int j=1;
//         int k=nums.length-1;
//         while(i < nums.length-2){
//             while(j<k){
//                 if(nums[i]+nums[j]+nums[k]==0){
//                     List<Integer> list = new ArrayList();
//                     list.add(nums[i]);
//                     list.add(nums[j]);
//                     list.add(nums[k]);
//                     if(!s1.contains(list)){
//                         s1.add(list);
//                         result.add(list);
//                     }
//                     j+=1;
//                     k-=1;
//                 }
//                 else if(nums[i]+nums[j]+nums[k]< 0){
//                     j+=1;
//                 }
//                 else{
//                     k-=1;
//                 }
//             }
//             i+=1;
//             j=i+1;
//             k=nums.length-1;
//         }
//         return result;
//     }

// }

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    result.add(
                        Arrays.asList(nums[i], nums[left], nums[right])
                    );

                    left++;
                    right--;

                    // Skip duplicate second elements
                    while (left < right &&
                           nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate third elements
                    while (left < right &&
                           nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
