package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int checkN = int;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6; i <= n; i += 2)
		{
			int j = 0;
			for (j = 3; j <= i - 3;j++)
			{
				if (checkN(j) != 0 && checkN(i - j) != 0)
				{
					System.out.printf("%u=%u+%u\n",i,j,i - j);
					break;
				}
			}
		}
	}
	public static int checkN(int n)
	{
		if (n % 2 == 0)
		{
			return 0;
		}
		else
		{
			int i;
			for (i = 3; i <= Math.sqrt(n); i += 2)
			{
				if (n % i == 0)
				{
					return 0;
					break;
				}
			}
			if (i > Math.sqrt(n))
			{
				return 1;
			}
		}
	}

}

