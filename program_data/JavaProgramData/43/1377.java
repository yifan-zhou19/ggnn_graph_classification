package <missing>;

public class GlobalMembers
{
	public static int leap(int a)
	{
		int t = 1;
		int i = 0;
		if (a == 2 || a == 3)
		{
			return t;
		}
		else
		{
			for (i = 2;i * i <= a;i++)
			{
				if (a % i == 0)
				{
				t = 0;
				break;
				}
			}
		}
		return t;
	}
	public static int Main()
	{
		int i;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= m / 2;i++)
		{
			if (leap(i) != 0 && leap(m - i) != 0)
			{
				System.out.printf("%d %d\n",i,m - i);
			}
		}
		return 0;
	}
}

