public class Planet{
	private static final double G = 6.67e-11;
	public double xxPos;
	public double yyPos;
	public double xxVel;
	public double yyVel;
	public double mass;
	public String imgFileName;

	public Planet(double xP, double yP, double xV, double yV, double m, String img){
		xxPos = xP;
		yyPos = yP;
		xxVel = xV;
		yyVel = yV;
		mass = m;
		imgFileName = img;
	}

	public Planet(Planet p){
		xxPos = p.xxPos;
		yyPos = p.yyPos;
		xxVel = p.xxVel;
		yyVel = p.yyVel;
		mass = p.mass;
		imgFileName = p.imgFileName;
	}

	public double calcDistance(Planet p){
		double xd = p.xxPos-xxPos;
		double yd = p.yyPos-yyPos;
		return Math.sqrt(Math.pow(xd,2)+(Math.pow(yd,2)));
	}

	public double calcForceExertedBy(Planet p){
		double num = G * mass * p.mass;
		return num/(Math.pow(calcDistance(p),2));
	}

	public double calcForceExertedByX(Planet p){
		double ratio = p.xxPos-xxPos;
		return calcForceExertedBy(p)*ratio/calcDistance(p);
	}

	public double calcForceExertedByY(Planet p){
		double ratio = p.yyPos-yyPos;
		return calcForceExertedBy(p)*ratio/calcDistance(p);
	}

	 public double calcNetForceExertedByX(Planet[] planet){
		double force = 0;
		for(Planet p: planet){
			if(!p.equals(this)){
				force += calcForceExertedByX(p);
			}
		}
		return force;
	 }

	public double calcNetForceExertedByY(Planet[] planet){
		double force = 0;
		for(Planet p: planet){
			if(!p.equals(this)){
				force += calcForceExertedByY(p);
			}
		}
		return force;
	}

	public void update(double dt, double fX, double fY){
		double aX = fX/mass;
		double aY = fY/mass;
		xxVel += aX*dt;
		yyVel += aY*dt;
		xxPos +=xxVel*dt;
		yyPos +=yyVel*dt;
	}

	public void draw(){
		String file = "images/"+imgFileName;
		StdDraw.picture(xxPos, yyPos, file);
	}
}