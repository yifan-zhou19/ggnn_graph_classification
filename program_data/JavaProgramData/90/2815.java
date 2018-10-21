package <missing>;

public class GlobalMembers
{
	public static int way(int m,int n)
	{
		if (m == 1 || n == 1)
		{
			return (1);
		}
		else if (m < 0)
		{
			return 0;
		}
		else if (m == n)
		{
			return (way(m, n - 1) + 1);
		}
		else
		{
			return (way(m, n - 1) + way(m - n, n));
		}
	}
	public static int Main()
	{
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int m;
		int n;
		for (i = 0;i < p;i++)
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
			System.out.printf("%d",way(m, n));
			if (i != p - 1)
			{
				System.out.print("\n");
			}
		}
	}

}

