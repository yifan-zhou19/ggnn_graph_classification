package <missing>;

public class GlobalMembers
{
	public static int f(int x, int k)
	{
		int a = 0;
		int i;
		if (x == 1)
		{
		return 1;
		}
		for (i = k;i <= x;i++)
		{
		if (x % i == 0)
		{
		a = a + f(x / i, i);
		}
		}
		return a;
	}
	public static int Main()
	{
		int i = 1;
		int n;
		int m;
		int result;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		result = f(m, 2);
		System.out.printf("%d\n",result);
		}
		 return 0;
	}

}

