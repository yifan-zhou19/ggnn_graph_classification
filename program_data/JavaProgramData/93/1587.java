package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		x = a % 3;
		y = a % 5;
		z = a % 7;
		if (x + y + z == 0)
		{
		System.out.printf("%d %d %d",3,5,7);
		}
		else if (z != 0 && x == 0 && y == 0)
		{
		  System.out.printf("%d %d",3,5);
		}
		else if (x != 0 && y == 0 && z == 0)
		{
		  System.out.printf("%d %d",5,7);
		}
		else if (y != 0 && x == 0 && z == 0)
		{
		  System.out.printf("%d %d",3,7);
		}
		else if (z != 0 && x != 0 && y != 0)
		{
		  System.out.print("n");
		}
		else if (x == 0 && z != 0 && y != 0)
		{
		  System.out.printf("%d",3);
		}
		else if (y == 0 && z != 0 && x != 0)
		{
		  System.out.printf("%d", 5);
		}
		 else if (z == 0 && x != 0 && y != 0)
		 {
		 System.out.printf("%d",7);
		 }
	}
}

