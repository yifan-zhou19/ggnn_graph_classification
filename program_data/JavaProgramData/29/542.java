package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int k;
		int i;
		int j;
		int n;
		int e;
		int a;
		int b;
		double[] shu = new double[100];

		int[][] sz = new int[100][100];
		for (n = 0;n < 100;n++)
		{
			shu[n] = 0.0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (n = 0;n < k;n++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < r;i++)
			{
				if (i == 0)
				{
					a = 2;
					b = 1;
				}
				else
				{
					e = a;
					a = a + b;
					b = e;
				}
				shu[n] += 1.0 * a / b;

			}
			System.out.printf("%.3lf\n",shu[n]);
		}


		return 0;
	}







}

