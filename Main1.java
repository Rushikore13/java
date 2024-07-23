package demo.rk;
interface Drawable
{
   void draw();
   static int cube(int x)
   {
	   return x*x*x;
   }
}

public class Main1 implements Drawable {

	public static void main(String[] args) {
		Main1 m1=new Main1();
		m1.draw();
		System.out.println(Drawable.cube(9));

	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a Portrait");
	}

}
