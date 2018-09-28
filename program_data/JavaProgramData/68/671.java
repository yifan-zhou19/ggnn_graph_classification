package <missing>;

public class GlobalMembers
{
	public static int check(int k)
	{
		int x;
		if ((k % 2 == 0) && (k != 2))
		{
			return 0;
		}
		for (x = 3;x <= Math.sqrt(k);)
		{
			if (k % x == 0)
			{
				break;
			}
			x += 2;
		}
		if (x > Math.sqrt(k))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;)
		{
			for (j = 2;;j++)
			{
				if (check(j) != 0)
				{
					m = i - j;
					if (check(m) != 0)
					{
						System.out.printf("%d=%d+%d\n",i,j,m);
						break;
					}
				}
			}
			i += 2;
		}
	}



}

