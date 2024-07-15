package demo.ptpl;

public class Multidimension {

	public static void main(String[] args) {
		// Multidimensional Array
		int[][] num={{1,2,3,4,5},{9,8,7,6,5},{10,11,12,13,14}};
		 
		for(int i=0;i<num.length;i++)
		{
			
			for(int j=0;j<num[i].length;j++)
			{
				System.out.print(num [i][j]+"");
			}
			System.out.println();
			
		}

	}

}
