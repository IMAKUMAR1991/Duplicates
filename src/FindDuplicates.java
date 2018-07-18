import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("mitu");
		names.add("bacchu");
		names.add("khokon");
		names.add("rana");
		names.add("panna");
		names.add("tito");
		names.add("zahid");
		names.add("mitu");
		names.add("mitu");
		names.add("panna");
		Set<String> nodup = new HashSet<String>();
		Set<String> nodup1 = new HashSet<String>();
		
		for (String s1  : names) {
			if (nodup.add(s1) == false){

				System.out.println(s1);
			nodup1.add(s1);
			}
			
		}
		System.out.println(nodup1);

	}
}
