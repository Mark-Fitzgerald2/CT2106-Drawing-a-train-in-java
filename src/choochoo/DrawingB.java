package choochoo;

import java.util.ArrayList;

public class DrawingB extends AbstractDrawingB{
	
	private ArrayList<AbstractDrawingB> drawing = new ArrayList<AbstractDrawingB>();
	private ArrayList<AbstractDrawingB> circles = new ArrayList<AbstractDrawingB>();
	private ArrayList<AbstractDrawingB> rectangles = new ArrayList<AbstractDrawingB>();
	private ArrayList<AbstractDrawingB> triangles = new ArrayList<AbstractDrawingB>();
	private ArrayList<AbstractDrawingB> body = new ArrayList<AbstractDrawingB>();
	private ArrayList<AbstractDrawingB> chassis = new ArrayList<AbstractDrawingB>();
	private ArrayList<AbstractDrawingB> chimney = new ArrayList<AbstractDrawingB>();
	
	public double getArea() { //calculates area
		double Totalarea = 0;
		for(AbstractDrawingB area : drawing){
			Totalarea += area.getArea();
		}
		return Totalarea;
	}
	
	public int getNumShapes() { //calculates number of shapes
		int numShapes = 0;
		for(AbstractDrawingB drawing : drawing){
			numShapes += drawing.getNumShapes();
		}
		return numShapes;
	}

	public void printArea() { //prints area
		System.out.println("The total area of the shapes in the drawing is: " + this.getArea());
	}

	public void printNumShapes() { //prints number of shapes
		System.out.println("The total number of shapes is: " + this.getNumShapes());	
	}

	public void add(DrawingB drawing) { //adds everything  to the drawing
		this.drawing.add(drawing);
	}

	public void printNumCircles() { //prints number of circles
		System.out.println("The total number of circles in this drawing is: " + this.getNumCircles());
	}

	public int getNumCircles() { //calculates number of circles
		int numCircles = 0;
		for(AbstractDrawingB circles : circles){
			numCircles += circles.getNumCircles();
		}
		return numCircles;
	}

	public void addCircle(CircleB circle) { //adds circles to array
		this.circles.add(circle);
	}

	public void addRectangle(RectangleB rectangle) { //adds rectangles to array
		this.rectangles.add(rectangle);
	}

	public void printNumRectangles() { //prints number of rectangles
		System.out.println("The total number of rectangles in this drawing is: " + this.getNumRectangles());
	}

	public int getNumRectangles() { //calculates number of rectangles
		int numRectangles = 0;
		for(AbstractDrawingB rectangles : rectangles){
			numRectangles += rectangles.getNumRectangles();
		}
		return numRectangles;
	}

	public void addTriangle(RightAngleTriangle triangle) { //adds triangles to array
		this.triangles.add(triangle);
	}

	public void printNumTriangles() { //prints number of triangles
		System.out.println("The total number of triangles in this drawing is: " + this.getNumTriangles());
	}

	public int getNumTriangles() { //calculates number of triangles
		int numTriangles = 0;
		for(AbstractDrawingB triangles : triangles){
			numTriangles += triangles.getNumTriangles();
		}
		return numTriangles;
	}

	public void printNumShapesBody() { //prints number of shapes in body
		System.out.println("The total number of shapes in the body of the train is: " + this.getNumShapesBody());
		
	}

	public int getNumShapesBody() { //calculates number of shapes in body
		int numShapesBody = 0;
		for(AbstractDrawingB body : body){
			numShapesBody += body.getNumShapesBody();
		}
		return numShapesBody;
	}

	public void printNumShapesChassis() { //prints number of shapes in chassis
		System.out.println("The total number of shapes in the chassis of the train is: " + this.getNumShapesChassis());
	}

	public int getNumShapesChassis() { //calculate number of shapes in chassis
		int numShapesChassis = 0;
		for(AbstractDrawingB chassis : chassis){
			numShapesChassis += chassis.getNumShapesChassis();
		}
		return numShapesChassis;
	}

	public void printNumShapesChimney() { //prints number of shapes in chimney
		System.out.println("The total number of shapes in the chimney of the train is: " + this.getNumShapesChimney());
	}

	public int getNumShapesChimney() { //calculate number of shapes in chimney
		int numShapesChimney = 0;
		for(AbstractDrawingB chimney : chimney){
			numShapesChimney += chimney.getNumShapesChimney();
		}
		return numShapesChimney;
	}

	public void addBody(DrawingB body) { //adds body shapes to array
		this.body.add(body);
	}

	public void addChassis(DrawingB chassis) { //adds chassis shapes to array
		this.chassis.add(chassis);
	}

	public void addChimney(DrawingB chimney) { //adds chimney shapes to array
		this.chimney.add(chimney);
	}
}
