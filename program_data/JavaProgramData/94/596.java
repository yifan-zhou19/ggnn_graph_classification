package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int N;
	int[] sz = new int[500];
	int[] js = new int[100];
	int i;
	int sum = 0;
	int e;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		N = Integer.parseInt(tempVar);
	}
	for (k = 0;k < N;k++)
	{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
		if (m % 2 != 0)
		{
			sz[sum] = m;
		sum++;
		}
	}
	for (k = 1; k <= sum; k++)
	{
				 for (i = 0;i < sum - k;i++)
				 {
				 if (sz[i] > sz[i + 1])
				 {
				 e = sz[i + 1];
			 sz[i + 1] = sz[i];
			 sz[i] = e;
				 }
				 }
	}
	for (i = 0;i < sum;i++)
	{
						  System.out.printf("%d",sz[i]);
					  if (i != sum - 1)
					  {
						  System.out.print(",");
					  }
	}

	return 0;
	}


}

