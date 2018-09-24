package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int n;
		int i;
		int j;
		int k;
		int[] sz = new int[100000];
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			x = Integer.parseInt(tempVar3);
		}
		k = 0;
		for (i = 0;i < n;i++)
		{
			   if (sz[i] == x)
			   {
					 for (j = i;j < n - 1;j++)
					 {
							sz[j] = sz[j + 1];
					 }
					 sz[n - 1] = x - 1;
			   k++;
			   i--;
			   }
		}
		for (i = 0;i < n - k;i++)
		{
			   if (i == n - k - 1)
			   {
				   System.out.printf("%d",sz[i]);
			   }
			   else
			   {
				   System.out.printf("%d ",sz[i]);
			   }
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		return 0;
	}

}

