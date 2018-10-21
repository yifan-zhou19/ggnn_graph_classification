package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int[][] a = new int[9][9];
	int[][] b = new int[9][9];
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
	for (int i = 0;i < 9;i++)
	{
					for (int j = 0;j < 9;j++)
					{
					a[i][j] = 0;
					b[i][j] = 0;
					}
	}
	  a[4][4] = m;
	for (int k = 0;k < n;k++)
	{
		for (int i = 0;i < 9;i++)
		{
					for (int j = 0;j < 9;j++)
					{
				   if (a[i][j] != 0)
				   {
				   b[i - 1][j] += a[i][j];
				   b[i + 1][j] += a[i][j];
				   b[i][j - 1] += a[i][j];
				   b[i][j + 1] += a[i][j];
				   b[i - 1][j - 1] += a[i][j];
				   b[i + 1][j + 1] += a[i][j];
				   b[i - 1][j + 1] += a[i][j];
				   b[i + 1][j - 1] += a[i][j];
					b[i][j] += 2 * a[i][j];
				   }
					}
		}
					 for (int i = 0;i < 9;i++)
					 {
					for (int j = 0;j < 9;j++)
					{
							a[i][j] = b[i][j];
							b[i][j] = 0;
					}
					 }
	}
	  for (int i = 0;i < 9;i++)
	  {
	for (int j = 0;j < 9;j++)
	{
		if (j != 8)
		{
					System.out.printf("%d ",a[i][j]);
		}
		else
		{
			  System.out.printf("%d\n",a[i][j]);
		}
	}
	  }
	int hou;
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		hou = Integer.parseInt(tempVar3);
	}
	return 0;
	}

}

