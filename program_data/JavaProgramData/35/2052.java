package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t = 0;
		int j;
		int[][] a = new int[100][100];
		int[] b = new int[100];
		int[] c = new int[100];
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
				if (a[i][j] > b[i])
				{
					b[i] = a[i][j];
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < m;i++)
			{
				c[j] = a[0][j];
				if (a[i][j] < c[j])
				{
					c[j] = a[i][j];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i] == c[j])
				{
				  System.out.printf("%d+%d",i,j);
				  t = 1;
				}
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}





}

