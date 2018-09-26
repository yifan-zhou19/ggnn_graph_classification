package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] sz = new int[100];
		int i;
		int j;
		double a;
		double a1;
		double a2;
		double b;
		double b1;
		double b2;
		double sum;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			if (sz[i] == 1)
			{
				System.out.print("2.000\n");
			}
			if (sz[i] == 2)
			{
				System.out.print("3.500\n");
			}
			if (sz[i] > 2)
			{
				a1 = 2;
				a2 = 3;
				b1 = 1;
				b2 = 2;
				sum = 3.500;
				for (j = 3;j <= sz[i];j++)
				{
					a = a1 + a2;
					a1 = a2;
					a2 = a;
					b = b1 + b2;
					b1 = b2;
					b2 = b;
					sum = sum + a2 / b2;
				}
				System.out.printf("%.3lf\n",sum);
			}
		}
		return 0;
	}

}

