package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int ii;
		int temp_i;
		int temp_j;
		int[][] a = new int[8][8];
		int flag = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			temp_i = i;
			temp_j = 0;
			for (j = 1;j < m;j++)
			{
				if (a[i][j] > a[temp_i][temp_j])
				{
					temp_j = j;
				}
			}

			ii = 0;
			while (a[ii][temp_j] >= a[temp_i][temp_j] != 0 && ii < n)
			{
				ii++;
			}

			if (ii == n)
			{
				System.out.printf("%d+%d\n", temp_i, temp_j);
				flag = 1;
				break;
			}
		}

		if (flag == 0)
		{
			System.out.print("No\n");
		}


		return 0;
	}
}

