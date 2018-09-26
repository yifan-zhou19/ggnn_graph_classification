package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[9][9];
		int m;
		int n;
		int i;
		int r;
		int j;
		int max_l;
		int temp;
		int f = 0;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				f = 0;
				for (r = 0;r < n;r++)
				{
					if (a[i][j] < a[i][r])
					{
						f = 1;

					}
				}
				for (r = 0;r < m;r++)
				{
					if (a[i][j] > a[r][j])
					{
						f = 1;
					}
				}
				if (f == 0)
				{

					System.out.printf("%d+%d",i,j);
					h = 1;
				}

			}
		}
		if (h == 0)
		{
			System.out.print("No");
		}


	}

}

