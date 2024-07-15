package demo.ptpl;

public class Matrix {

	public static void main(String[] args) {
		// Matrix 
		int a[][]= {{1,1,1},{2,2,2},{3,3,3}};
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
			}
		}
		for(int x[]:c)
		{
			for(int y:x)
			{
				System.out.print(y+"");
			}
			System.out.println();
		}

	}

}
