package demo.ptpl;

public class Transfose {

	public static void main(String[] args) {
		int a[][]= {{5,6,7},{1,2,3}};
		int b[][]=new int[3][2];
		// Converting the Rows in columns and columns into Rows
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
		}
		for(int x[]:b)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
