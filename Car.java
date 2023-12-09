package first;

public class Car {
void stop() {
	System.out.println("stop vehicle");
}
}
class override extends Car{
void stop() {
	System.out.println("stop vehicle");
}
public static void main(String[] args) {
	override c = new  override();
	c.stop();
}
}
