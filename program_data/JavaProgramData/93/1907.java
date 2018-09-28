package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int a;
	   int x;
	   int y;
	   int z;
	   x = y = z = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   a = Integer.parseInt(tempVar);
	   }
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
	   if (x == 1 && y == 1 && z == 1)
	   {
		   System.out.print("3 5 7\n");
	   }
		   else if (x == 1 && y == 1 && z == 0)
		   {
			   System.out.print("3 5\n");
		   }
			else if (x == 1 && y == 0 && z == 1)
			{
				System.out.print("3 7\n");
			}
	 else if (x == 0 && y == 1 && z == 1)
	 {
		 System.out.print("5 7\n");
	 }
	 else if (x == 1 && y == 0 && z == 0)
	 {
		 System.out.print("3\n");
	 }
	 else if (x == 0 && y == 1 && z == 0)
	 {
		 System.out.print("5\n");
	 }
	else if (x == 0 && y == 0 && z == 1)
	{
		System.out.print("7\n");
	}
	 else
	 {
		 System.out.print("n\n");
	 }
	}
}

