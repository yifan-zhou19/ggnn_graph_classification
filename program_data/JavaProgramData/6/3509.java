package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] sz = new int[100][100][100];
		int k;
		int i;
		int g;
		int t;
		int r;
		int[] s = new int[100];
		int[] z = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
		for (g = 0;g <= k - 1;g++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[g] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				z[g] = Integer.parseInt(tempVar3);
			}
			for (i = 0;i <= s[g] - 1;i++)
			{
				for (t = 0;t <= z[g] - 1;t++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[g][i][t] = Integer.parseInt(tempVar4);
					}
				}
			}
		}

	for (g = 0;g <= k - 1;g++)
	{
	if (s[g] >= 3 && z[g] >= 3)
	{
	for (r = 0,i = 0;i <= s[g] - 1;i++)
	{
	 r = r + sz[g][i][0] + sz[g][i][z[g] - 1];
	}
		for (t = 1;t <= z[g] - 2;t++)
		{
			r = r + sz[g][0][t] + sz[g][s[g] - 1][t];
		}
		System.out.printf("%d\n",r);
	}
	  else
	  {
		  for (r = 0,i = 0;i <= s[g] - 1;i++)
		  {
		  for (t = 0;t <= z[g] - 1;t++)
		  {
			  r = r + sz[g][i][t];
		  }
		  }
	 System.out.printf("%d\n",r);
	  }
	}

	return 0;
	}
}

