package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int apple = new int(int m,int n);
		int t;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",apple(m, n));
		}
		return 0;
	}
	public static int apple(int m,int n)
	{
		int k;
		if (m >= n != 0 && n > 1)
		{
			k = apple(m, n - 1) + apple(m - n, n);
		}
		else if (n > 1)
		{
			k = apple(m, n - 1);
		}
		else
		{
			k = 1;
		}
		return (k);
	}

}

