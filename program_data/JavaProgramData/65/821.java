package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int x = 0;
		int y = 0;
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
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (a == 0)
			{
				if (b == 1)
				{
					x++;
				}
				else
				{
					if (b == 2)
					{
						y++;

					}
				}
			}
			if (a == 1)
			{
				if (b == 0)
				{
					y++;
				}
				else
				{
					if (b == 2)
					{
						x++;
					}
				}
			}
			if (a == 2)
			{
				if (b == 0)
				{
					x++;
				}
				else
				{
					if (b == 1)
					{
					y++;
					}
				}
			}
		}
	if (x > y)
	{
	System.out.print("A");
	}
	if (x == y)
	{
	System.out.print("Tie");
	}
	if (x < y)
	{
	System.out.print("B");
	}
	return 0;
	}
}

