package <missing>;

public class GlobalMembers
{
	public static int f1(int i)
	{
		int t;
		int c = 1;
		for (t = 2;t <= (i / 2);t++)
		{
			if (i % t == 0)
			{
				c = 0;
				break;
			}
		}
		return (c);
	}
	public static int f2(int i)
	{
		int t1 = 0;
		int t2 = i;
		while (t2 != 0)
		{
			t1 = t1 * 10 + t2 % 10;
			t2 = t2 / 10;
		}
		if (t1 == i)
		{
		return (1);
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
		int n;
		int m;
		int i;
		int c = 0;
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
		if (f1(i) != 0 && f2(i) != 0)
		{
			if (c == 0)
			{
			System.out.printf("%d",i);
			c = 1;
			}
		else
		{
			System.out.printf(",%d",i);
		}
		}
		}
		if (c == 0)
		{
			System.out.print("no");
		}
		System.out.print("\n");

	}
}

