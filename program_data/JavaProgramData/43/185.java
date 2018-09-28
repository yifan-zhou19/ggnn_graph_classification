package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int i;
		int sushu = int m;
		int jishu = int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= (m / 2);i++)
		{
			if (sushu(i) != 0 && jishu(i) != 0)
			{
				a = m - i;
				if (sushu(a) != 0 && jishu(a) != 0)
				{
					System.out.printf("%d %d\n",i,a);
				}
			}
		}
		return 0;
	}
	public static int sushu(int m)
	{
		int t;
		int c;
		int k;
		k = Math.sqrt(m);
		for (t = 2;t <= k;t++)
		{
			if (m % t == 0)
			{
				break;
			}
		}
			if (t > k)
			{
				c = 1;
			}
			else
			{
				c = 0;
			}
			if (m < 3)
			{
				c = 0;
			}
			return (c);
	}
	public static int jishu(int m)
	{
		int d;
		if (m % 2 == 0)
		{
			d = 0;
		}
		else
		{
			d = 1;
		}
		return (d);
	}

}

