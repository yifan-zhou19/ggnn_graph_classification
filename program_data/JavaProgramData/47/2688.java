package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int e;
		int[] sz = new int[100];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}

			for (j = 0;j < (n / 2);j++)
			{
						   e = sz[j];
					  sz[j] = sz[n - j - 1];
				 sz[n - j - 1] = e;
			}
					   for (j = 0;j < n;j++)
					   {
						   if (j == 0)
						   {
							   System.out.printf("%d",sz[j]);
						   }
					   else
					   {
						  System.out.printf(" %d", sz[j]);
					   }
					   }
	return 0;
	}
}

