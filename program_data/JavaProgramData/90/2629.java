package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n,int j)
	{
		int i;
		int s = 0;
		if (n == 1)
		{
			return m >= j;
		}
		for (i = j;i < m;i++)
		{
			s += f(m - i, n - 1, i);
		}
		return s;
	}

	public static int Main()
	{
		int m;
		int n;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		while (l-- != 0)
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
			System.out.printf("%d\n",f(m, n, 0));
		}
		return 0;
	}


}

