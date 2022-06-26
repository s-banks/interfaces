package Shapes;

public class Main {
	public static void main(String[] args) {
		displayShape(new Square());

	}

	static void displayShape(Shape shape) {
		System.out.println(shape.getName());
		shape.draw();
		System.out.printf("Sides: %s\n", shape.getSideCount());
		Square square = (Square) shape; //typecast square from Shape to Square
		//shape.getShapeType();
		System.out.println(square.getShapeType()); //above typecast to shape allows using a Square method
		System.out.println();
	}


}
