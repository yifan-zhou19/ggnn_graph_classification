package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] n = new int[100];
		int x = 2;
		int y = 1;
		double[] a = new double[100];
		double[] b = new double[100];
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a[1] = x * 1.00 / y;
		s = a[1];
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j < n[i];j++)
			{
				x = x + y;
				y = x - y;
				a[j + 1] = x * 1.00 / y;
				s = s + a[j + 1];
			}
			b[i] = s;
			x = 2;
			y = 1;
			s = a[1];
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%.3f\n",b[i]);
		}
		return 0;
	}
}

