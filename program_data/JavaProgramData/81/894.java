package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int panduan = new int(int x,int y);
		int m;
		int n;
		int[][] a =
		{
			{0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0}
		};
		int i;
		int j;
		int t;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
			//printf("\n");
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
			if (panduan(n, m) == 1)
			{
				for (i = 0;i < 5;i++)
				{
					t = a[n][i];
					a[n][i] = a[m][i];
					a[m][i] = t;
				}
				for (i = 0;i < 5;i++)
				{
					for (j = 0;j < 4;j++)
					{
					System.out.printf("%d ",a[i][j]);
					}
					System.out.printf("%d",a[i][4]);
					System.out.print("\n");
				}
			}
			else if (panduan(n, m) == 0)
			{
				System.out.print("error");
			}

	}

	public static int panduan(int x,int y)
	{
		int z;
		z = (x < 5 && x >= 0) && (y < 5 && y >= 0)?1:0;
		return (z);
	}
}

