package <missing>;

public class GlobalMembers
{
	public static double SUM(int n)
	{
		double i = 5.0;
		double j = 3.0;
		double temp;
		double sum = 3.5;
		int k;
		for (k = 3;k <= n;k++)
		{
			sum = sum + i / j;
			temp = i;
			i = i + j;
			j = temp;
		}
		return sum;
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		if (n == 1)
		{
			System.out.print("2.000\n");
		}
		if (n == 2)
		{
			System.out.print("3.500\n");
		}
		if (n >= 3)
		{
			System.out.printf("%.3f\n",SUM(n));
		}
		}
		return 0;
	}
}

