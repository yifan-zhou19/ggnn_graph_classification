package <missing>;

public class GlobalMembers
{
	public static int f(int n, int min)
	{
		int i;
		int result = 1;
		if (min > n)
		{
			return 0;
		}
		for (i = min;i < n;i++)
		{
			if (n % i == 0)
			{
				result += f(n / i, i);
			}
		}
		return result;
	}

		public static int Main()
		{
		int n;
		int a;
		int i;
		int t;
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
			t = f(a, 2);
			if (i < n - 1)
			{
				System.out.printf("%d\n",t);
			}
			else
			{
				System.out.printf("%d",t);
			}

		}
		return 0;
		}
}

