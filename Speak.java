package demo.rk;
interface Sayable
{
  String say(String words);	
}
public class Speak {

	public static void main(String[] args) {
		Sayable s1=(s)->
		{
			return "Hello  "+s;
		};
		System.out.println(s1.say("How are You"));
	}

}
