package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		int i;
	int sushu = int x;
	int huiwen = int y;
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
	for (i = m;i <= n;i++)
	{
		a = sushu(i);
		if (a == 1)
		{
			b = huiwen(i);
			if (b == 1)
			{
				m = i;
				System.out.printf("%d",i);
				c = 1;
				break;
			}
			else
			{
				c = 0;
			}
		}
	}
	if (c == 0)
	{
	System.out.print("no");
	}
	else
	{
		for (i = m + 1;i <= n;i++)
		{
			a = sushu(i);
			if (a == 1)
			{
				b = huiwen(i);
				if (b == 1)
				{
					System.out.printf(",%d",i);
				}
			}
		}
	}
	}
	public static int sushu(int x)
	{
		int j;
		int u;
		for (j = 2;j <= x / 2;j++)
		{
			if (x % j == 0)
			{
				u = 0;
			break;
			}
			else
			{
				u = 1;
			}

		}
		return (u);
	}
	public static int huiwen(int y)
	{
		int p = y;
		int q = 0;
		while (p > 0)
		{
			int r = p % 10;
			q = q * 10 + r;
			p = p / 10;
		}
		if (q == y)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

