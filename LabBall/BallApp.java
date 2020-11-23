/*****************************************
* Author : Nathan Nieman
* Date : 10/2/2020
* Assignment: LabBall2
******************************************/

public class BallApp 
{
   public static void main(String[] args)
   {
      //Create instance of Ball and set size
      Ball myBall = new Ball();
      Ball myBall1 = new Ball();
      
      myBall.setSize(6);
      System.out.printf("myBall size: %.1f%n", myBall.getSize());
   
      //Make the ball bounce
      myBall.bounce(14);
      
      myBall1.setSize(8);
      System.out.printf("myBall1 size is: %.1f%n", myBall1.getSize());
      
      Ball myBall2 = new Ball(5, true);
      myBall2.roll(10);
      System.out.printf("myBall2 is black %s ", myBall2.isBlack());
      
   }
}