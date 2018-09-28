package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int n;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	int[] num = new int[500];
	int[] sz = new int[500];
		for (int i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(num[i]) = Integer.parseInt(tempVar2);
		}
		}
	for (int i = 1;i < n;i++)
	{
			 for (int j = 0;j < n - i;j++)
			 {
					  if (num[j] > num[j + 1])
					  {
							 e = num[j];
							 num[j] = num[j + 1];
							 num[j + 1] = e;
					  }
			 }
	}
	for (int i = 0;i < n;i++)
	{
			if (num[i] % 2 == 1)
			{
							sz[m] = num[i];
							m++;
			}
	}
	for (int i = 0;i < m - 1;i++)
	{
			System.out.printf("%d,",sz[i]);
	}
	System.out.printf("%d",sz[m - 1]);
	return 0;
	}
}

