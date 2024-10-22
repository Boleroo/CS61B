/**
 *  Test pairwise force between planets(calcForceExertedBy)
 */
public class TestPlanet {
    public static void main(String[] args) {
        checkPlanetForce();
    }

    /**
     *  Check whether or not expected force equals actual force.
     *  @param expected      Expected double
     *  @param actual        Double received
     *  @param label         Label for test function
     *  @param eps           Tolerance for the double comparison
     */
    private static void checkEqual(double expected, double actual, String label, double eps){
        if(Math.abs(expected - actual) > eps){
            System.out.println("Fail: "+ label + ": Expected " + expected + " but got " + actual);
        }
        else{
            System.out.println("Pass: "+ label + ": Expected " + expected + " and you gave " + actual);
        }
    }

    /**
     *  Checks the Planet class to make sure calcForceExertedBy works.
     */
    private static void checkPlanetForce(){
        Planet p1 = new Planet(1.0, 1.0, 3.0, 4.0, 5.0, "jupiter.gif");
        Planet p2 = new Planet(2.0, 1.0, 3.0, 4.0, 4e11, "jupiter.gif");
        System.out.println("Checking planet force...");
        checkEqual(133.4, p1.calcForceExertedBy(p2), "Planet Force", 0.01);
    }
}
