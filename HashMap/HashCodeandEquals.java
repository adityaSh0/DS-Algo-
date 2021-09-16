package HashMap;

import java.util.HashSet;
import java.util.Set;

public class HashCodeandEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pen p1=new Pen(10,"blue");
		Pen p2=new Pen(10,"blue");
		Set<Pen> s=new HashSet<>();
		s.add(p1);
		s.add(p2);
		System.out.println(s);
	}
}
class Pen{
	int price;
	String color;
	public Pen(int price, String color) {
		this.price=price;
		this.color=color;
	}
	public boolean equals(Object obj) {
		Pen that=(Pen) obj;
		boolean isEqual=this.price==that.price && this.color.equals(that.color); 
		return isEqual;
		
	}
	public int hashCode() {
		return price+color.hashCode();
	}

}
