package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int j;
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 1;
		double he;
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
			for (j = 0;j < n;j++)
			{

				a = c + d;
				b = c;
				c = a;
				d = b;
				sum += (a * 1.0) / b;
			}
			System.out.printf("%.3lf\n",sum);
			sum = 0;
			a = 1;
			b = 1;
			c = 1;
					  d = 1;
		}
		return 0;
	}

}

