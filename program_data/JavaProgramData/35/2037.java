package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int J;
		int k;
		int M;
		int t;
		int[][] a = new int[8][8];
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
			M = a[i][0];
			J = 0;
			t = 1;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > M)
				{
					M = a[i][j];
					J = j;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (a[k][J] < a[i][J])
				{
					t = 0;
				}
			}
			if (t == 1)
			{
				System.out.printf("%d+%d",i,J);
				break;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

