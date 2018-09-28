package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int i;
		int j;
		int k;
		int m;
		int n;
		int t = 0;
		int max_i;
		int max_j;
		int mark_1 = 0;
		int mark_2 = 0;

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
			mark_2 = 0;
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a[i][j] > a[i][k])
					{
						mark_1++;
					}
				}
				if (mark_1 == n - 1)
				{
					max_i = i;
					max_j = j;
				}
				mark_1 = 0;
			}
			for (k = 0;k < m;k++)
			{
				if (a[max_i][max_j] < a[k][max_j])
				{
					mark_2++;
				}
			}
			if (mark_2 == m - 1)
			{
				t++;
			}
			break;
		}
		if (t == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			System.out.printf("%d+%d\n",max_i,max_j);
		}
	}


}

