package <missing>;

public class GlobalMembers
{
	public static float f(int n)
	{
		if (n == 1 || n == 2)
		{
		return 1F;
		}
		else
		{
		return f(n - 1) + f(n - 2);
		}
	}
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int k = 1;k <= m;k++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n = Integer.parseInt(tempVar2);
				}
			float sum = 0F;
			for (int i = 1;i <= n;i++)
			{
				sum = sum + (f(i + 2) / f(i + 1));
			}
			System.out.printf("%.3f\n",sum);
		}
	}
}

