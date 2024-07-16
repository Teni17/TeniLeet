public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> map = new HashMap<>(); //create hashmap to map numbers and their index
     for(int i = 0;i<nums.length;i++){   //loop through the array
        int difference = target - nums[i];// get complement by subtracting the target from each number in the loop
        if(map.containsKey(difference)){ //check if map keys contains the complement
            return new int[] {map.get(difference),i}; //if true return a new array containing difference value and loop index
        }
         map.put(nums[i],i); //while in the loop store values and index in a map
     }
     return new int[]{};  // return empty array if no values lead to target
}