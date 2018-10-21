package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		int i;
		int q = 1;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				q = 0;
				break;
			}
		}
		return q;
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
		for (i = 3;i <= n / 2;i++)
		{
			if (judge(i) == 1)
			{
				j = n - i;
				if (judge(j) == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}
}

