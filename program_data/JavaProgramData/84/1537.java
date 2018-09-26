package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int x;
		int y;
		int z;
		int q;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		i = 2;
		while (i < (a - 1))
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			while (true)
			{
				if (x >= y != 0 && y >= q)
				{
					q = y;
					y = x;
					break;
				}
				if (x >= q != 0 && q >= y)
				{
					y = x;
					break;
				}
				if (y >= x != 0 && x >= q)
				{
					q = x;
					break;
				}
				if (q >= x != 0 && x >= y)
				{
					y = q;
					q = x;
					break;
				}
				if (q >= y != 0 && y >= x)
				{
					t = q;
					q = y;
					y = t;
					break;
				}
				if (y >= q != 0 && q >= x)
				{
					break;
				}
			}
			i++;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			z = Integer.parseInt(tempVar5);
		}
		if (y >= z != 0 && z >= q)
		{
			q = z;
		}
		if (z >= y)
		{
			q = y;
			y = z;
		}
		System.out.printf("%d\n",y);
		System.out.printf("%d",q);
		return 0;
	}
}

