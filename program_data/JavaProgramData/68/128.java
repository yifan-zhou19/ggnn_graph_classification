package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		char[] isprime = {0, 0};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			isprime[i] = 1;
		}
		for (i = 2;i <= n;i++)
		{
			if (isprime[i] != null)
			{
				for (j = i + i;j <= n;j += i)
				{
					isprime[j] = 0;
				}
			}
		}
		for (i = 6;i <= n;i += 2)
		{
				for (j = 2;j <= i / 2;j++)
				{
					if (isprime[j] && isprime[i - j])
					{
						System.out.printf("%d=%d+%d\n",i,j,i - j);
						break;
					}
				}
		}
		return 0;
	}
}

