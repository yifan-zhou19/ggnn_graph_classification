package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int n = 0;
		int row;
		int col;
		int[][] sz = new int[100][100];
		int[] xz = new int[10000];
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
	   for (k = 0;n < row * col;k++)
	   {
			i = 0 + k;
			for (j = 0 + k;j < col - k;j++)
			{
				xz[n] = sz[i][j];
				n++;
			}
			for (j--,i = 1 + k;i < row - k;i++)
			{
				xz[n] = sz[i][j];
				n++;
			}
			for (i--,j = col - 2 - k;j >= 0 + k;j--)
			{
				 xz[n] = sz[i][j];
				 n++;
			}
			for (j++,i = row - 2 - k;i >= 1 + k;i--)
			{
				 xz[n] = sz[i][j];
				 n++;
			}
	   }
		for (n = 0;n < row * col;n++)
		{
		System.out.printf("%d\n",xz[n]);
		}
		return 0;

	}

}

