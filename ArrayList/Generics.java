package ArrayList;
import java.util.ArrayList;
public class Generics {

	public static void main(String[] args) {
//		ArrayList fruits=new ArrayList();
		Pair<String,Integer> obj=new Pair("Puru",21);   // generics example
		Pair<Boolean,String> obj1=new Pair(true,"Puru");
		obj.getDescription();
		obj1.getDescription();

	}

}
