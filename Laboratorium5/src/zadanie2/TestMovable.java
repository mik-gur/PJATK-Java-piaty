package zadanie2;

public class TestMovable {
    public static void main(String[] args) {
        Movable p1 = new MovablePoint(0, 0, 1, 1);
        System.out.println(p1);
        p1.moveUp();
        System.out.println("After move up: \n"+p1);
        p1.moveLeft();
        System.out.println("After move left: \n"+p1);
        p1.moveDown();
        System.out.println("After move down: \n"+p1);
        p1.moveRight();
        System.out.println("After move right: \n"+p1);
    }
}