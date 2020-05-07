class LevenshteinDistance {
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
public static int levenshteinDistance1(String str1, String str2){
	String shorter = str1.length() < str2.length() ?  str1 : str2;
	String longer = str1.length() >= str2.length() ? str1: str2;
	int 
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
