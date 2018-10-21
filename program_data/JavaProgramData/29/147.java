package <missing>;

public class GlobalMembers
{
	public static int k(int n)
	{
		int i;
		int k1 = 1;
		int k2 = 2;
		int a;
		if (n > 1)
		{
			for (i = 1;i < n;i++)
			{
				a = k2;
				k2 = k1 + k2;
				k1 = a;
			}
		}
		else if (n = 1)
		{
			k2 = 2;
		}
		return k2;
	}


	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			int num;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num = Integer.parseInt(tempVar2);
			}
			double sum = 2;
			for (j = 2;j <= num;j++)
			{
				sum = sum + ((double)k(j) / (double)k(j - 1));
			}
			System.out.printf("%.3lf\n",sum);
		}
	}



}

