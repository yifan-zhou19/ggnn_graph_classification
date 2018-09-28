package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[100][100];
		int row;
		int col;
		int[] b = new int[100];
		int[] s = new int[100];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(a[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			b[i] = a[i][0];
		}
		for (i = 0;i < row;i++)
		{
			for (j = 1;j < col;j++)
			{

				if (b[i] > a[i][j])
				{
					b[i] = b[i];
				}
				else
				{
					b[i] = a[i][j];
				}

			}

		}

		for (j = 0;j < col;j++)
		{
		   s[j] = a[0][j];
		}


		for (j = 0;j < col;j++)
		{
			for (i = 1;i < row;i++)
			{

				if (a[i][j] < s[j])
				{
					s[j] = a[i][j];
				}
				else
				{
					s[j] = s[j];
				}
			}

		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if (s[j] == b[i])
				{
					System.out.printf("%d+%d",i,j);
					sum += 1;
				}
			}
		}
		if (sum == 0)
		{
			System.out.print("No");
		}
		return 0;
	}

}

