package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static void fanzhi(int i,int j)
	{
		int x;
		int y;
		for (x = i - 1;x <= i + 1;x++)
		{
			for (y = j - 1;y <= j + 1;y++)
			{
				b[x][y] = b[x][y] + a[i][j];
			}
		}
		b[i][j] = b[i][j] + a[i][j];
	}
	public static int Main()
	{
		int m;
		int n;
		int k;
		int i;
		int j;
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
		a[4][4] = m;
		for (k = 1;k <= n;k++) //???k?????
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = 4 - k + 1;i <= 4 + k - 1;i++)
			{
				for (j = 4 - k + 1;j <= 4 + k - 1;j++)
				{
					fanzhi(i, j);
				}
			}
			for (i = 4 - k;i <= 4 + k;i++)
			{
				for (j = 4 - k;j <= 4 + k;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 7;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][8]);
		}
	}
}

