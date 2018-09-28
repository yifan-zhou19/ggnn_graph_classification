package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int sum;
		int m;
		int s;
		int[][] A = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		sum = row + col;
		for (i = 1;i <= row;i++)
		{
		   for (j = 1;j <= col;j++)
		   {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[i][j] = Integer.parseInt(tempVar3);
				}
		   }
		}

		for (m = 2;m <= sum;m++)
		{
		   for (i = 1;i <= row;i++)
		   {
			   s = m - i;
			   if (s > col)
			   {
				   continue;
			   }
				System.out.printf("%d\n",A[i][s]);
				if ((m - i) == 1)
				{
					break;
				}
		   }
		}
		return 0;
	}
}

