package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int i;
		int s = 0;
		for (i = 0;i < m;i++)
		{
			if (n >= m - i)
			{
			s = s + f(m - i, n - m + i);
			}
		}
		if (n == 0)
		{
		s = 1;
		}
		return s;
	}
	public static int Main()
	{
		int m;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		for (;s > 1;s--)
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
			System.out.printf("%d\n",f(n, m));
		}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		m = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		n = Integer.parseInt(tempVar5);
	}
			System.out.printf("%d",f(n, m));
	}
}

