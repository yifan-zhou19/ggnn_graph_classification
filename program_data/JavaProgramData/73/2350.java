package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		int p = 0;
		int flag = 0;
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
			k = a[i][0];
			m = i;
			n = 0;
			for (j = 1;j <= 4;j++) //in a row
			{
				if (a[i][j] > k)
				{
					k = a[i][j];
					m = i;
					n = j;
				}

			}
			for (l = 0;l <= 4;l++) //in the column.
			{
				if (a[l][n] < a[m][n])
				{
					p++;
					break;
				}
			}
			if (p == 0)
			{
				System.out.printf("%d %d %d\n",m + 1,n + 1,k);
				flag++;
			}
			p = 0;
		}
		if (flag == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}



}

