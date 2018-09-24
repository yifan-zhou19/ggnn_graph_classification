package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int c;
		int i;
		int t;
		int n;
		int m;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
		 int a = 0;
		 int b = 1;
		 double sum = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (n == 1)
		{
			System.out.printf("%.3lf\n",2.000);
		}
		else
		{

		for (i = 1;i < n + 2;i++)
		{
			c = a + b;
			a = b;
			b = c;
			sum += 1.0 * b / a;
		}

		System.out.printf("%.3lf\n",sum - 1);
		}
		}
		return 0;

	}
}

