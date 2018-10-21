package <missing>;

public class GlobalMembers
{
	public static int run(int x)
	{
		if (x % 4 != 0)
		{
			return 0;
		}
		if (x % 100 != 0)
		{
			return 1;
		}
		if (x % 400 == 0)
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		int y;
		int mon1;
		int mon2;
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
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				mon1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				mon2 = Integer.parseInt(tempVar4);
			}
			if (mon1 > mon2)
			{
				int temp = mon1;
				mon1 = mon2;
				mon2 = temp;
			}
			if (run(y) == 1)
			{
				int d = 0;
				for (int j = mon1;j < mon2;j++)
				{
					if (j == 2)
					{
						d += 29;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						d += 30;
					}
					else
					{
						d += 31;
					}
				}
				if (d % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
			else
			{
				int d = 0;
				for (int j = mon1;j < mon2;j++)
				{
					if (j == 2)
					{
						d += 28;
					}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						d += 30;
					}
					else
					{
						d += 31;
					}
				}
				if (d % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}
			}
		}
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

