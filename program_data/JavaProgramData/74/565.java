package <missing>;

public class GlobalMembers
{
	public static int f(int i)
	{
		int x = 1;
		int j;
		for (j = 2;j <= Math.sqrt(i);j++)
		{
			if (i % j == 0)
			{
				x = 0;
				break;
			}
		}
		return (x);
	}
	public static int g(int i)
	{
		int y;
		int a;
		int c = 0;
		int d;
		d = i;
		while (d != 0)
		{
			a = d % 10;
			c = (c + a) * 10;
			d = d / 10;
		}
		if (i == c / 10)
		{
			y = 1;
		}
		else
		{
			y = 0;
		}
		return (y);
	}
	public static void Main()
	{
		int m;
		int n;
		int x;
		int y;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			x = f(i);
			y = g(i);
			if (x == 1 && y == 1)
			{
				break;
			}
		}
		j = i;
		if (j <= n)
		{
			System.out.printf("%d",j);
			for (i = j + 1;i <= n;i++)
			{
				x = f(i);
				y = g(i);
				if (x == 1 && y == 1)
				{
					System.out.printf(",%d",i);
				}
			}
			System.out.print("\n");
		}
		else if (j > n)
		{
		System.out.print("no\n");
		}
	}

}

