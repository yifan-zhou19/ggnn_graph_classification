package <missing>;

public class GlobalMembers
{
	public static float f(int n)
	{
		int k;
		if (n == 1)
		{
			return 1F;
		}
		if (n == 2)
		{
			return 2F;
		}
		else
		{
			k = f(n - 1) + f(n - 2);
			return k;
		}
	}

	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		int j;
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			sum = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				sum += (float)f(j + 1) / f(j);
			}
			System.out.printf("%.3f\n",sum);
		}
	}
}

