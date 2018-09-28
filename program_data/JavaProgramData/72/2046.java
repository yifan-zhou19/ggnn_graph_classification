package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int l;
		int w;
		int m;
		int n;
		int[][] high = new int[50][50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			l = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			w = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < l;i++)
		{
			for (int k = 0;k < w;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					high[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int i = 0;i < l;i++)
		{
			for (int k = 0;k < w;k++)
			{
				if (i != 0 && k != 0 && i != l - 1 && k != w - 1)
				{
					if (high[i][k] >= high[i][k - 1] != 0 && high[i][k] >= high[i][k + 1] != 0 && high[i][k] >= high[i - 1][k] != 0 && high[i][k] >= high[i + 1][k])
					{
						System.out.printf("%d %d\n",i,k);
					}
				}
			   else if (i == 0 && k == 0)
			   {
				   if (high[i][k] >= high[i][k + 1] != 0 && high[i][k] >= high[i + 1][k])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
			   }
			   else if (i == 0 && k == w - 1)
			   {
				   if (high[i][k] >= high[i + 1][k] != 0 && high[i][k] >= high[i][k - 1])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
			   }
			   else if (i == l - 1 && k == 0)
			   {
				   if (high[i][k] >= high[i][k + 1] != 0 && high[i][k] >= high[i - 1][k])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
			   }
			   else if (i == l - 1 && k == w - 1)
			   {
				   if (high[i][k] >= high[i - 1][k] != 0 && high[i][k] >= high[i][k - 1])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
			   }
				else if (i == 0 && k != 0 && k != w - 1)
				{
				   if (high[i][k] >= high[i][k + 1] != 0 && high[i][k] >= high[i][k - 1] != 0 && high[i][k] >= high[i + 1][k])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
				}
			   else if (i == l - 1 && k != 0 && k != w - 1)
			   {
				   if (high[i][k] >= high[i][k + 1] != 0 && high[i][k] >= high[i][k - 1] != 0 && high[i][k] >= high[i - 1][k])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
			   }
			   else if (k == 0 && i != 0 && i != l - 1)
			   {
				   if (high[i][k] >= high[i][k + 1] != 0 && high[i][k] >= high[i + 1][k] != 0 && high[i][k] >= high[i - 1][k])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
			   }
			   else if (k == w - 1 && i != 0 && i != l - 1)
			   {
				   if (high[i][k] >= high[i][k - 1] != 0 && high[i][k] >= high[i + 1][k] != 0 && high[i][k] >= high[i - 1][k])
				   {
					   System.out.printf("%d %d\n",i,k);
				   }
			   }
			}
		}
		return 0;
	}

}

