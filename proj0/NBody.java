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

}
