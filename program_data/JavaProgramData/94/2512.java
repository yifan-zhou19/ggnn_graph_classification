package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int j;
		int n;
		int e;
		int[] shuru = new int[501];
		int[] shuchu = new int[501];
		j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuru[i] = Integer.parseInt(tempVar2);
			}
			if (shuru[i] % 2 == 1)
			{
				 shuchu[j] = shuru[i];
				 j = j + 1;
			}

		}
		for (int k = 1;k < j;k++)
		{
			for (int m = 0;m < j - k;m++)
			{
				if (shuchu[m] < shuchu[m + 1])
				{
				   e = shuchu[m + 1];
				   shuchu[m + 1] = shuchu[m];
				   shuchu[m] = e;
				}
			}
			System.out.printf("%d,",shuchu[j - k]);
		}


		 for (int m = 0;m < j - j;m++)
		 {
				if (shuchu[m] < shuchu[m + 1])
				{
				   e = shuchu[m + 1];
				   shuchu[m + 1] = shuchu[m];
				   shuchu[m] = e;
				}
		 }
			System.out.printf("%d",shuchu[j - j]);
		return 0;
	}

}

