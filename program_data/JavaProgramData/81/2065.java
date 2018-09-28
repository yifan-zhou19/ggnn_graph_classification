package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] z = new int[5][5];
		int[][] x = new int[5][5];
		int n;
		int m;
		int i = 0;
		for (int row = 0; row < 5; row++)
		{
				for (int col = 0; col < 5; col++)
				{
						String tempVar = ConsoleInput.scanfRead();
						if (tempVar != null)
						{
							z[row][col] = Integer.parseInt(tempVar);
						}
				}
		}
		for (int row = 0; row < 5; row++)
		{
				for (int col = 0; col < 5; col++)
				{
					x[row][col] = z[row][col];
				}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n <= 4 && n >= 0 && m <= 4 && m >= 0)
		{
			for (int i = 0;i < 5;i++)
			{
				x[n][i] = z[m][i];
				x[m][i] = z[n][i];
			}
			 for (int row = 0; row < 5; row++)
			 {
				for (int col = 0; col < 4; col++)
				{
					System.out.printf("%d ",x[row][col]);
				}
				System.out.printf("%d",x[row][4]);
				System.out.print("\n");
			 }
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

