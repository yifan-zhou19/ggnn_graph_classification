package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int[] sz = new int[15];
		int i;
		int k;
		int m = 0;
		int t;
		if (n < 0)
		{
			t = -1;
		}
		else if (n > 0)
		{
			t = 1;
		}
		else
		{
			t = 0;
		}
		n = Math.abs(n);
		for (i = 1;;i++)
		{
			if (n < Math.pow(10,i))
			{
				break;
			}
		}
		for (k = 0;k < i;k++)
		{
			sz[k] = n / Math.pow(10,i - k - 1);
			n -= sz[k] * Math.pow(10,i - k - 1);
		}
		for (k = 0;k < i;k++)
		{
			m += sz[k] * Math.pow(10,k);
		}
		return m * t;
	}
	public static int Main()
	{
		int n;
		int i;
		for (i = 1;i <= 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			System.out.printf("%d\n",f(n));
		}

	}
}

