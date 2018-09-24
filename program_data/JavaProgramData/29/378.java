package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double sum;
		int i;
		int j;
		int a1;
		int a2;
		int ta;
		int b1;
		int b2;
		int tb;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			sum = 0;
			for (j = 0;j < m;j++)
			{
				if (j == 0)
				{
					a1 = 2;
					b1 = 1;
					sum += (double)a1 / (double)b1;
				}
				else if (j == 1)
				{
					a2 = 3;
					b2 = 2;
					sum += (double)a2 / (double)b2;
				}
				else
				{
					ta = a2;
					a2 = a1;
					a1 = ta;
					a2 = a1 + a2;
					tb = b2;
					b2 = b1;
					b1 = tb;
					b2 = b1 + b2;
					sum += (double)a2 / (double)b2;
				}
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

