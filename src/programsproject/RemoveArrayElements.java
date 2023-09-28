package programsproject;

import java.util.Arrays;

public class RemoveArrayElements {

	public static void main(String[] args) {
		        double[] array = {1, 3, 4, 5, 6, 7.9, 8, 9.9, 10};
		        
		        if (array.length >= 6) {
		            double[] newArray = new double[array.length - 2];
		            int newIndex = 0;
		            
		            for (int i = 0; i < array.length; i++) {
		                if (i != 4 && i != 5) { // Exclude 5th and 6th elements (index 4 and 5)
		                    newArray[newIndex] = array[i];
		                    newIndex++;
		                }
		            }
		            
		            System.out.println("Original Array: " + Arrays.toString(array));
		            System.out.println("Array after removing 5th and 6th elements: " + Arrays.toString(newArray));
		        } else {
		            System.out.println("Array does not have enough elements.");
		        }
		    }
		}