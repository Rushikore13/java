package demo.rk;
interface Multiply{
	int multi(int a,int b);
}

public class Mal {

	public static void main(String[] args) {
		Multiply m1=(p1,p2)->p1*p2;
		System.out.println(m1.multi(5,9));
	}

}
