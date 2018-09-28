package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		double a;
		double b;
		double x;
		double[] f = new double[100];
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		while (m > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			f[0] = 2;
			f[1] = 3;
			if (n == 1)
			{
				sum = 2;
			}
			else if (n == 2)
			{
				sum = 3.5;
			}
			else
			{
				sum = 3.5;
				for (i = 2;i < n;i++)
				{
					f[i] = f[i - 2] + f[i - 1];
					a = f[i];
					b = f[i - 1];
					x = a / b;
					sum = sum + x;
				}
			}
			m--;
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

