package <missing>;

public class GlobalMembers
{
	public static int f(int m, int min)
	{
		int count = 1;
		int i;
		if (m == 1)
		{
			return 1;
		}
		else if (m == 2)
		{
			return 1;
		}
		else
		{
			for (i = min;i <= Math.sqrt(m);i++)
			{
				if (m % i == 0)
				{
					count += f(m / i, i);
				}
			}
			return count;
		}
	}
	public static int Main()
	{
		int n;
		int m;
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
				m = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",f(m, 2));
		}
		return 0;
	}
}

