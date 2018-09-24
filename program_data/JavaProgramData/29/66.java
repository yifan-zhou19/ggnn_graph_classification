package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i = 1;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		int c;
		int d;
		int y;
		double x;
		int q;
		int[] sz = new int[100];
		for (q = 0;q < m;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[q]) = Integer.parseInt(tempVar2);
			}
		}

			for (q = 0;q < m;q++)
			{
				a = 1;
				b = 2;
				x = 0.0;

			for (j = 0;j < sz[q];j++)
			{

			c = a;
			d = b;
			x = x + 1.0 * b / a;
			y = b;
			b = a + y;
			a = y;
			}
			System.out.printf("%.3lf\n",x);


			}
		return 0;
	}

}

