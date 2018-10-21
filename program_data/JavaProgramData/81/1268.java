package <missing>;

public class GlobalMembers
{
	public static int hs(int n, int m)
	{
		if (n >= 0 && n < 5 && m>0 && m < 5)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int[] s = new int[5];
		int n;
		int m;
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (hs(n, m) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				s[i] = sz[n][i];
				sz[n][i] = sz[m][i];
				sz[m][i] = s[i];
			}
		   for (i = 0;i < 5;i++)
		   {
			   for (j = 0;j < 4;j++)
			   {
				   System.out.printf("%d ",sz[i][j]);
			   }
								  System.out.printf("%d",sz[i][4]);
				   System.out.print("\n");
		   }
		}
		else
		{
			System.out.print("error");
		}
	}


}

