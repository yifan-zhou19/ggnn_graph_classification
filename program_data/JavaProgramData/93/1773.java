package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int z;
		int i;
	  i = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 z = Integer.parseInt(tempVar);
	 }
	 if (z % 3 == 0)
	 {
		 System.out.print("3");
		 i = i + 1;
	 }
	  if (z % 5 == 0)
	  {
		  if (i == 1)
		  {
			  System.out.print(" ");
		  }
		  System.out.print("5");
		  i = i + 1;
	  }
	   if (z % 7 == 0)
	   {
		   if (i != 0)
		   {
			   System.out.print(" ");
		   }
		   System.out.print("7");
		   i = i + 1;
	   }
		if (i == 0)
		{
			System.out.print("n");
		}
	}




}

