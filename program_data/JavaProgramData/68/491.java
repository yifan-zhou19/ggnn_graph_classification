package <missing>;

public class GlobalMembers
{
	public static int p(int x)
	{
		int i;
		int sgn = 0;
		for (i = 3;i * i <= x;i += 2)
		{
			if (x % i == 0)
			{
				sgn = 1;
				break;
			}
		}
			return (sgn);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 3;j * 2 <= i;j += 2)
			{
				if (p(j) == 0 && p(i - j) == 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

