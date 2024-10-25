public class NBody {
    public static double readRadius(String fpath) {
        In in = new In(fpath);
        int firstItemInFile = in.readInt();
        double secondItemInFile = in.readDouble();
        return secondItemInFile;
    }

    public static Planet[] readPlanets(String fpath){
        In in = new In(fpath);
        int num = in.readInt();
        Planet[] planets = new Planet[num];
        double secondItemInFile = in.readDouble();
        for(int i = 0; i<num; i++){
            double xp = in.readDouble();
            double yp = in.readDouble();
            double xv = in.readDouble();
            double yv = in.readDouble();
            double m = in.readDouble();
            String img = in.readString();
            planets[i] = new Planet(xp, yp, xv, yv, m, img);
        }
        return planets;
    }

    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String filename = args[2];

        double r = NBody.readRadius(filename);
        StdDraw.setXscale(-r,r);
        StdDraw.setYscale(-r,r);
        StdDraw.enableDoubleBuffering();

        Planet[] planets = readPlanets(filename);
        for(Planet p: planets){
            p.draw();
        }

        int timeStep = 0;
        int num = planets.length;
        while(timeStep < T){
            double[] xForces = new double[num];
            double[] yForces = new double[num];
            for(int i = 0;i<num;i++){
                xForces[i] = planets[i].calcNetForceExertedByX(planets);
                yForces[i] = planets[i].calcNetForceExertedByY(planets);
            }
            StdDraw.clear();
            StdDraw.picture(0, 0, "images/starfield.jpg");
            for(int i = 0; i< num; i++){
                planets[i].update(dt, xForces[i], yForces[i]);
                planets[i].draw();
            }
            StdDraw.show();
            StdDraw.pause(10);
            timeStep += dt;
        }
        StdOut.printf("%d\n", planets.length);
        StdOut.printf("%.2e\n", r);
        for (int i = 0; i < planets.length; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                    planets[i].xxPos, planets[i].yyPos, planets[i].xxVel,
                    planets[i].yyVel, planets[i].mass, planets[i].imgFileName);
        }
    }

}
