package choochoo;

public class RightAngleTriangle extends DrawingB {
	
	private PointB topPoint;
	private PointB belowTop;
	private PointB thirdPoint;
	private double height;
	private double breadth;

	public RightAngleTriangle(PointB dot1, PointB dot2, PointB dot3, double height, double breadth) {
		this.topPoint = dot1;
		this.belowTop = dot2;
		this.thirdPoint = dot3;
		this.height = height;
		this.breadth = breadth;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea(){
		return (0.5 * this.height * this.breadth);
	}
	
	@Override
	public int getNumShapes(){
		return 1;
	}
	
	@Override
	public int getNumTriangles(){
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
