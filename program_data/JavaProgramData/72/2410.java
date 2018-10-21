package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int len;
		int wid;
		int i;
		int j;
		int[][] a = new int[20][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			len = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			wid = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < wid;j++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Integer.parseInt(tempVar3);
			}
			}
		}
		for (i = 0;i < len;i++)
		{
			for (j = 0;j < wid;j++)
			{
				if (i == 0 && j == 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i + 1][j])
				{
				System.out.printf("%d %d\n",i,j);
				}
			else if (i == 0 && j == (wid - 1) && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j])
			{
				System.out.printf("%d %d\n",i,j);
			}
			else if (i == (len - 1) && j == 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
			{
				System.out.printf("%d %d\n",i,j);
			}
			else if (i == (len - 1) && j == (wid - 1) && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
			{
				System.out.printf("%d %d\n",i,j);
			}
			else if (i == 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
			{
					System.out.printf("%d %d\n",i,j);
			}
			else if (i == (len - 1) && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
			{
				   System.out.printf("%d %d\n",i,j);
			}
			else if (j == 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
			{
				   System.out.printf("%d %d\n",i,j);
			}
			else if (j == (wid - 1) && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
			{
				   System.out.printf("%d %d\n",i,j);
			}
			else if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
			{
				   System.out.printf("%d %d\n",i,j);
			}
			}
		}
	}

}

