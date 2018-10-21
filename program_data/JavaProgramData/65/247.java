package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[n][2];
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][k] = Integer.parseInt(tempVar2);
			}
			}
		}
		   l = 0;
		for (i = 0;i < n;i++)
		{

		   if (((sz[i][0]) - (sz[i][1]) == -1) || ((sz[i][0]) - (sz[i][1]) == 2))
		   {
																l++;
		   }
		   if ((sz[i][0]) - (sz[i][1]) == 0)
		   {
									   l += 0;
		   }
		   if ((sz[i][0]) - (sz[i][1]) == 1 || (sz[i][0]) - (sz[i][1]) == -2)
		   {
																l--;
		   }
		}
														  if (l > 0)
														  {
																  System.out.print("A");
														  }
																  else if (l == 0)
																  {
																		System.out.print("Tie");
																  }
																		else
																		{
																			 System.out.print("B");
																		}
		return 0;
	}
}

