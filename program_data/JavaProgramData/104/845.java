package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f1 = new int(int n,int m);
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",f1(n, m));
	}

	public static int f1(int n,int m)
	{
		if (n == m)
		{
			return n;
		}
		else if (n > m)
		{
			if (n % 2 == 0)
			{
				return f1(n / 2, m);
			}
			else
			{
				return f1((n - 1) / 2, m);
			}
		}
		else
		{
			if (m % 2 == 0)
			{
				return f1(n, m / 2);
			}
			else
			{
				return f1(n, (m - 1) / 2);
			}
		}
	}

}

