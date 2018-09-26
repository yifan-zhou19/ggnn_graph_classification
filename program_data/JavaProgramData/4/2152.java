package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[120][120];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= row;i++)
		{
							for (j = 1;j <= col;j++)
							{
												   String tempVar3 = ConsoleInput.scanfRead();
												   if (tempVar3 != null)
												   {
													   a[i][j] = Integer.parseInt(tempVar3);
												   }
							}
		}
		for (i = 1;i <= col;i++)
		{
							k = i;
							j = 1;
							while (k >= 1 && j <= row)
							{
										System.out.printf("%d\n", a[j][k]);
										j++;
										k--;
							}
		}
		for (j = 2;j <= row;j++)
		{
										 k = col;
										 i = j;
										 while (j <= row != 0 && k >= 1)
										 {
														   System.out.printf("%d\n", a[j][k]);
														   j++;
														   k--;
										 }
										j = i;
		}
		return 0;
	}

}

