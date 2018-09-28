package <missing>;

public class GlobalMembers
{
	public static int num(int m, int n)
	{
		return (num1(m, n) + num2(m, n));
	}
	public static int num1(int m, int n)
	{
		if (m == n)
		{
			return (1);
		}
		else if (n == 1)
		{
			return (1);
		}
		else if (m < n)
		{
			return (0);
		}
		else
		{
			return (num(m - n, n));
		}
	}
	public static int num2(int m, int n)
	{
		if (m == 1)
		{
			return (1);
		}
		if (n == 1)
		{
			return (0);
		}
		else
		{
			return (num(m, n - 1));
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		System.out.printf("%d\n",num(m, n));
		}
	return 0;
	}


}

