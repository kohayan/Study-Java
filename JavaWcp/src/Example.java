import inner_class_sample.Outer;
import inner_class_sample.Outer2;

public class Example {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();

		Outer2 outer2 = new Outer2();
		Outer2.Inner2 inner2 = new Outer2.Inner2();
	}
}
