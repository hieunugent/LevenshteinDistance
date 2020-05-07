class LevenshteinDistance {
	
// Time O(NM) Space O(MN)
  public static int levenshteinDistance(String str1, String str2) {
    // Write your code here.
		int [][] stepCount = new int [str2.length() + 1][str1.length() +1];
		setupTheStepCount(stepCount);
		for (int r  = 1; r < stepCount.length ; r++){
			for( int c = 1 ; c < stepCount[0].length; c++)
			{
				if (str2.charAt(r-1) == str1.charAt(c-1)){
					stepCount[r][c] = stepCount[r-1][c-1];
				}
				else{
				stepCount[r][c] = minOfthree(stepCount[r-1][c-1], stepCount[r-1][c], stepCount[r][c-1]) +1;
					
				}
			}
		}
    return stepCount[str2.length()][str1.length()];
  }
// time O(mn) space O(min(m, n))
public static int levenshteinDistance1(String str1, String str2){
	String shorter = str1.length() < str2.length() ?  str1 : str2;
	String longer = str1.length() >= str2.length() ? str1: str2;
	int [] evenEdits = new int[small.length() +1];
	int [] oddEdits = new int[small.length() +1];
	for(int j =0 ; j < small.length() +1; j++){
		evenEdits[j]= j;
	}
	int [] currentEdits;
	int [] previuosEdits;
	for (int r = 1; r < big.length() +1; r++){
		if(r % 2 == 1){
		currentEdits = oddEdits;
	  	previousEdits = evenEdits;	
		}
		else{
		currentEdits = evenEdits;
	  	previousEdits = oddEdits;	
		}
		currentEdits[0] = r;
		for (int c = 1; c < small.length() +1; c++){
		    if(big.charAt(r-1) == small.charAt(c-1)){
			    currentEdits[c] = previous[c-1];
		    }
		    else{
			currentEdits[c]=
				1+ minOfthree(previousEdits[c-1],previousEdits[c], currentEdits[c-1]);
		    }
		}
	
	}
	return big.length() % 2 == 0 ? evenEdits[small.length()] : oddEdits[small.length()];
	
}
	
	
	
	
	public static int minOfthree(int a, int b, int c){
		return Math.min(a, Math.min(b, c));
	}
	public static void setupTheStepCount(int [][] stepCount){
		for (int i = 0 ; i < stepCount.length; i++){
			for (int j = 0 ; j < stepCount[0].length ; j++){
				stepCount[i][j] = j;
			}
			stepCount[i][0]= i;
		}
	}
}
