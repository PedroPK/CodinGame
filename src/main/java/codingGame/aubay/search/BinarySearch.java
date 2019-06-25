package codingGame.aubay.search;

import java.util.Arrays;

public class BinarySearch {
	
	public static boolean exists(int[] pIntegers, int pWantedInt) {
		boolean response = false;
		
		int indexOfWanted = Arrays.binarySearch(pIntegers, pWantedInt);
		
		if ( indexOfWanted >= 0 ) {
			response = true;
		}
		
		return response;
	}
	
	public static int getIntermediaryIndex(int[] pIntegers) {
		int intermediateIndex = 0;
		if ( pIntegers.length > 1 ) {
			intermediateIndex = pIntegers.length/2;
		}
		return intermediateIndex;
	}
	
}