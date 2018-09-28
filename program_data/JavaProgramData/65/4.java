package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; i++)
		{
			int x;
			int y;
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
			if (x == y)
			{
				continue;
			}
			else
			{
				if (x == 0)
				{
					if (y == 1)
					{
						a++;
					}
					else
					{
						b++;
					}
				}
				else if (x == 1)
				{
					if (y == 2)
					{
						a++;
					}
					else
					{
						b++;
					}
				}
				else
				{
					if (y == 0)
					{
						a++;
					}
					else
					{
						b++;
					}
				}
			}
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a > b)
		{
			System.out.print("A");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}


}

