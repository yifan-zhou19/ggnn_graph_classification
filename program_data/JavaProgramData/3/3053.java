package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[MAX];
		int n;
		int k;
		int i;
		int j = 1;
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  n = Integer.parseInt(tempVar);
			  }
			  String tempVar2 = ConsoleInput.scanfRead(" ");
			  if (tempVar2 != null)
			  {
				  k = Integer.parseInt(tempVar2);
			  }
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++,j = i + 1)
		{
		  while (j <= n - 1)
		  {
			if (sz[i] + sz[j] == k)
			{
						   System.out.print("yes");
								return 0;
			}
					 j++;
		  }
		}
			  System.out.print("no");
	}

}

