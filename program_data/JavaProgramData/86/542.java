package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] cs = new int[num][num];
		int t;
		int[] sum = new int[num];
		int k;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			cs[j][0] = t;
			if (t > 0)
			{
		  for (k = 1;k <= t;k++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  cs[j][k] = Integer.parseInt(tempVar3);
			  }
		  }
			}
		}
		  for (j = 0;j < n;j++)
		  {
			  if (cs[j][0] == 0)
			  {
				  sum[j] = 60;
			  }
			  else
			  {
								 for (k = 1;k <= cs[j][0];k++)
								 {
									   if (cs[j][k] + 3 * k <= 60)
									   {
					  sum[j] = 60 - 3 * k;
									   }
				  else if (cs[j][k] + 3 * k > 60 && 60 - 3 * (k - 1) - cs[j][k] < 3 && 60 - 3 * (k - 1) - cs[j][k]>0)
				  {
					  sum[j] = cs[j][k];
				  }
				  else if (cs[j][1] > 60)
				  {
					 sum[j] = 60;
				  }
								 }
			  }
		  }
		  for (j = 0;j < n;j++)
		  {
			  System.out.printf("%d\n",sum[j]);
		  }
	return 0;
	}

}

