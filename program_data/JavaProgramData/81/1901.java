package <missing>;

public class GlobalMembers
{
	public static int exch(int[][] a, int rowa, int rowb)
	{
		if (rowa < 0 || rowa>4 || rowb < 0 || rowb>4)
		{
			return 0;
		}
		else
		{
			int col;
			for (col = 0;col < 5;col++)
			{
				int temp;
				temp = a[rowa][col];
				a[rowa][col] = a[rowb][col];
				a[rowb][col] = temp;
			}
			return 1;
		}
	}

	public static int Main()
	{
		int[][] a = new int[5][5];
		int rowa;
		int rowb;
		int row;
		int col;
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			rowa = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			rowb = Integer.parseInt(tempVar3);
		}
		switch (exch(a, rowa, rowb))
		{
			case 0:
			{
				System.out.print("error");
				break;
			}
			case 1:
			{
				for (row = 0;row < 5;row++)
				{
					System.out.printf("\n%d",a[row][0]);
					for (col = 1;col < 5;col++)
					{
						System.out.printf(" %d",a[row][col]);
					}
				}
			}
		}
		return 0;
	}

}

