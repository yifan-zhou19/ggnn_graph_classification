package <missing>;

public class GlobalMembers
{
	//*************************************************
	//??????3?5?7????                     *
	//??????                                    *
	//??9?28?                                     *
	//************************************************* 
	public static int Main()
	{
	   //????s?????? 
	   int s;
	   s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   //???????3?5?7?????????? 
	   if ((s % 3 == 0) + (s % 5 == 0) + (s % 7 == 0) == 3)
	   {
		   System.out.print("3 5 7");
	   }
	   if ((s % 3 == 0) + (s % 5 == 0) + (s % 7 == 0) == 2)
	   {
			 if (s % 3 != 0)
			 {
				 System.out.print("5 7");
			 }
			 if (s % 5 != 0)
			 {
				 System.out.print("3 7");
			 }
			 if (s % 7 != 0)
			 {
				 System.out.print("3 5");
			 }
	   }
		if ((s % 3 == 0) + (s % 5 == 0) + (s % 7 == 0) == 1)
		{
				if (s % 3 == 0)
				{
					System.out.print("3");
				}
				if (s % 5 == 0)
				{
					System.out.print("5");
				}
				if (s % 7 == 0)
				{
					System.out.print("7");
				}
		}
		if ((s % 3 == 0) + (s % 5 == 0) + (s % 7 == 0) == 0)
		{
			System.out.print("n");
		}
		return 0;
	}


}

