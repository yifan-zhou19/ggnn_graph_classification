package <missing>;

public class GlobalMembers
{
	public static int f(int x)
	{
		int i;
	   for (i = 2;i < x;i++)
	   {
			if (x % i == 0)
			{
				return 0;
			}
	   }
		return 1;
	}
	public static void Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= m / 2;i++)
		{
			if (f(i) == 1 && f(m - i) == 1)
			{
		System.out.printf("%d %d\n",i,m - i);
			}
		}
	}

}

