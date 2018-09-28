package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int n;
		int x;
		int y;
		int temp;
		double sum;
		double a;
		double b;
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
			sum = 0.0;
			x = 1,y = 2;
			for (j = 1;j <= n;j++)
			{
				sum = sum + (double)y / x;
				temp = x;
				x = y;
				y = x + temp;
			}
			System.out.printf("%.3lf\n",sum);
		}
		return 0;
	}
}

