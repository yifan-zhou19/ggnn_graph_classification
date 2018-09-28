package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int n;
		int m;
		int i;
		int j;
		double sum = 0;
		a[0] = 1;
		a[1] = 2;
		b[0] = 2;
		b[1] = 3;
		for (i = 2;i < 10000;i++)
		{
			b[i] = b[i - 1] + b[i - 2];
			a[i] = b[i - 1];
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
			sum += (double)b[j] / (double)a[j];
			}
			System.out.printf("%.3lf\n",sum);
		}
	}

}

