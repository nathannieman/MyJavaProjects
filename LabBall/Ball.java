public class Ball
{
   //fields
   private double size;
   private boolean isBlack;
   
   //constructors
   public Ball()
   {
      this(6.0, false);
   }
   
   public Ball(double size)
   {
      this(size, true);
   }
   
   public Ball(double size, boolean isBlack)
   {
      this.size = size;
      this.size = size;
   }
   
   //methods
   public double getSize()
   {
      return size;
   }
   
   
   public void setSize(double size)
   {
      if (size>=0)
      {
         this.size = size;
      }
      
   }
   
   public void roll()
   {
      System.out.println("rolling... ");
   }
   
   public void roll(int howManyTimes)
   {
      System.out.println("myBall2 is rolling " + howManyTimes + " times");
   }
   
   public boolean isBlack()
   {
      if this.isBlack {
      return isBlack;}
   }
   
   public void bounce(int numberofBounces)
   {
      System.out.println("myBall is bouncing " + numberofBounces + " times");
   }
}
