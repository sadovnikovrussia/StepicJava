package sadovnikov.ObraboktaOshibok.TryCatchPack;

public class Main {
    public static void main(String[] args) {

    }

    static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        boolean access = false;
        int i = 1;
        while (!access && i <= 3) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                access = true;
            } catch (RobotConnectionException e) {
                i++;
                if (i == 3){
                    throw e;
                }
            }
        }
    }
}
