package week12;

public class MovablePoint extends Point {
	private float xSpeed = 0.0f;
	private float ySpeed = 0.0f;
	
	public MovablePoint() {
		
	}
	
	public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
		super(x,y);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public MovablePoint(float xSpeed, float ySpeed) {
		super();
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public float getXSpeed() {
		return xSpeed;
	}

	public void setXSpeed(float xSpeed) {
		this.xSpeed = xSpeed;
	}

	public float getYSpeed() {
		return ySpeed;
	}

	public void setYSpeed(float ySpeed) {
		this.ySpeed = ySpeed;
	}
	
	public void setSpeed(float xSpeed, float ySpeed) {
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public float[] getSpeed() {
		float[] ans = {this.xSpeed, this.ySpeed};
		return ans;
	}
	
	@Override
	public String toString() {
		return String.format("%s,speed=(%s,%s)", super.toString(), xSpeed, ySpeed);
	}
	
	public MovablePoint move() {
		super.setX(super.getX() + xSpeed);
		super.setY(super.getY() + ySpeed);
		return this;
	}
}
