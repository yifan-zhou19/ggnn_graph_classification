package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 3 > 0 && x % 7 > 0 && x % 5 > 0)
		{
			System.out.print("n");
		}
		  else
		  {
				 if (x % 105 == 0)
				 {
					 System.out.print("3 5 7");
				 }
				   else if (x % 15 == 0)
				   {
					   System.out.print("3 5");
				   }
						 else if (x % 21 == 0)
						 {
							 System.out.print("3 7");
						 }
							  else if (x % 35 == 0)
							  {
								  System.out.print("5 7");
							  }
										 else
										 {
											   if (x % 3 == 0)
											   {
												   System.out.print("3");
											   }
											   if (x % 5 == 0)
											   {
												   System.out.print("5");
											   }
											   if (x % 7 == 0)
											   {
												   System.out.print("7");
											   }
										 }
		  }
		return 0;
	}

}

