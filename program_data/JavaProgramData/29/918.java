package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] n = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		double a1 = 2;
		double a2 = 3;
		double b1 = 1;
		double b2 = 2;
		double a3;
		double b3;
		double slot;
		double sum;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 1)
			{
				System.out.printf("%.3lf\n",(a1 / b1));
			}
			if (n[i] == 2)
			{
				System.out.printf("%.3lf\n",(a1 / b1) + (a2 / b2));
			}
			if (n[i] > 2)
			{
				sum = (a1 / b1) + (a2 / b2);
				for (j = 0;j < n[i] - 2;j++)
				{
					a3 = a1 + a2;
					b3 = b1 + b2;
					sum += (a3 / b3);
					slot = a2;
					a2 = a1;
					a1 = slot;
					slot = b2;
					b2 = b1;
					b1 = slot;
					slot = a3;
					a3 = a2;
					a2 = slot;
					slot = b3;
					b3 = b2;
					b2 = slot;
				}
				System.out.printf("%.3lf\n",sum);
				a1 = 2;
				a2 = 3;
				b1 = 1;
				b2 = 2;
				sum = (a1 / b1) + (a2 / b2);
			}
		}

		return 0;
	}



}

