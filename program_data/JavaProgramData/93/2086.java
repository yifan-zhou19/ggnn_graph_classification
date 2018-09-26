package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
		if (i % 3 == 0)

		{
	 System.out.print("3");
		 if (i % 5 == 0)
		 {
			 System.out.print(" 5");
		 }
			  if (i % 7 == 0)
			  {
				System.out.print(" 7");
			  }
		}
		 if (i % 3 > 0)
		 {
			 if (i % 5 == 0)
			 {
			 System.out.print("5");
			  if (i % 7 == 0)
			  {
				  System.out.print(" 7");
			  }
			 }
		 if (i % 5 > 0)
		 {
			 if (i % 7 == 0)
			 {
				  System.out.print("7");
			 }
		 }
		 }
		 if (i % 3 != 0 && i % 5 != 0 && i % 7 != 0)
		 {
			 System.out.print("n");
		 }
	return 0;
	}
}

