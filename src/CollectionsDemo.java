import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = Arrays.asList("Hello","Hi","Welcome");

		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		for(String it : list) {
			System.out.println(it);
		}
		
		list.forEach(System.out::println);
		
		list.forEach(itt -> {
			System.out.println(itt);
		});
	}

}
