package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int apple = new int(int n,int k);
		int n;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		m = apple(n, k);
		System.out.printf("%d",m);
		return 0;
	}

	public static int apple(int n,int k)
	{
		int x;
		int y;
		int i;
		int t;
		for (x = 1;;x++)
		{
			y = x * n + k;
			for (i = 1;i < n;i++)
			{
				if (y % (n - 1) != 0)
				{
					t = 0;
					break;
				}
				else
				{
					y = y * n / (n - 1) + k;
					t = 1;
				}
			}
			if (t == 1)
			{
				return y;
			}
			else
			{
				continue;
			}
		}
	return y;
	}
}

