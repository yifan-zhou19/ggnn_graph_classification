package <missing>;

public class GlobalMembers
{
	public static int a(int m, int n)
	{
		if (m < n)
		{
			return a(m, n - 1);
		}
		else if (n == m && n != 1)
		{
			return a(m, n - 1) + 1;
		}
		else
		{
			if (n == 1)
			{
			return 1;
			}
		else
		{
			return a(m - n, n) + a(m, n - 1);
		}
		}
	}
	public static int Main()
	{

		int t;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			int p;
			int q;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				q = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",a(p, q));
		}
		return 0;
	}

}

