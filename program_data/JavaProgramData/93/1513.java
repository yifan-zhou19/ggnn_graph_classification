package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b = 3;
		int c = 5;
		int d = 7;
		int x;
		int y;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		 x = a % 3,y = a % 5,z = a % 7;
		if (x == 0 && y == 0 && z == 0)
		{
			System.out.printf("%d %d %d",b,c,d);
		}
		else if (x == 0 && y == 0 && z != 0)
		{
			System.out.printf("%d %d",b,c);
		}
		else if (x == 0 && y != 0 && z == 0)
		{
			System.out.printf("%d %d",b,d);
		}
		else if (x != 0 && y == 0 && z == 0)
		{
			System.out.printf("%d %d",c,d);
		}
		else if (x == 0 && y != 0 && z != 0)
		{
			System.out.printf("%d",b);
		}
		else if (x != 0 && y == 0 && z != 0)
		{
			System.out.printf("%d",c);
		}
		else if (x != 0 && y != 0 && z == 0)
		{
			System.out.printf("%d",d);
		}
		else
		{
		System.out.print("n");
		}
		return 0;
	}



}

