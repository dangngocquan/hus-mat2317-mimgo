package week12;

public class Point3D extends Point2D {
	private float z = 0.0f;
	
	public Point3D() {
		
	}
	
	public Point3D(float x, float y, float z) {
		super(x,y);
		this.z = z;
	}

	public float getZ() {
		return this.z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
	public void setXYZ(float x, float y, float z) {
		super.setXY(x, y);
		this.z = z;
	}
	
	public float[] getXYZ() {
		float[] ans = new float[3];
		ans[0] = super.getXY()[0];
		ans[1] = super.getXY()[1];
		ans[2] = this.z;
		return ans;
 	}
	
	public String toString() {
		return String.format("(%s,%s,%s)", super.getX(), super.getY(), this.z);
	}
}
