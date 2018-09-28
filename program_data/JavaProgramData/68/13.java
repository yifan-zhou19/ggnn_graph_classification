package <missing>;

public class GlobalMembers
{
	public static int prime(int x)
	{
		int i;
		for (i = 2;i <= Math.sqrt(x);i++)
		{
			if (x % i == 0)
			{
				return 0;
				break;
			}
		}
		return 1;
	}

	public static void Main()
	{
		int n;
		int j;
		int i = 6;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			while (i != (n + 2))
			{
				for (j = 3;j <= i / 2;j++)
				{
					if (prime(j) == 1 && prime(i - j) == 1)
					{
						break;
					}
				}
				System.out.printf("%ld=%ld+%ld\n",i,j,(i - j));
				i = i + 2;
			}
	}
}

