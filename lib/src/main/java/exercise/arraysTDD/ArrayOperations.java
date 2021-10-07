package exercise.arraysTDD;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

/**
 * Utility class which performs various operations with integer arrays.
 */
public class ArrayOperations {
    private final int[] numbers;      // array that needs to be sorted.
    private final int[] unsorted;     // reference array which stays unsorted.

    public ArrayOperations(int[] numbers) {
        this.numbers = numbers;
        this.unsorted = numbers.clone();
    }

    /* **********************************************************
     *   Please implement the following methods.                 *
     *   It is intended that they are not static.                *
     * ***********************************************************/

    /**
     * Prints out the numbers array.
     */

    public void print() {
    	System.out.print(numbers.length);
    }

    /**
     * @return the sorted numbers array.
     * @see <a href="sorting algortihms">http://faculty.cs.niu.edu/~hutchins/csci241/sorting.htm</a>
     */
    public int[] sort() {
		for (int i = 0; i < numbers.length; i++) {
        for (int j = 1; j < numbers.length; j++) {
            if(numbers[j]<numbers[j-1]){
                int temp = numbers[j];
                numbers[j] = numbers[j-1];
                numbers[j-1] = temp;
            }
        }
	}
    return numbers;
}

    /**
     * @return the sorted array in reverse order
     */
    public int[] revertSort() {
    	for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if(numbers[j]>numbers[j-1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                    int numbers2 = numbers[j];
                }
            }
    	}
        return numbers;
    }
  

   
        

    /**
     * @return the unsorted array in reverted order.
     */
    public int[] reverted() {
    	int[] revertedNumbers = numbers.clone(); 

        for (int i = 0; i< numbers.length; i++)
        {
            revertedNumbers[(numbers.length-1) - i] = numbers[i];
        }

        return revertedNumbers;
        
}
    

    /**
     * @param value which should be searched for.
     * @return true if the array contains the value, false otherwise.
     */
    public boolean contains(int value) {
    	
		boolean found = false;
		
		for (int i = 0; i< numbers.length; i++) {
    		if (numbers[i] == value) {
    			found = true;
    		}
    	} 
		
        return found;
    }

    /**
     * @return the average value of all elements summed up.
     */
    public double average() {
    	 double sum = sumValues(); 

 		sum = sum / numbers.length;
     		
         return sum ;
     }
    

    /**
     * @return the average value of all elements summed up, but without the highest and the lowest value.
     */
    public double trimmedMean() {
      	double max = maxValue();
    	double min = minValue();
    	double sum = sumValues(); 

   		return (sum - min - max) / (numbers.length - 2);
    		
    }

    /**
     * @return the max value of the array. In the array [1,9,3] max would be 9.
     */
    public int maxValue() {
    	
    	int max= numbers[0];
    	for (int i = 1; i < numbers.length; i++ ) {
    		if (numbers[i] > max) {
    			max= numbers[i];
    		}
    	}
    	  	
    	
        return max;
    }

    /**
     * @return the min value of the array. In the array [1,9,3] min would be 1.
     */
    public int minValue() {
    	int min = numbers[0];
    	for (int i = 0; i< numbers.length; i++) {
    		if (numbers[i] < min) {
    			min= numbers[i];
    		}
    	}
        return min;
    }

    /* **********************************************************
     *   Feel free to add as many private helper methods as      *
     *   you like.                                               *
     * ***********************************************************/

    private int someHelper(int[] tmp) {
    	
        return 1;
    }
	
	private double sumValues(){
		double sum = 0;
		
   		for (int i = 0; i < numbers.length; i++) {
   			sum = sum + numbers[i];
   		}	
		
		return sum;
	}
}

