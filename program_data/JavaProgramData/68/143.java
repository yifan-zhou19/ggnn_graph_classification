package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		int i;
		int k;
		k = (int)Math.sqrt(n);
		for (i = 2;i <= k;i++)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i > k)
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
			for (j = 3;j < i;j += 2)
			{
				if (f(j) != 0 && f(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

