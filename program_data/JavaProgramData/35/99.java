package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int ii;
		int jj;
		int real = 1;
		int m;
		int n;
		int truth = 0;
		int[][] num = new int[8][8];
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
					num[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				real = 1;
				for (ii = 0;ii < m;ii++)
				{
					if (i == ii)
					{
						continue;
					}
					if (num[ii][j] < num[i][j])
					{
						real = 0;
					}
					if (real == 0)
					{
						break;
					}
				}
				for (jj = 0;jj < n;jj++)
				{
					if (j == jj)
					{
						continue;
					}
					if (num[i][jj] > num[i][j])
					{
						real = 0;
					}
					if (real == 0)
					{
						break;
					}
				}
				if (real == 1)
				{
					System.out.printf("%d+%d",i,j);
					truth = 1;
				}
			}
		}
			if (truth == 0)
			{
				System.out.print("No");
			}
	}
}

