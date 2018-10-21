package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int m;
		m = Math.sqrt(n);
		for (i = 2;i <= m;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int huiwen(int n)
	{
		int m = 0;
		int k = n;
		while (k > 0)
		{
			m *= 10;
			m += k % 10;
			k /= 10;
		}
		if (m == n)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int mark = 0;
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
		i = m;
		while (i <= n)
		{
			if (prime(i) != 0 && huiwen(i) != 0)
			{
				System.out.printf("%d",i);
				mark = 1;
				i++;
				break;
			}
			i++;
		}
		if (mark == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			while (i <= n)
			{
				if (prime(i) != 0 && huiwen(i) != 0)
				{
					System.out.printf(",%d",i);
				}
				i++;
			}
		}
			return 0;
	}
}

