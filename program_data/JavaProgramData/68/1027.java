package <missing>;

public class GlobalMembers
{
	public static int isprime(int i)
	{
		int j;
		if (i % 2 == 0)
		{
			return 0;
		}
		for (j = 3;j * j <= i;j += 2)
		{
			if (i % j == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			for (j = 2;j <= i / 2;j++)
			{
				if (isprime(j) != 0 && isprime(i - j) != 0)
				{
					System.out.printf("%d=%d+%d\n",i,j,i - j);
					break;
				}
			}
		}
		return 0;
	}
}

