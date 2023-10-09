
public class Cone extends Shape {

	public double radius;
	public double height;
	
	@Override
	public double surface_area() {
		// TODO Auto-generated method stub
		return Math.PI * radius * ( radius + Math.sqrt((height*height) + (radius * radius)));
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius * height/3;
	}

	public Cone(double r, double h) {
		radius = r;
		height = h;
	}
	
	public String toSring() {
		String s = "Surface Area: " + String.valueOf(surface_area()) + " Volume: " + String.valueOf(volume());
		return s;
	}
}
