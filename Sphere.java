
public class Sphere extends Shape {

	public double radius;
	@Override
	public double surface_area() {
		// TODO Auto-generated method stub
		return 4*Math.PI*radius*radius;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 4/3*Math.PI*radius*radius*radius;
	}
	
	public Sphere(double r) {
		radius = r;
	}
	
	public String toSring() {
		String s = "Surface Area: " + String.valueOf(surface_area()) + " Volume: " + String.valueOf(volume());
		return s;
	}

}
