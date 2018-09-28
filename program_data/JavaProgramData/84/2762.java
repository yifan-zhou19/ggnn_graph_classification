package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
	double[] a = new double[100];
		double t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
		scanf("\n");
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[n - 1] = Double.parseDouble(tempVar3);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
			if (a[i + 1] > a[i])
			{
					t = a[i + 1];
					a[i + 1] = a[i];
					a[i] = t;
			}
			}

		}
		System.out.printf("%.0lf\n",a[0]);
				System.out.printf("%.0lf\n",a[1]);
	}


}

