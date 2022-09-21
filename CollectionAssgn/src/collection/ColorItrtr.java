package collection;
import java.util.*;
public class ColorItrtr {
	public static void main(String []args)
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("pink");
		l.add("white");
		l.add("black");
		l.add("blue");
		l.add("red");
		Iterator<String>it =l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next()); 
	}
	

}
}
