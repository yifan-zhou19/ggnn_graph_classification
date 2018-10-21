package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] a = new int[100][2];
		int[][][] c = new int[100][100][100];
		int i;
		int j;
		int p;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i][0] = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   a[i][1] = Integer.parseInt(tempVar3);
		   }
		   for (j = 0;j < a[i][0];j++)
		   {
			for (p = 0;p < a[i][1];p++)
			{
			  String tempVar4 = ConsoleInput.scanfRead();
			  if (tempVar4 != null)
			  {
				  c[i][j][p] = Integer.parseInt(tempVar4);
			  }
			}
		   }
		}
		for (i = 0;i < k;i++)
		{
		  s[i] = 0;
		  for (j = 0;j < a[i][1];j++)
		  {
		   s[i] += c[i][0][j];
		  }
		  for (j = 0;j < a[i][1];j++)
		  {
		   s[i] += c[i][a[i][0] - 1][j];
		  }
		  for (j = 1;j < a[i][0] - 1;j++)
		  {
		   s[i] += c[i][j][0];
		  }
		  for (j = 1;j < a[i][0] - 1;j++)
		  {
		   s[i] += c[i][j][a[i][1] - 1];
		  }
		  System.out.printf("%d\n",s[i]);
		}

		 return 0;
	}
}

