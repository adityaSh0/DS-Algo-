package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Iteration1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m=new HashMap<>();
		m.put("p",1);
		m.put("d",2);
		for(Map.Entry<String,Integer> en:m.entrySet()) {
			System.out.println(en.getKey()+":"+en.getValue());
		}

	}

}
