class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(findElementsOnlyInNums1(nums1, nums2), findElementsOnlyInNums1(nums2, nums1));
    }

    public List<Integer> findElementsOnlyInNums1(int[] nums1, int[] nums2) {
        Integer[] IntegerNums1 =  new Integer[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            IntegerNums1[i] = Integer.valueOf(nums1[i]);
        }

        Set<Integer> onlyInNums1 = new HashSet<Integer>(Arrays.asList(IntegerNums1));

        for (int num : nums2) {
            if (onlyInNums1.contains(num)) {
                onlyInNums1.remove(num);
            }
        }

        return new ArrayList<>(onlyInNums1);
    }
}