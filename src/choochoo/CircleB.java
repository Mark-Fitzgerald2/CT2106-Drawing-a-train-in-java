package choochoo;

public class CircleB extends DrawingB{

	private PointB centerPoint;
	private double r;
	
	
	public CircleB(PointB hub, double r) {
		this.centerPoint = hub;
		this.r = r;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getArea(){
		return (r * r * Math.PI);
	}
	
	@Override
	public int getNumShapes(){
		return 1;
	}
	
	@Override
	public int getNumCircles(){
		return 1;
	}
	
	@Override
	public int getNumShapesBody(){
		return 1;
	}
	
	@Override
	public int getNumShapesChassis(){
		return 1;
	}
}