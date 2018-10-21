package <missing>;

public class GlobalMembers
{
	public static int tiffany(int i)
	{
		int diamond;
		if (i == 1)
		{
			diamond = 2;
		}
		else if (i == 2)
		{
			diamond = 3;
		}
		else
		{
			diamond = tiffany(i - 1) + tiffany(i - 2);
		}
		return diamond;
	}
	public static int chanel(int i)
	{
		int pearl;
		if (i == 1)
		{
			pearl = 1;
		}
		else if (i == 2)
		{
			pearl = 2;
		}
		else
		{
			pearl = chanel(i - 1) + chanel(i - 2);
		}
		return pearl;
	}
	public static int Main()
	{
		int m;
		int k;
		int n;
		int i;
		int diamond;
		int pearl;
		double jewel;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			jewel = 0;
			for (i = 1;i <= n;i++)
			{
				diamond = tiffany(i);
				pearl = chanel(i);
				jewel += (double)diamond / (double)pearl;
			}
			System.out.printf("%.3f\n",jewel);
		}

		return 0;
	}
}

