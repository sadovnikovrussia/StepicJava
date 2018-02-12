package sadovnikov.oop;

import java.math.*;
import java.util.Arrays;

public class module2 {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direction.RIGHT);
        moveRobot(robot, 10, 0);
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
        int a = 0;
        int b = 0;
        int[] location = new int[]{robot.getX(), robot.getY()};
        if (robot.getDirection() == Direction.UP) {
            a = 0;
            b = 1;
        } else if (robot.getDirection() == Direction.RIGHT) {
            a = 1;
            b = 0;
        } else if (robot.getDirection() == Direction.LEFT) {
            a = -1;
            b = 0;
        } else if (robot.getDirection() == Direction.DOWN) {
            a = 0;
            b = -1;
        }
        int[] start_napravlenie = new int[]{a, b};
        int[] vector = new int[]{toX - robot.getX(), toY - robot.getY()};
        System.out.println(Arrays.toString(start_napravlenie));
        System.out.println(Arrays.toString(vector));
        int vect_mult = start_napravlenie[0] * vector[0] - start_napravlenie[1] * vector[1];
        int scal_mult = start_napravlenie[0] * vector[0] + start_napravlenie[1] * vector[1];
        // неколлинеарные векторы
        if (vect_mult < 0) {
            robot.turnRight();
        } else {
            robot.turnRight();
        }
        while (toX - robot.getX() != 0 | toX - robot.getY() != 0) {
            System.out.println("cycle");
            robot.stepForward();
        }
        if (vect_mult < 0) {
            robot.turnRight();
        } else {
            robot.turnRight();
        }
        while (toX - robot.getX() != 0 & toX - robot.getY() != 0) {
            robot.stepForward();
        }

    }


}