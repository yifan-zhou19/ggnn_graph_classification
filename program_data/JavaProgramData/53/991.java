package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 1;
		int m = 0;
		int[] sz = new int[300];
		int[] sz1 = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = n;i >= 1;i--)
		{
			 for (j = 1;j <= i;j++)
			 {
				   if (sz[i] == sz[i - j])
				   {
					   sz[i] = 0;
					   m++;
				   }
			 }
		}
	   for (i = 1;i <= n;i++)
	   {
			 if (sz[i] != 0)
			 {
				 sz1[k] = sz[i];
				 k++;
			 }
	   }
	   for (i = 1;i < n - m;i++)
	   {
			 System.out.printf("%d,",sz1[i]);
	   }
	   System.out.printf("%d",sz1[n - m]);
	   return 0;
	}
}

