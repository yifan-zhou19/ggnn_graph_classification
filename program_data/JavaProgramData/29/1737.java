package <missing>;

public class GlobalMembers
{
	public static double f(int x)
	{
		double s;
		if (x == 1)
		{
			s = 1.0;
		}
		else if (x == 2)
		{
			s = 2.0;
		}
		else
		{
			s = f(x - 1) + f(x - 2);
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int j;
		int k;
		int l;
		double sum;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 1;j <= a[i];j++)
			{
				sum = sum + f(j + 1) / f(j);
			}
			System.out.printf("%.3lf\n",sum);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

