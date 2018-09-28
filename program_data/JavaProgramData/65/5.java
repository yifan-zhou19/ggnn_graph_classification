package <missing>;

public class GlobalMembers
{
	public static int fun(int x,int y)
	{
		if ((x == 0 && y == 1) || (x == 1 && y == 2) || (x == 2 && y == 0))
		{
			return 1;
		}
		if ((y == 0 && x == 1) || (y == 1 && x == 2) || (y == 2 && x == 0))
		{
			return -1;
		}
		if ((x == 0 && y == 0) || (x == 1 && y == 1) || (x == 2 && y == 2))
		{
			return 0;
		}

	}
	public static int Main()
	{
		int n;
		int x;
		int y;
		int j = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			j = j + fun(x, y);
		}
		if (j > 0)
		{
			System.out.print("A");
		}
		if (j < 0)
		{
			System.out.print("B");
		}
		if (j == 0)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

