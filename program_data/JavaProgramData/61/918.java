package <missing>;

public class GlobalMembers
{
	public static int Fib(int n)
	{
		int ans;
		if (n == 0)
		{
			ans = 0;
		}
		else if (n == 1)
		{
			ans = 1;
		}
		else
		{
			ans = Fib(n - 1) + Fib(n - 2);
		}
		return ans;
	}
	public static int Main()
	{
		int n;
		int num;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			System.out.printf("%d\n",Fib(n));
		}
	}
}

