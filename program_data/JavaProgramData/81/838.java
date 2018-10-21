package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int j;
		int i;
		int n;
		int m;
		int a;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  (sz[i][j]) = Integer.parseInt(tempVar);
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
			if (n >= 0 && n < 5 && m >= 0 && m < 5)
			{
				 for (i = 0;i < 5;i++)
				 {
					   a = sz[m][i];
					   sz[m][i] = sz[n][i];
					   sz[n][i] = a;
				 }
				   for (i = 0;i < 5;i++)
				   {
					   for (j = 0;j < 5;j++)
					   {
							if (j > 0)
							{
							   System.out.print(" ");
							}
							if (j != 4)
							{
							   System.out.printf("%d",sz[i][j]);
							}
							else
							{
							   System.out.printf("%d\n",sz[i][j]);
							}

					   }
				   }
			}
			   else
			   {
				   System.out.print("error");
			   }

		return 0;
	}
}

