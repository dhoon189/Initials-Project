import kareltherobot.*;

public class Main implements Directions{
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot d = new Robot(1,1,North,20);
    Robot p = new Robot(1,6,North,20);
		
    // examples of commands you can invoke on a Robot
    d.move();// move one step in the direction it is facing
    d.putBeeper();
    d.move();
	  d.putBeeper();
    d.move();
	  d.putBeeper();
    d.move();
	  d.putBeeper();
    d.move();
	  d.putBeeper();
    d.move();
	  d.putBeeper();
    d.move();
	  d.putBeeper();
    d.turnLeft();
    d.turnLeft();
    d.turnLeft();
    d.move();
	  d.putBeeper();
    d.turnLeft();
    d.turnLeft();
    d.turnLeft();
    d.move();
    d.turnLeft();
    d.move();
    d.putBeeper();
    d.move();
    d.turnLeft();
    d.turnLeft();
    d.turnLeft();
    d.move();
    d.putBeeper();
    d.move();
    d.putBeeper();
    d.move();
    d.putBeeper();
    d.move();
    d.turnLeft();
    d.turnLeft();
    d.turnLeft();
    d.move();
    d.putBeeper();
    d.move();
    d.turnLeft();
    d.move();
    d.putBeeper();

    p.move();
    p.putBeeper();
    p.move();
	  p.putBeeper();
    p.move();
	  p.putBeeper();
    p.move();
	  p.putBeeper();
    p.move();
	  p.putBeeper();
    p.move();
	  p.putBeeper();
    p.move();
	  p.putBeeper();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.move();
	  p.putBeeper();
    p.move();
	  p.putBeeper();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.move();
    p.turnLeft();
    p.move();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.putBeeper();
    p.move();
    p.putBeeper();
    p.move();
    p.turnLeft();
    p.turnLeft();
    p.turnLeft();
    p.move();
    p.putBeeper();
    p.move();
    p.putBeeper();

  }
}