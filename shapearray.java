
public class ShapeArray {

	public static void main(String[] args) {
		Sphere sphere = new Sphere(3.5);
		Cylinder cylinder = new Cylinder(1.5, 5.0);
		Cone cone = new Cone(2.0, 4.0);
		
		Shape[] shapeArray = new Shape[3];
		shapeArray[0] = sphere;
		shapeArray[1] = cylinder;
		shapeArray[2] = cone;
		
		for(int i = 0; i < shapeArray.length; i++) {
			System.out.println(shapeArray[i].toString());
		}
	}

}
