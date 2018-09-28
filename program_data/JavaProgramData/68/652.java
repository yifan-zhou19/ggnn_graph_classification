package <missing>;

public class GlobalMembers
{
	public static int prime(int m)
	{
		int i;
		for (i = 2;i <= Math.sqrt(m);i++)
		{
			if (m % i == 0)
			{
				return 0;
				break;
			}
		}
		if (i > Math.sqrt(m))
		{
			return 1;
		}
	}
	public static void Main()
	{
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			int j;
			int k;
			for (j = 3;j < i;j++)
			{
				if (prime(j) != 0)
				{
					if (prime(i - j) != 0)
					{
						System.out.printf("%d=%d+%d\n",i,j,i - j);
						break;
					}
				}
			}

		}
	}
}

