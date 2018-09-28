package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][200];
		int i;
		int j;
		int m;
		int n;
		int h;
		for (j = 0;j < 200;j++)
		{
			m = 0;
			n = 0;
			h = 0;
			for (i = 0;i < 6;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (a[0][j] == 0 && a[1][j] == 0 && a[2][j] == 0 && a[3][j] == 0 && a[4][j] == 0 && a[5][j] == 0)
			{
				break;
			}
			else
			{
				m = a[0][j] * 3600 + a[1][j] * 60 + a[2][j];
				n = (a[3][j] + 12) * 3600 + a[4][j] * 60 + a[5][j];
				h = n - m;
				System.out.printf("%d\n",h);
			}
		}
		return 0;
	}


}

