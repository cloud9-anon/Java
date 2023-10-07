	import java.lang.*;

	class Point2D {

	    private int x;
	    private int y;

	    Point2D(int m, int n) {
		x = m;
		y = n;
	    }

	    public void show() {
		System.out.println("X coordinate is : " + x);
		System.out.println("Y coordinate is : " + y);
	    }

	    public boolean isEqual(Point2D obj2) {
		return this.x == obj2.x && this.y == obj2.y;
	    }

	    public double distance(Point2D obj2) {
			double d;
		if (isEqual(obj2)) {
		    d=0;
		    System.out.println("Coordinates are equal"+ "distance = " + d);
		    } 
		else {
		   d = Math.sqrt((this.x - obj2.x) * (this.x - obj2.x) + (this.y - obj2.y) * (this.y - obj2.y));
		     }
	    return d;
	    }

	    public static void main(String[] args) {

		Point2D p1 = new Point2D(50, 23);
		Point2D p2 = new Point2D(55, 23);
		p1.show();

		if (p1.isEqual(p2)) {
		    System.out.println("Coordinates are equal");
		} else {
		    System.out.println("Coordinates are not equal");
		}

		double distance1= p1.distance(p2);
	    	System.out.println("Distance is = " + distance1);
	    }
	}

