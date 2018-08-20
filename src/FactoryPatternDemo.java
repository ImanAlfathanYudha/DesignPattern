import org.w3c.dom.css.Rect;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// get an object of Circle and call its draw method.
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		// call draw method of Circle
		shape1.draw();
		((Circle) shape1).setLuas(((Circle) shape1).getSisi());
		((Circle) shape1).setKeliling(((Circle) shape1).getSisi());
		System.out.println("sisi " + ((Circle) shape1).getSisi());
		System.out.println("luas " + ((Circle) shape1).getLuas()+ " keliling " + ((Circle) shape1).getKeliling());

		// get an object of Rectangle and call its draw method.
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		// call draw method of Rectangle
		shape2.draw();
		((Rectangle) shape2).setLuas(((Rectangle) shape2).getSisi());
		((Rectangle) shape2).setKeliling(((Rectangle) shape2).getSisi());
		System.out.println("sisi " + ((Rectangle) shape2).getSisi());
		System.out.println("luas " + ((Rectangle) shape2).getLuas()+ " keliling " + ((Rectangle) shape2).getKeliling());

		// get an object of Square and call its draw method.
		Shape shape3 = shapeFactory.getShape("SQUARE");
		// call draw method of square
		shape3.draw();
		((Square) shape3).setLuas(((Square) shape3).getSisi());
		((Square) shape3).setKeliling(((Square) shape3).getSisi());
		System.out.println("sisi " + ((Square) shape3).getSisi());
		System.out.println("luas " + ((Square) shape3).getLuas() + " keliling " + ((Square) shape3).getKeliling());
	}
}