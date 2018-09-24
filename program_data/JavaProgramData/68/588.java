package <missing>;

public class GlobalMembers
{
	public static int judge(int n)
	{
		int i;
		for (i = 2;i < Math.sqrt(n) + 1;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i > (Math.sqrt(n) + 1))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = n / 2;
		for (i = 3;i <= m;i++)
		{
			for (j = 3;j <= m;j++)
			{
				l = i * 2 - j;
				k = 2 * i;
				if ((judge(j) == 1) && (judge(l) == 1))
				{
					System.out.printf("%d=%d+%d\n",k,j,l);
				break;
				}
			}
		}

	}
}

