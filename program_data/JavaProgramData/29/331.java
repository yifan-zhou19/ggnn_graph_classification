package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[] b = new int[100];
		double sum;
		a[0] = 2;
		a[1] = 3;
		for (j = 2;j < 100;j++)
		{
		a[j] = a[j - 1] + a[j - 2];
		}
		b[0] = 1;
		b[1] = 2;
		for (j = 2;j < 100;j++)
		{
		b[j] = b[j - 1] + b[j - 2];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < n;j++)
			{
			sum += (double)a[j] / b[j];
			}
			System.out.printf("%.3lf\n",sum);

		}
		return 0;
	}


}

