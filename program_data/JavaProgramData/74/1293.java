package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int b = 0;
		int i;
		int j;
		int l;
		int n;
		int k;
		int x = 0;
		int y;
		int z = 0;
		double m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		l = 0;
		for (i = k;i <= n;i++)
		{
			if (i % 2 == 0)
			{
				continue;
			}
			m = Math.sqrt(i);
			for (j = 3;j <= m;j += 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > m && i <= n)
			{
				y = i;
				x = 0;
				for (l = 1;;l++)
				{
					x = x * 10 + y - 10 * (y / 10);
					y = y / 10;
					if (y == 0)
					{
						break;
					}
				}
				if (x == i && z == 0)
				{
					z = z + 1;
					System.out.printf("%ld",i);
					b = b + 1;
				}
				else if (x == i && z != 0)
				{
					System.out.printf(",%ld",i);
					b = b + 1;
				}
				x = 0;
			}
		}
		if (b == 0)
		{
			System.out.print("no");
		}
	}
}

