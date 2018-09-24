package <missing>;

public class GlobalMembers
{
	public static int prime(int n, int m)
	{
		int i;
		int total = 1;
		if (n < m)
		{
			return 0;
		}

		for (i = m;i <= n;i++)
		{
			if (n % i == 0)
			{
				total += prime(n / i, i);
			}
		}
		return total;
	}
	public static void Main()
	{
		int n;
		int[] b = new int[2000];
		int b0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b0 = Integer.parseInt(tempVar2);
			}
			b[i] = prime(b0, 2);
		}
		for (i = 0;i <= n - 2;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
			System.out.printf("%d",b[n - 1]);
	}

}

