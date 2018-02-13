package sadovnikov.oop;

import java.math.*;
import java.util.Arrays;

public class module2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.UP);
        moveRobot(robot, -5, -5);
        System.out.println(robot.getX());
        System.out.println(robot.getY());
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction dir;

        public Robot(int x, int y, Direction dir) {
            this.x = x;
            this.y = y;
            this.dir = dir;
        }

        public Direction getDirection() {
            return dir;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (dir == Direction.UP) {
                dir = Direction.LEFT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.DOWN;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.UP;
            }
        }

        public void turnRight() {
            if (dir == Direction.UP) {
                dir = Direction.RIGHT;
            } else if (dir == Direction.DOWN) {
                dir = Direction.LEFT;
            } else if (dir == Direction.LEFT) {
                dir = Direction.UP;
            } else if (dir == Direction.RIGHT) {
                dir = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (dir == Direction.UP) {
                y++;
            }
            if (dir == Direction.DOWN) {
                y--;
            }
            if (dir == Direction.LEFT) {
                x--;
            }
            if (dir == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // your code
        int a = Math.abs(toX - robot.getX());
        int b = Math.abs(toY - robot.getY());
        if (toX - robot.getX() > 0) {
            while (robot.getDirection() != Direction.RIGHT){
                robot.turnRight();
            }
            //System.out.println(robot.getDirection());
        } else if (toX - robot.getX() < 0){
            while (robot.getDirection() != Direction.LEFT){
                robot.turnRight();
            }
            //System.out.println(robot.getDirection());
        }
        for (int i = 0; i < a; i++) {
            //System.out.print("i=");
            //System.out.println(i);
            robot.stepForward();
        }
        if (toY - robot.getY() > 0) {
            while (robot.getDirection() != Direction.UP){
                robot.turnRight();
            }
        } else if (toY - robot.getY() < 0){
            while (robot.getDirection() != Direction.DOWN){
                robot.turnRight();
            }
        }
        for (int j = 0; j < b; j++) {
            //System.out.print("j=");
            //System.out.println(j);
            robot.stepForward();
        }
    }

}