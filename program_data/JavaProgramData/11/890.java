package <missing>;

public class GlobalMembers
{
	public static int Runnian(int y)
	{
		int result;
		if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		return result;
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int count = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				count += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				count += 30;
			}
			else if (i == 2)
			{
				if (Runnian(y) != 0)
				{
					count += 29;
				}
				else
				{
					count += 28;
				}
			}
		}
		count += d;
		System.out.printf("%d\n",count);
		return 0;
	}

}

