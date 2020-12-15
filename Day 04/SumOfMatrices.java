public class SumOfMatrices{
	
	public static void main(String[] args){
		
		int firstMatrix[][]={{1,2,3},{4,5,6},{7,8,9}};
		int secondMatrix[][]={{2,3,4},{5,6,7},{8,9,1}};
		int totalMatrix[][]=new int[3][3];
		int i;
		int j;
		for(i=0;i<3;i++){
			
			for(j=0;j<3;j++){
				
				totalMatrix[i][j]=firstMatrix[i][j] +secondMatrix[i][j];
				
			}
		}
		System.out.println("Sum of two matrices:");
		for(i=0;i<3;i++){
			
			for(j=0;j<3;j++){
			System.out.print(totalMatrix[i][j]+"");	
				
			}
			System.out.println();
		}
	}
	
	
	
	
}