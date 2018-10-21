package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int s;
		int d;
		int k;
		int l;
		int time = 0;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i <= 4;i++)
		{
			s = a[i][0];
			d = 0;
			for (j = 1;j <= 4;j++)
			{
				if (a[i][j] >= s)
				{
					s = a[i][j];
					d = j;
				}
			}
			l = a[i][d];
			for (k = 0;k <= 4;k++)
			{
				if (a[k][d] <= l)
				{
					l = a[k][d];
				}
			}
			if (l == a[i][d])
			{
				i++;
				d++;
				System.out.printf("%d %d %d",i,d,l);
				time++;
				i--;
			}
		}
		if (time == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

