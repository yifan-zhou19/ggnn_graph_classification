package <missing>;

public class GlobalMembers
{
	//?????? 1300012809 **
	//**************************
	public static int Main() //???
	{
	   int a;
	   a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   char g; //??????
		   g = ' ';
	   int x;
	   int y;
	   int z;
	   if (a % 3 == 0)
	   {
		   x = 1;
	   }
	   if (a % 5 == 0)
	   {
		   y = 1;
	   }
	   if (a % 7 == 0)
	   {
		   z = 1;
	   }
	   {
		   if (x == 1) //??????
		   {
			   if (y == 1)
			   {
				   if (z == 1)
				   {
					   System.out.print("3");
					   System.out.print(g);
					   System.out.print("5");
					   System.out.print(g);
					   System.out.print("7");
					   System.out.print("\n");
				   }
				   else
				   {
					   System.out.print("3");
					   System.out.print(g);
					   System.out.print("5");
					   System.out.print("\n");
				   }
			   }
		   }
   }
   {
		   if (x == 1)
		   {
				   if (y != 1)
				   {
					  if (z == 1)
					  {
						  System.out.print("3");
						  System.out.print(g);
						  System.out.print("7");
						  System.out.print("\n");
					  }
				   }
		   }
   }
   {
		   if (x == 1)
		   {
					   if (y != 1)
					   {
						if (z != 1)
						{
							System.out.print("3");
							System.out.print("\n");
						}
					   }
		   }
   }
   {
		   if (x != 1)
		   {
			 if (y == 1)
			 {
				if (z == 1)
				{
					System.out.print("5");
					System.out.print(g);
					System.out.print("7");
					System.out.print("\n");
				}
					 else
					 {
						 System.out.print("5");
						 System.out.print("\n");
					 }
			 }
		   }
}
{
		if (x != 1)
		{
			if (y != 1)
			{
				if (z == 1)
				{
					System.out.print("7");
					System.out.print("\n");
				}
			}
		}
}
		if (x != 1)
		{
		  if (y != 1)
		  {
			  if (z != 1)
			  {
				  System.out.print("n");
				  System.out.print("\n");
			  }
		  }
		}
	 return 0;
	}

}

