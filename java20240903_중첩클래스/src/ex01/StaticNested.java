package ex01;


class Outer{
	public static int num;
	
	
	private int age = 10;
	
	
	static class Nested1{//정적 중첩클래스
		void add(int n) {
			num += n;
		}
	}
	
	
	static class Nested2{
		int get() {return num;}
	}
	
	int getAge() {return num;}
	
	
}


public class StaticNested {

	public static void main(String[] args) {

		Outer.Nested1 nested1 = new Outer.Nested1();
		
		nested1.add(10);
		
		Outer.Nested2 nested2 = new Outer.Nested2();
		
		System.out.println(nested2.get());
		
	}

}
