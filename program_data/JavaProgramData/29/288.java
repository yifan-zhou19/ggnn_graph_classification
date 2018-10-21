package <missing>;

public class GlobalMembers
{
	public static int f1(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return f1(n - 1) + f1(n - 2);
		}
	}
	public static int f2(int n)
	{
		if (n == 1 || n == 2)
		{
			return 1;
		}
		else
		{
			return f2(n - 1) + f2(n - 2);
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (j = 0;j < k;j++)
		{
			float sum = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 2;i < n + 2;i++)
			{
				sum += (float)f2(i + 1) / f1(i);
			}
			System.out.printf("%.3f\n",sum);
		}
	}

}

