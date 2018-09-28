package <missing>;

public class GlobalMembers
{
	public static int abc(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (n == 2)
		{
			return 2;
		}
		if (n > 2)
		{
			return abc(n - 1) + abc(n - 2);
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				sum += (float)abc(j + 1) / (float)abc(j);
			}
			System.out.printf("%.3f\n",sum);
			sum = 0F;
		}


		return 0;
	}
}

