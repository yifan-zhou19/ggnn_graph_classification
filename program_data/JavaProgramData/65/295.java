package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
			if ((x == 0 && y == 1) | (x == 1 && y == 2) | (x == 2 && y == 0))
			{
				s++;
			}
			else if (x == y)
			{
			}
			else
			{
				s--;
			}
		}
		if (s == 0)
		{
			System.out.print("Tie");
		}
		if (s > 0)
		{
			System.out.print("A");
		}
		if (s < 0)
		{
			System.out.print("B");
		}
		return 0;
	}
}

