package ArrayList;

public class Pair<X,Y> { // generics class
	X x;
	Y y;
	public Pair(X x,Y y) {
		this.x=x;
		this.y=y;
	}
	public void getDescription() {
		System.out.println(x+" and "+y);
	}

}
