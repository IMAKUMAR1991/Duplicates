import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyComporator<T> implements Comparator<T> {

	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = obj2.toString();
		
		return s1.compareTo(s2);
	}

}

public class DefaultShorting {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("ANAND");
		list.add("AKASH");
		list.add("ZANTU");
		list.add("MANTU");
		list.add("RAKESH");
		list.add("ANAND");
		list.add("COW");
		list.add("HEN");
		list.add("COW");

	}

}
