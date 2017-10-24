package me.keano.exercises;

public class DiagonalDifference {

	public static void main(String[] args) {
		for(int j = 0; j < numInputs; j++){
			for(int k = 0; k < numInputs; k++){
				cin >> curInput;
			if(j == k){
				leftD += curInput;
			}
			if(j+k == (numInputs-1)){
				rightD += curInput;
			}
			}
		}
		ans = abs(leftD-rightD);
	}

}
