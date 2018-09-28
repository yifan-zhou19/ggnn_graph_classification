package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int i;
		int j;
		int k;
		int x;
		int y;

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
		a[4][4] = m;

		for (k = 0;k < n;k++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (i = 1;i < 8;i++)
			{
				for (j = 1;j < 8;j++)
				{
					b[i][j] += a[i][j];
					for (x = -1;x <= 1;x++)
					{
						for (y = -1;y <= 1;y++)
						{
							b[i + x][j + y] += a[i][j];
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(a,b,(Integer.SIZE / Byte.SIZE));
		}

		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][8]);
		}
	}

}

