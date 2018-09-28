package <missing>;

public class GlobalMembers
{
	public static int bf(int n,int m)
	{
		int s;
		if (n == 1)
		{
			s = 1;
		}
		else if (n == 2)
		{
			if (m == 1)
			{
				s = 1;
			}
			if (m == 2)
			{
				s = 2;
			}
			if (m > n)
			{
				s = bf(n - 1, m) + bf(n, m - n);
			}
		}
		else if (m < n)
		{
			s = bf(n - 1, m);
		}
		else if (n == m)
		{
			 s = 1 + bf(n - 1, m);
		}
		else if (m > n)
		{
			 s = bf(n - 1, m) + bf(n, m - n);
		}
		return s;
	}
	public static int Main()
	{
		int t;
		int i;
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
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
			System.out.printf("%d\n",bf(n, m));
		}

		return 0;
	}

}

