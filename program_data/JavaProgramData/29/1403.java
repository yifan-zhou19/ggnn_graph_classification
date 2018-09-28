package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double[] a = new double[100];
		double[] b = new double[100];
		double sum = 0;
		int m;
		int n;
		a[0] = 2;
		a[1] = 3;
		b[0] = 1;
		b[1] = 2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 1)
			{
				sum = 2.000;
			}
			else if (n == 2)
			{
				sum = 3.500;
			}
			else
			{
				sum = 3.500;
				for (int q = 2;q < n;q++)
				{
					a[q] = a[q - 1] + a[q - 2];
					b[q] = b[q - 1] + b[q - 2];
					sum += a[q] / b[q];
				}
			}
			System.out.printf("%.3lf\n",sum);
		}



	}

}

