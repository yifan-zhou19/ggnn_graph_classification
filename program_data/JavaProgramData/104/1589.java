package <missing>;

public class GlobalMembers
{
	public static int len(int x)
	{
		int i;
		int k = 0;
		for (i = 1;i <= 10;i++)
		{
			if (x != 0)
			{
				x = (x - x % 2) / 2;
				k += 1;
			}
			else
			{
				break;
			}
		}
		return k;
	}
	public static int ch(int x,int y)
	{
		int i;
		int n;
		n = len(x);
		for (i = 1;i <= n - y;i++)
		{
			x = (x - x % 2) / 2;
		}
		return x;
	}
	public static int Main()
	{
		int x;
		int y;
		int m;
		int n;
		int i;
		int a;
		int s;
		int same;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		m = len(x);
		n = len(y);
		if (m > n)
		{
			a = n;
		}
		else
		{
			a = m;
		}
		for (i = a;i >= 1;i--)
		{
			x = ch(x, i);
			y = ch(y, i);
			if (x == y)
			{
				System.out.printf("%d",x);
				break;
			}
		}
		return 0;
	}
}

