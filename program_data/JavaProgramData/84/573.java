package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int e;
		int[] prime = new int[N];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				prime[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (prime[i] > prime[i + 1])
			{
				e = prime[i],prime[i] = prime[i + 1],prime[i + 1] = e;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (prime[i] > prime[i + 1])
			{
				e = prime[i],prime[i] = prime[i + 1],prime[i + 1] = e;
			}
		}
		System.out.printf("%d\n",prime[n]);
		System.out.printf("%d\n",prime[n - 1]);
		return 0;
	}
}

