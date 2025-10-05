public class Strings {
    public static void main(String[] args) {
        String[] words = { "Zebra", "Apple", "Lemon", "Mango", "Banana" };

        System.out.println("Before sorting:");
        for (String w : words)
            System.out.print(w + " ");
        System.out.println();

        // Sorting.insertionSort(words);   // untuk descending
        Sorting.selectionSort(words);      // untuk ascending

        System.out.println("After sorting:");
        for (String w : words)
            System.out.print(w + " ");
        System.out.println();
    }
}
