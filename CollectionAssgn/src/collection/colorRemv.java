package collection;
import java.util.*;
public class colorRemv {
	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Purple");
		list.add("Red");
		list.add("Yellow");
		
		System.out.println(list);
				list.remove(2);
				
				System.out.println("after removing third element:" +list);
				
	}
}
