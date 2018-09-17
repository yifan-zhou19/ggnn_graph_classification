package <missing>;

public class GlobalMembers
{
	public static int sum = 0;

	public static void f(int x, int i)
	{
		double m = Math.sqrt(x);
		if (i < m)
		{
		if (x % i == 0)
		{
			sum++;
			f(x / i, i);
		}
		f(x, i + 1);
		}

		if (Math.abs(i - m) < 0.00000001)
		{
			sum++;
		}



	}


	public static int Main()
	{
		int x;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
		sum = 0;
		f(x, 2);

		System.out.printf("%d\n",sum + 1);
		}
		return 0;

	}

}

