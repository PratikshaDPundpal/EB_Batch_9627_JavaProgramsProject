package programsproject;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int[] array = {3, 5, 2, 5, 7, 2, 8, 5, 3, 9};
        
        int length = array.length;
        int uniqueCount = 0;
        
        for (int i = 0; i < length; i++) {
            boolean isDuplicate = false;
            
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                array[uniqueCount++] = array[i];
            }
        }
        
        int[] uniqueArray = Arrays.copyOf(array, uniqueCount);
        
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }
}

