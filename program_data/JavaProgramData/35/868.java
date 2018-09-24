package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int p;
		int k;
		int i;
		int j;
		int q;
		int t;
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
		t = 0;
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
			p = 0;
			q = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > a[i][q])
				{
					q = j;
				}
			}
			for (k = 0;k < m;k++)
			{
					if (a[k][q] < a[p][q])
					{
						p = k;
					}
			}
			if (p == i)
			{
					t = 1;

					System.out.printf("%d+%d",p,q);
			}


		}
		if (t == 0)
		{
			System.out.print("No");
		}

	}
}

