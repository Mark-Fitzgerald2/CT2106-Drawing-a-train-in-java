package choochoo;

public class RectangleB extends DrawingB {
	
	private PointB cornerPoint;
	private double x;
	private double y;

	public RectangleB(PointB point2, double x, double y) {
		this.cornerPoint = point2;
		this.x = x;
		this.y = y;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea(){
		return (this.x * this.y);
	}
	
	@Override
	public int getNumShapes(){
		return 1;
	}

	@Override
	public int getNumRectangles() {
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
	
	@Override
	public int getNumShapesChimney(){
		return 1;
	}
}
