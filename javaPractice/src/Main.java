class Animal {
	String aa;
	Double bb;
	String cc;
	
	Animal (String aa , Double bb , String cc){
		this.aa = aa;
		this.bb = bb;
		this.cc = cc;
	}
	public void printInfo() {
		System.out.println("==동물 특징==");
		System.out.println("이름 = "+ aa);
		System.out.println("무게 = "+ bb);
		System.out.println("분류 = "+ cc);
	}
	
	
}
public class Main {
	public static void main(String[] args) {
		Animal animal1 = new Animal("강아지",5.0,"포유류");
		animal1.printInfo();
	}
}
