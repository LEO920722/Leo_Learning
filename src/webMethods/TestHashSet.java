package webMethods;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "q", "q", "c", "c", "d" };
		HashSet result = new HashSet();
		for (int i = 0; i < input.length; i++) {
			result.add(input[i]);
		}
		String[] output = new String[result.size()];
		Iterator iter = result.iterator();
		int n = 0;
		while(iter.hasNext())
		{
			output[n] = (String) iter.next();
			n++;
		}
	}

}
