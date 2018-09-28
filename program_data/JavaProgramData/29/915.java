package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] shuzu = new int[1000];
		double sum;
		double a;
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
				(shuzu[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			j = shuzu[i];
			for (k = 1;k <= j;k++)
			{
				if (k == 1)
				{
					a = 1.0 * 2 / 1;
					sum = a;
				}
				else
				{
					a = 1 + 1.0 * 1 / a;
					sum = sum + a;
				}
			}
			System.out.printf("%.3lf\n",sum);
		}
			return 0;

	}
}

