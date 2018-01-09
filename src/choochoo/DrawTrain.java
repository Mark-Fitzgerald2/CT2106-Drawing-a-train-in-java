package choochoo;

public class DrawTrain {

	public static void main(String[] args) {

		// for this program, we'll assume that the input is an array of double values
		double[] input = {0,8,3,5,1.5,0.75,3.25,4.75,6.25,7.75,9.25,10,2.5,1,3.5,4.5,5.5,9.5,8.5,7.5,2,7,12,0.5};

		//create a new Drawing
		DrawingB train = new DrawingB();

		PointB point1 = new PointB(input[0], input[1]); // (x, y) coordinates
		RectangleB body = new RectangleB(point1, input[2], input[3]); // (top left hand point, width, height)

		PointB point2 = new PointB(input[2], input[15]); // (x, y) coordinates
		RectangleB top = new RectangleB(point2, input[21], input[20]); // (top left hand point, width, height)
		
		PointB point3 = new PointB(input[11], input[14]); // (x,y) center of circle coordinates
		CircleB frontCircle = new CircleB(point3, input[13]); // (centre, radius)

		train.add(body); // add body to car Drawing
		train.add(top); // add top to car Drawing
		train.add(frontCircle); //add frontCircle to car Drawing
		train.addCircle(frontCircle); //add frontCircle to circle array
		train.addRectangle(body); //add body to rectangle array
		train.addRectangle(top); //add top to rectangle array
		train.addBody(body); //add body to body array
		train.addBody(top); //add top to body array
		train.addBody(frontCircle); //add frontCircle to body array
		train.printNumShapesBody(); //print number of shapes in the body of the train

		PointB hub1 = new PointB(input[4], input[4]); // (x, y) coordinates
		PointB hub2 = new PointB(input[6], input[5]); // (x, y) coordinates
		PointB hub3 = new PointB(input[7], input[5]); // (x, y) coordinates
		PointB hub4 = new PointB(input[8], input[5]); // (x, y) coordinates
		PointB hub5 = new PointB(input[9], input[5]); // (x, y) coordinates
		PointB hub6 = new PointB(input[10], input[5]); // (x, y) coordinates
		PointB hub7 = new PointB(input[2], input[12]); // (x, y) coordinates
		PointB hub8 = new PointB(input[11], input[12]); // (x, y) coordinates
		PointB hub9 = new PointB(input[11], input[0]); // (x, y) coordinates
		PointB hub10 = new PointB(input[22], input[0]); // (x, y) coordinates

		CircleB wheel1 = new CircleB(hub1, input[4]); // (centre, radius)
		CircleB wheel2 = new CircleB(hub2, input[5]); // (centre, radius)
		CircleB wheel3 = new CircleB(hub3, input[5]); // (centre, radius)
		CircleB wheel4 = new CircleB(hub4, input[5]); // (centre, radius)
		CircleB wheel5 = new CircleB(hub5, input[5]); // (centre, radius)
		CircleB wheel6 = new CircleB(hub6, input[5]); // (centre, radius)
		RectangleB bar = new RectangleB(hub7, input[21], input[13]); // (centre, radius)
		RightAngleTriangle frontTriangle = new RightAngleTriangle(hub8, hub9, hub10, input[12], input[20]); 
		//(top point of triangle, point under the top point, third point,  height, breadth)

		DrawingB chassis = new DrawingB(); //creates chassis drawing
		chassis.add(wheel1); // add wheel1 to chassis Drawing
		chassis.add(wheel2); // add wheel2 to chassis Drawing
		chassis.add(wheel3); // add wheel3 to chassis Drawing
		chassis.add(wheel4); // add wheel4 to chassis Drawing
		chassis.add(wheel5); // add wheel5 to chassis Drawing
		chassis.add(wheel6); // add wheel6 to chassis Drawing
		chassis.add(bar); // add bar to chassis Drawing
		chassis.add(frontTriangle); //add frontTriangle to chassis Drawing

		train.add(chassis); //add chassis Drawing to car Drawing
		train.addCircle(wheel1); //add wheel1 to circle array
		train.addCircle(wheel2); //add wheel2 to circle array
		train.addCircle(wheel3); //add wheel3 to circle array
		train.addCircle(wheel4); //add wheel4 to circle array
		train.addCircle(wheel5); //add wheel5 to circle array
		train.addCircle(wheel6); //add wheel6 to circle array
		train.addRectangle(bar); //add bar to rectangle array
		train.addTriangle(frontTriangle); //add frontTriangle to triangle array
		train.addChassis(wheel1); //add wheel1 to chassis array
		train.addChassis(wheel2); //add wheel2 to chassis array
		train.addChassis(wheel3); //add wheel3 to chassis array
		train.addChassis(wheel4); //add wheel4 to chassis array
		train.addChassis(wheel5); //add wheel5 to chassis array
		train.addChassis(wheel6); //add wheel6 to chassis array
		train.addChassis(bar); //add bar to chassis array
		train.addChassis(frontTriangle); //add frontTriagnle to chassis array
		train.printNumShapesChassis(); //prints number of shapes in chassis
		
		PointB dot1 = new PointB(input[18], input[19]); // (x, y) coordinates
		PointB dot2 = new PointB(input[18], input[16]); // (x, y) coordinates
		PointB dot3 = new PointB(input[1], input[16]); // (x, y) coordinates
		PointB dot4 = new PointB(input[17], input[19]); // (x, y) coordinates
		PointB dot5 = new PointB(input[17], input[16]); // (x, y) coordinates
		PointB dot6 = new PointB(input[11], input[16]); // (x, y) coordinates
		
		RectangleB base = new RectangleB(dot1, input[20], input[13]); // (top left hand point, width, height)
		RightAngleTriangle side1 = new RightAngleTriangle(dot1, dot2, dot3, input[20], input[23]); 
		//(top point of triangle, point under the top point, third point,  height, breadth)
		RightAngleTriangle side2 = new RightAngleTriangle(dot4, dot5, dot6, input[20], input[23]); 
		//(top point of triangle, point under the top point, third point,  height, breadth)
		RectangleB centerChimney = new RectangleB(dot1, input[13], input[20]); // (top left hand point, width, height)		
		
		DrawingB chimney = new DrawingB(); //creates chimney drawing
		chimney.add(base); //adds the base to the chimney drawing
		chimney.add(side1); //adds side1 to the chimney drawing
		chimney.add(side2); //adds side2 to the chimney drawing
		chimney.add(centerChimney); //adds the centerChimeny to the chimney drawing
		
		
		train.add(chimney); //adds the chimney drawing to the train drawing
		train.addRectangle(base); //adds the base to the rectangle array
		train.addRectangle(centerChimney); //adds the centerChimney to the rectangle array
		train.addTriangle(side1); //adds the side1 to the triangle array
		train.addTriangle(side2); //adds the side2 to the triangle array
		train.addChimney(base); //adds the base to the chimney array
		train.addChimney(centerChimney); //adds the centerChimney to the chimney array
		train.addChimney(side1); //adds the side1 to the chimney array
		train.addChimney(side2); //adds the side2 to the chimney array

		//print number of shapes in the chimney
		train.printNumShapesChimney();
		//print number of shapes
		train.printNumShapes();
		//print area
		train.printArea();
		//print number of circles
		train.printNumCircles();
		//print number of rectangles
		train.printNumRectangles();
		//print number of triangles
		train.printNumTriangles();

	}

}
