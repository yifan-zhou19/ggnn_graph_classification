package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int n;
		int m;
		int i;
		int j;
		int e;
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
		if ((n >= 0) && (n < 5) && (m >= 0) && (m < 5))
		{
		  for (i = 0;i < 5;i++)
		  {
			e = sz[n][i];
			sz[n][i] = sz[m][i];
			sz[m][i] = e;
		  }

		  for (i = 0;i < 5;i++)
		  {
		   for (j = 0;j < 5;j++)
		   {
			 System.out.printf("%d",sz[i][j]);
		   if (j < 4)
		   {
			   System.out.print(" ");
		   }
		   else if (!(j < 4))
		   {
			   System.out.print("\n");
		   }
		   }

		  }
		  return 0;
		}
		System.out.print("error");

		return 0;
	}

}

