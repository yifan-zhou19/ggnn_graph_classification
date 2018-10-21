package <missing>;

public class GlobalMembers
{
	public static int check(int n)
	{
		int i;
		for (i = 3;i * i <= n;i = i + 2)
		{
			if (n % i == 0)
			{
				break;
			}
		}
		if (i * i > n)
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
		for (i = 6;i <= n;i = i + 2)
		{
			for (j = 3;j <= i / 2;j = j + 2)
			{
				if (check(j) != 0 && check(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

