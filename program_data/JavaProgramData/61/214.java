package <missing>;

public class GlobalMembers
{
	public static int fibonacci(int n)
	{
		int x;
		if (n == 1 || n == 2)
		{
			x = 1;
		}
		else
		{
			x = fibonacci(n - 1) + fibonacci(n - 2);
		}
		return x;
	}

	public static int Main()
	{
		int n;
		int i;
		int m;
		int a;
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
				a = Integer.parseInt(tempVar2);
			}
			m = fibonacci(a);
			System.out.printf("%d\n",m);
		}
		return 0;
	}

}

