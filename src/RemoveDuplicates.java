import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("moktar ali khan");
		name.add("nasima khan");
		name.add("zahid khan");
		name.add("sanchita khan");
		name.add("javed khan");
		name.add("zahid khan");

		Set<String> name1 = new HashSet<String>(name);

		System.out.println(name1);

		System.out.println(name);

		Collections.reverse(name);

		System.out.println(name);

		Collections.sort(name);

		System.out.println(name);

		Collections.reverse(name);

		System.out.println(name);

	}

}
