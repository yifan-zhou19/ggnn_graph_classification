package <missing>;

public class GlobalMembers
{
	public static int dota(int n)
	{
		if (n == 1 || n == 2)
		{
			return (1);
		}
		else
		{
			return (dota(n - 1) + dota(n - 2));
		}
	}
	public static int Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int a;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			int m;
			m = dota(a);
			System.out.printf("%d\n",m);
		}
	}
}

