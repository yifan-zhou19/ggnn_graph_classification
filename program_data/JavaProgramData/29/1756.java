package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int[] f = new int[1005];
		double sum = 0.0;
		double r;
		f[0] = 1;
		f[1] = 2;
		for (i = 2;i <= 1000;i++)
		{
			f[i] = f[i - 1] + f[i - 2];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < k;i++)
			{
				r = 1.0 * f[i + 1] / f[i];
				sum += r;
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0.0;
		}




		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}

}

