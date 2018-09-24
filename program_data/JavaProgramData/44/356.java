package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int fun = int n;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",fun(n));
		}
		return 0;
	}
	public static int fun(int n)
	{
		int k = 1;
		int i;
		int t = 1;
		int result = 0;
		if (n < 0)
		{
			k = -1;
			n = -n;
		}
		while (n > 0)
		{
			result = result * 10 + n % 10;
			n /= 10;
		}
		return k * result;
	}
}

