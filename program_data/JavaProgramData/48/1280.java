package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int m;
	int n;
	int k;
	int[][] a = new int[9][9];
	int[][] b = new int[9][9];
	for (i = 0;i < 9;i++)
	{
	for (j = 0;j < 9;j++)
	{
			a[i][j] = 0;
			b[i][j] = 0;
	}
	}
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
	b[4][4] = m;
	for (k = 0;k < n;k++)
	{
			for (i = 1;i < 8;i++)
			{
			for (j = 1;j < 8;j++)
			{
			a[i][j] = b[i - 1][j - 1] + b[i - 1][j] + b[i - 1][j + 1] + b[i][j - 1] + b[i][j + 1] + b[i + 1][j - 1] + b[i + 1][j] + b[i + 1][j + 1] + 2 * b[i][j];
			}
			}
			for (i = 1;i < 8;i++)
			{
			  a[i][0] = b[i - 1][0] + b[i + 1][0] + b[i - 1][1] + b[i][1] + b[i + 1][1] + 2 * b[i][0];
			  a[i][8] = a[i][0];
			}
			for (j = 1;j < 8;j++)
			{
			  a[0][j] = a[j][0];
			  a[8][j] = a[0][j];
			}
			a[0][0] = b[0][1] + b[1][0] + b[1][1];
			a[0][8] = a[0][0];
			a[8][0] = a[0][0];
			a[8][8] = a[0][0];
			for (i = 0;i < 9;i++)
			{
			for (j = 0;j < 9;j++)
			{
			b[i][j] = a[i][j];
			}
			}
	}
	for (i = 0;i < 9;i++)
	{
			 for (j = 0;j < 8;j++)
			 {
			  System.out.printf("%d ",a[i][j]);
			 }
			  System.out.printf("%d\n",a[i][8]);
	}
	System.in.read();
	System.in.read();
	System.in.read();
	System.in.read();
	}

}

