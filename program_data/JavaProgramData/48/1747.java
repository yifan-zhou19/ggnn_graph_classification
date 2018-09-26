package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
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
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		a[4][4] = m;
		int i;
		int j;
		int k;
		int fx;
		int fy;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (j = 1;j < 8;j++)
			{
				for (k = 1;k < 8;k++)
				{
					b[j][k] += a[j][k];

					for (fx = -1;fx <= 1;fx++)
					{
						for (fy = -1;fy <= 1;fy++)
						{
							b[j + fx][k + fy] += a[j][k];
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a,b,(Integer.SIZE / Byte.SIZE));
		}
		for (j = 0;j < 9;j++)
		{
			for (k = 0;k < 8;k++)
			{
					System.out.printf("%d ",a[j][k]);
			}
			System.out.printf("%d\n",a[j][8]);
		}
		return 0;
	}

}

