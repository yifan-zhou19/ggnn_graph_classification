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
		double sum = 0.00;
		b[1] = 1;
		b[2] = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a[i] = n;
		}
		 for (i = 2;i <= 99;i++)
		 {
			b[i + 1] = b[i] + b[i - 1];
		 }
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= a[i];j++)
			{
			   sum = sum + 1.0 * b[j + 1] / b[j];

			}
			System.out.printf("%.3lf\n",sum);
			sum = 0.00;
		}
		 return 0;
	}

}

