package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] zl = new int[100][100];
		int i;
		int j;
		int k1 = 0;
		int t1 = 0;
		int k2 = 0;
		int t2 = 0;
		int r = 0;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < n;j++)
		   {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  zl[i][j] = Integer.parseInt(tempVar2);
			  }
		   }
		}
		for (i = 0;i < n;i++)
		{
		   for (j = 0;j < n;j++)
		   {
			  if (zl[i][j] == 0 && zl[i - 1][j] == 255 && zl[i][j - 1] == 255)
			  {
				k1 = i;
				t1 = j;
			  }
		   else if (zl[i][j] == 0 && zl[i + 1][j] == 255 && zl[i][j + 1] == 255)
		   {
				k2 = i;
				t2 = j;
		   }
		   }
		}
		for (i = k1;i <= k2;i++)
		{
		   for (j = t1;j <= t2;j++)
		   {
			  if (zl[i][j] == 255)
			  {
				r++;
			  }
		   }
		}
		System.out.printf("%d",r);
		return 0;
	}
}

