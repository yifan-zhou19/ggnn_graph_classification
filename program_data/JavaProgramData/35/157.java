package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int r;
		int c;
		int i;
		int j;
		int[][] a = new int[8][8];
		int[] max = new int[8];
		int[] maxj = new int[8];
		int[] flag = {1, 1, 1, 1, 1, 1, 1, 1};
		int flag1 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(a + i) + j = tempVar3;
				}
			if (j == 0)
			{
				max[i] = ((a + i) + j);
				maxj[i] = j;
			}
			else if (a[i][j] > max[i])
			{
				max[i] = a[i][j];
				maxj[i] = j;
			}
			}
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < r;j++)
			{
				if (a[j][maxj[i]] < max[i])
				{
					flag[i] = 0;
				}
			}
		}
		for (i = 0;i < r;i++)
		{
			if (flag[i] == 1)
			{
				System.out.printf("%d+%d\n",i,maxj[i]);
			}
			flag1 += flag[i];
		}
		if (flag1 == 0)
		{
			System.out.print("No\n");
		}
	}
}

