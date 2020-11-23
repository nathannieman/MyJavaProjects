public class Conveyor
{
   //fields 
   private String type;
   private double speed;
   
   //constructors

   public Conveyor(String type, double speed)
   {
      this.type = type;
      if (speed >0)
      {
         this.speed = speed;
      }
      else
      {
         speed = 0;
      }
   }

   //methods
   public double getSpeed()
   {
      return speed;
   }

   public void setSpeed(double speed) 
   {
      if (speed > 0)
      { 
         this.speed = speed;
      }
   }
   
   public String getType()
   {
      return type;
   }
   
   
   public double timeToTransport (double distance)
   {
      return distance/speed;
   }
}
