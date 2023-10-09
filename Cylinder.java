
public class Cylinder extends Shape {

	public double radius;
	public double height;
	
	@Override
	public double surface_area() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius*height;
	}
	
	public Cylinder(double r, double h) {
		radius = r;
		height = h;
	}
	
	public String toSring() {
		String s = "Surface Area: " + String.valueOf(surface_area()) + " Volume: " + String.valueOf(volume());
		return s;
	}
}
