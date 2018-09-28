package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[300];
		int i;
		int e;
		int j;
		int k = 0;
		int[] r = new int[300];
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
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < i;j++)
		   {
			  if (sz[i] == sz[j])
			  {
				sz[i] = 0;
			  }
		   }
		}
		for (i = 0;i < n;i++)
		{
		   if (sz[i] != 0)
		   {
			 r[k] = sz[i];
			 k++;
		   }
		}
		for (i = 0;i < k - 1;i++)
		{
		   System.out.printf("%d,",r[i]);
		}
		System.out.printf("%d",r[k - 1]);
		int t;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			t = Integer.parseInt(tempVar3);
		}
		return 0;
	}


}

