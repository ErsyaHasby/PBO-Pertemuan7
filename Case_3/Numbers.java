public class Numbers {
    public static void main(String[] args) {
        Integer[] nums = { 5, 2, 9, 1, 5, 6 };

        System.out.println("Before sorting:");
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();

        // Sorting.insertionSort(nums);   // untuk descending
        Sorting.selectionSort(nums);      // untuk ascending

        System.out.println("After sorting:");
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}
