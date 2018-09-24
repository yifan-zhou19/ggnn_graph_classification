package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int m;
		int i;
		int j;
		double[] a = new double[100];
		double[] b = new double[100];
		double x = 1;
		double y = 2;
		double z;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
		}

		for (i = 0;i < m;i++)
		{
			b[i] = 0;
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < a[i];j++)
			{
				b[i] = b[i] + y / x;
				z = x;
				x = y;
				y = z + y;
			}
			x = 1;
			y = 2;
		}

		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3lf\n",b[i]);
		}




		return 0;
	}

}

