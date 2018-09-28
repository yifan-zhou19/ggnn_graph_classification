package <missing>;

public class GlobalMembers
{
	public static int fibonacci(int n)
	{
		int a;
		if (n == 1 || n == 2)
		{
			a = 1;
		}
		else
		{
			a = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return a;
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			int n;
			double fenzi;
			double fenmu;
			double result;
			double sum = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= n;j++)
			{
				fenzi = fibonacci(j + 2);
				fenmu = fibonacci(j + 1);
				result = fenzi / fenmu;
				sum = sum + result;
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}
}

