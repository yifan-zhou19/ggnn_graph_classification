package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] m = new int[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double c;
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
				m[i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
		a[1] = 2,a[2] = 3;
		b[1] = 1,b[2] = 2;
		if (m[j] == 1)
		{
			c = 2;
			System.out.printf("%.3lf\n",c);
		}
		if (m[j] == 2)
		{
			c = 3.5;
			System.out.printf("%.3lf\n",c);
		}
		if (m[j] > 2)
		{
			c = 3.5;
			 for (i = 3;i <= m[j];i++)
			 {
				 a[i] = a[i - 1] + a[i - 2];
				 b[i] = b[i - 1] + b[i - 2];
				 c += a[i] / b[i];
			 }
			 System.out.printf("%.3lf\n",c);
		}
		}
		return 0;
	}
}

