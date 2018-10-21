package <missing>;

public class GlobalMembers
{
	public static int apple(int m,int n)
	{
		int k;
		if (n == 1)
		{
			k = 1;
		}
		else if (m == 1)
		{
			k = 1;
		}
		else if (m == 2)
		{
			k = 2;
		}
		else if (m < n)
		{
			k = apple(m, n - 1);
		}
		else
		{
		k = apple(m, n - 1) + apple(m - n, n);
		}
		return k;
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < t;i++)
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
			k = apple(m, n);
			System.out.printf("%d\n",k);
		}

		return 0;
	}

}

