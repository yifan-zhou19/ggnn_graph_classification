package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int d = 10;
		int[][] a = new int[d][d];
		int[][] b = new int[d][d];
	int i;
	int j;
	int k;
	int m;
	int n;
	int fx;
	int fy;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,(Integer.SIZE / Byte.SIZE));
	a[5][5] = m;
	for (i = 0;i < n;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (k = 1;k < d - 1;k++)
		{
			for (j = 1;j < d - 1;j++)
			{
			b[k][j] += a[k][j];
		for (fx = -1;fx <= 1;fx++)
		{
			for (fy = -1;fy <= 1;fy++)
			{
		  b[k + fx][j + fy] += a[k][j];
			}
		}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(a,b,(Integer.SIZE / Byte.SIZE));
	}
		for (i = 1;i < d;i++)
		{
			for (j = 1;j < d - 1;j++)
			{
		System.out.printf("%d ",a[i][j]);
			}
		System.out.printf("%d\n",a[i][d - 1]);
		}
		return 0;
	}


}

