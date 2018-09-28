package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int num;
		int day;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			day = Integer.parseInt(tempVar2);
		}
		a[4][4] = num;
		for (i = 0;i < day;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,(Integer.SIZE / Byte.SIZE));
			for (j = 1;j < 8;j++)
			{
				for (k = 1;k < 8;k++)
				{
					b[j][k] += a[j][k];
					for (l = -1;l <= 1;l++)
					{
						for (m = -1;m <= 1;m++)
						{
							b[j + l][k + m] += a[j][k];
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

