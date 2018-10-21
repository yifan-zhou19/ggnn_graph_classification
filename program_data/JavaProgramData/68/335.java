package <missing>;

public class GlobalMembers
{
	public static int prime(int a)
	{
		int i;
		int j;
		if (a == 3 || a == 5 || a == 7)
		{
			return 1;
		}
		else
		{
			for (i = 3;i <= Math.sqrt(a);i += 2)
			{
				if (a % i == 0)
				{
					return 0;
					break;
				}
			}
			return 1;
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
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= i / 2;j += 2)
			{
				if (prime(j) + prime(i - j) == 2)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

