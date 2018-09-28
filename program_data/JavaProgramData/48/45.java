package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int[][][] a = new int[12][12][5];
		int i;
		int j;
		int l;
		int x;
		for (i = 1;i <= 11;i++)
		{
						 for (j = 1;j <= 11;j++)
						 {
										   for (l = 0;l <= 4;l++)
										   {
															 a[i][j][l] = 0;
										   }
						 }
		}
		a[6][6][0] = k;
		for (l = 1;l <= n;l++)
		{
						 for (i = 2;i <= 10;i++)
						 {
										   for (j = 2;j <= 10;j++)
										   {
															 a[i][j][l] = a[i - 1][j - 1][l - 1] + a[i - 1][j][l - 1] + a[i - 1][j + 1][l - 1] + a[i][j - 1][l - 1] + a[i][j + 1][l - 1] + a[i + 1][j - 1][l - 1] + a[i + 1][j][l - 1] + a[i + 1][j + 1][l - 1] + 2 * a[i][j][l - 1];
										   }
						 }
		}
		for (i = 2;i <= 9;i++)
		{
						 for (j = 2;j <= 9;j++)
						 {
										  System.out.printf("%d ",a[i][j][n]);
						 }
						 System.out.printf("%d\n",a[i][10][n]);
		}
		 for (j = 2;j <= 9;j++)
		 {
						  System.out.printf("%d ",a[10][j][n]);
		 }
		 System.out.printf("%d",a[10][10][n]);
		 //scanf("%d",&l);
		 return 0;
	}

}

