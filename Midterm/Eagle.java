/*****************************************
* Author : Nathan Nieman
* Date : 10/05/2020
* Assignment: Midterm
******************************************/

public class Eagle{
   //Fields
  private int mouseCount;
   
   //Constructors
   public Eagle(int count)
   {
      if(count >= 0)
      {
			this.mouseCount = count;
      }
   }
   
   //Methods
   public void catchMouse()
   {
		this.mouseCount++;

		if(this.mouseCount>35)
      {
			this.mouseCount=0;
      }
	}

	public int getMouseCount()
   {
		return this.mouseCount;
	}

	public void fly()
   {

		System.out.println("flying...");

	}
}