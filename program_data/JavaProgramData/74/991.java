package <missing>;

public class GlobalMembers
{
	public static int tran(int x)
	{
		int t = 0;
		int y = x;
		while (y > 0)
		{
			t = 10 * t + y % 10;
			y /= 10;
			tran(y);
		}
		if (x == t)
		{
			return (1);
		}
		return (0);
	}
	public static int cc(int x)
	{
		int i;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i < x - 1)
		{
			return (0);
		}
		return (1);
	}
	public static void Main()
	{
		int label = 0;
		int m;
		int n;
		int i;
		int j;
		int p = 0;
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
			if (cc(i) == 1 && tran(i) == 1)
			{
				label++;
				if (label == 1)
				{
					System.out.printf("%ld",i);
				}
				else
				{
					System.out.printf(",%ld",i);
				}
			}
		}
		if (label == 0)
		{
			System.out.print("no\n");
		}
	}

}

