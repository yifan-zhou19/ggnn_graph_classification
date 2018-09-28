package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int x;
		int y;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			if ((x - y) * (x - y) == 1)
			{
				if (x > y)
				{
					b++;
				}
				else
				{
					a++;
				}
			}
			if ((x - y) * (x - y) == 4)
			{
				if (x > y)
				{
					a++;
				}
				else
				{
					b++;
				}
			}
		}
		if (a > b)
		{
			System.out.print("A\n");
		}
		if (a == b)
		{
			System.out.print("Tie\n");
		}
		if (a < b)
		{
			System.out.print("B\n");
		}
		return 0;
	}
}

