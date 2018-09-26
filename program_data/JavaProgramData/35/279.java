package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int m;
		int n;
		int t1;
		int t2;
		int k = 0;
		int k2 = 0;
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

		for (j = 0;j < n;j++)
		{
			t1 = a[0][j];
			t2 = 0;
			for (i = 1;i < m;i++)
			{
				if (a[i][j] < t1)
				{
					t1 = a[i][j];
					t2 = i;
				}
			}
			for (i = 0;i < m;i++)
			{
				if (a[t2][i] > t1)
				{
					k = 1;
					break;
				}
				else
				{
					k = 0;
				}
			}
			if (k == 0)
			{
				System.out.printf("%d+%d\n",t2,j);
				k2 = 1;
			}
			k = 0;

		}
		if (k2 == 0)
		{
			System.out.print("No");
		}
	}


}

