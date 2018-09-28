package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		int[] sz = new int[n];
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int i = 0;i < n - 1;i++)
		{
		  for (int k = i + 1;k < n;k++)
		  {
			  if (sz[i] + sz[k] == a)
			  {
				 System.out.print("yes");
				 return 0;
			  }
			if (i == n - 2 && k == n - 1 && sz[i] + sz[k] != a)
			{
				System.out.print("no");
				return 0;
			}
		  }
		}

	 return 0;
	}


}

