package <missing>;

public class GlobalMembers
{
	public static int panduan(int x)
	{
		int i;
		int j;
		if (x > 3)
		{
			for (i = 2;i <= Math.sqrt(x);i++)
			{
				if (x % i == 0)
				{
					j = 1;
					break;
				}
				else
				{
					j = 0;
				}
			}
		}
		if (x <= 3)
		{
			j = 0;
		}
		if (j == 0)
		{
			return (x);
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			System.out.printf("%d=",i);
			for (j = 2;j <= n;j++)
			{
				int s;
				int t;
				s = j;
				t = i - j;
				if ((panduan(s) != 0) && (panduan(t) != 0))
				{
					System.out.printf("%d+%d\n",s,t);
					break;
				}
			}
		}
		return 0;
	}

}

