package <missing>;

public class GlobalMembers
{
	public static int h(int x)
	{
		int r = 0;
		int i;
		int y = x;
		for (i = 0;;i++)
		{
			if (x == 0)
			{
				break;
			}
			else
			{
				r = r * 10 + x % 10,x = x / 10;
			}
		}
		return (r == y)?1:0;
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int u = 0;
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
			for (j = 2;j <= Math.sqrt(i);j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(i) && h(i) == 1)
			{
				if (u == 0)
				{
					System.out.printf("%d",i);
				}
				else
				{
					System.out.printf(",%d",i);
				}
				++u;
			}
		}
		if (u == 0)
		{
			System.out.print("no\n");
		}
	}
}

