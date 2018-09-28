package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int w;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 w = Integer.parseInt(tempVar);
	 }
	   if ((w + 12) % 7 == 5)
	   {
			   System.out.print("1\n");
			System.out.print("10\n");
	   }
	   if ((w + 12) % 7 == 6)
	   {
			   System.out.print("4\n");
			System.out.print("7\n");
	   }
	   if ((w + 12) % 7 == 0)
	   {
			   System.out.print("9\n");
			System.out.print("12\n");
	   }
	   if ((w + 12) % 7 == 1)
	   {
		   System.out.print("6\n");
	   }
	   if ((w + 12) % 7 == 2)
	   {
			   System.out.print("2\n");
			System.out.print("3\n");
			System.out.print("11\n");
	   }
	   if ((w + 12) % 7 == 3)
	   {
		   System.out.print("8\n");
	   }
		if ((w + 12) % 7 == 4)
		{
			System.out.print("5\n");
		}


	}
}

