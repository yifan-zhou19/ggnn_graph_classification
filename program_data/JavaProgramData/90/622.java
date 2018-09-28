package <missing>;

public class GlobalMembers
{
	public static int move(int m,int n)
	{
		if (m == 1 || m == 0 || n == 1)
		{
			return (1);
		}
		else if (m < n && m != 0)
		{
			return (move(m, m));
		}
		else
		{
			int k = 0;
			int i;
			for (i = 0;i < n;i++)
			{
				k = k + move(m - n + i, n - i);
			}
			return (k);
		}
	}
	public static int Main()
	{
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			int m;
			int n;
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
			System.out.printf("%d\n",move(m, n));
		}
	}
}

