package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 1;
		int b = 1;
		int m;
		int n;
		int i;
		double sum = 0;
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
				n = Integer.parseInt(tempVar2);
			}
			int j;
			for (j = 0;j < n;j++)
			{
				if (j % 2 == 0)
				{
					sum += (a + b) * 1.0 / a;
					b = a + b;
				}
				else
				{
					sum += (a + b) * 1.0 / b;
					a = a + b;
				}
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;
			a = 1,b = 1;
		}
		return 0;
	}


}

