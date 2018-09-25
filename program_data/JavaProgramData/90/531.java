package <missing>;

public class GlobalMembers
{
	public static int fangfa(int m,int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (m > n)
		{
			return (fangfa(m, n - 1) + fangfa(m - n, n));
		}
		else if (m == n)
		{
			return (fangfa(m, n - 1) + 1);
		}
		else
		{
			return (fangfa(m, n - 1));
		}
	}
	public static void apple()
	{
		int m = 0;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d\n",fangfa(m, n));
	}
	public static void Main()
	{
		int t = 0;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			apple();
		}
	}
}

