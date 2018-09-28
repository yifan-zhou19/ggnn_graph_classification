package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int k;
	  int m;
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  k = Integer.parseInt(tempVar);
	  }

	  for (int l = 1;l <= k;l++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}

		int[][] sz = new int[m][n];
		for (int j = 0;j < m;j++)
		{
		  for (int i = 0;i < n;i++)
		  {
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				(sz[j][i]) = Integer.parseInt(tempVar4);
			}
		  }
		}

		int a = 0;
		for (int j = 0;j < m;j++)
		{
		  for (int i = 0;i < n;i++)
		  {
			a += sz[j][i];
		  }
		}
		for (int j = 1;j < m - 1;j++)
		{
		  for (int i = 1;i < n - 1;i++)
		  {
			a -= sz[j][i];
		  }
		}
		System.out.printf("%d\n",a);
	  }

	  return 0;
	}



}

