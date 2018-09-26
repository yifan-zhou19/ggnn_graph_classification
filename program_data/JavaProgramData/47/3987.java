package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[98];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		int[] end = new int[98];

		for (int m = 0;m < n - 1;m++)
		{
			end[m] = sz[n - 1 - m];
			System.out.printf("%d ",end[m]);
		}
		 end[n - 1] = sz[0];
		 System.out.printf("%d",end[n - 1]);

		 return 0;
	}


}

