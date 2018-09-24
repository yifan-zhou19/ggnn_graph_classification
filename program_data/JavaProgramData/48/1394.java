package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[][][] a = new int[11][11][5];
	public static int Main()
	{
		int xj = new int(int i,int j,int k);
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[5][5][0] = m;
		for (k = 0;k < n;k++)
		{
		  for (i = 4 - k;i < 7 + k;i++)
		  {
		   for (j = 4 - k;j < 7 + k;j++)
		   {
			a[i][j][k + 1] = xj(i, j, k);
		   }
		  }
		}
		for (i = 1;i < 10;i++)
		{
		 for (j = 1;j < 9;j++)
		 {
		 System.out.printf("%d ",a[i][j][n]);
		 }
		 System.out.printf("%d",a[i][9][n]);
		 System.out.print("\n");
		}
	}
	public static int xj(int i,int j,int k)
	{
		int p = 0;
		int l;
		for (l = -1;l < 2;l++)
		{
		p = p + a[i + l][j][k] + a[i + l][j - 1][k] + a[i + l][j + 1][k];
		}
		return p + a[i][j][k];
	}

}

