package <missing>;

public class GlobalMembers
{
	public static int huiwen(int n)
	{
		int m = 0;
		int t = n;
		while (n >= 1)
		{
			m = 10 * m + n % 10;
		n = n / 10;
		}

		if (m == t)
		{
			return 1;
		}
		else
		{
			return 0;
		}

	}
	public static int su(int n)
	{
		int m;
		int i;
		int k;
		if (n == 2)
		{
			return 1;
		}
		else if (n % 2 == 0)
		{
			return 0;
		}
		else
		{
			for (i = 3;i < n / 2;i++)
			{
			if (n % i == 0)
			{
				return 0;
			}
			}
		}
			return 1;
	}

	public static void Main()
	{
		int m;
		int n;
		int i;
		int k;
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m,k = 0;i <= n;i++)
		{

			if (su(i) * huiwen(i) == 1)
			{
				b[k] = i;
			k++;
			}
		}
			if (k == 0)
			{
				System.out.print("no");
			}
			else
			{
				System.out.printf("%ld",b[0]);
				if (k > 1)
				{
					for (i = 1;i < k;i++)
					{
						System.out.printf(",%d",b[i]);
					}
				}
			}
	}
}

