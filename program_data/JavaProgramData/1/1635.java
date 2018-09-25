package <missing>;

public class GlobalMembers
{
	public static int digui(int x, int min)
	{
		int i;
		int result;
		result = 1;
		if (x < min)
		{
			return 0;
		}
		for (i = min;i <= x - 1;i++)
		{
			if (x % i == 0)
			{
				result = result + digui(x / i, i);
			}
		}
		return result;
	}
	public static int Main()
	{
		int n;
		int i;
		int m;
		int y;
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
				m = Integer.parseInt(tempVar2);
			}
			y = digui(m, 2);
			System.out.printf("%d\n",y);
		}
		return 0;
	}


}

