package <missing>;

public class GlobalMembers
{
																//??? 

	public static int Main()
	{
		int n;
		int count = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] prime = new int[100000];
		prime[0] = 2;
		int i;
		int j;
		int k;
		j = 1;
		for (i = 3;i <= n;i++)
		{
			for (k = 0;prime[k] * prime[k] <= i;k++) //??????????????????
			{
														//??????????????????????????????????? 
					if (i % prime[k] == 0)
					{
					break;
					}
			}
			if (prime[k] * prime[k] > i)
			{
				prime[j] = i;
				j++;
			}
		}
		for (i = 0;i < 100000;i++)
		{
			if (prime[i + 1] - prime[i] == 2)
			{
			System.out.printf("%d %d\n",prime[i],prime[i + 1]);
			count++;
			}
		}
		if (count == 0)
		{
		System.out.print("empty");
		}

	}

}

