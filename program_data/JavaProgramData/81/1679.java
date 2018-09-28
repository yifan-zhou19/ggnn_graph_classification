package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shuzu = new int[5][5];
		int row;
		for (row = 0;row < 5;row++)
		{
			for (int col = 0;col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		int n;
		int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (m > 4 || n > 4)
		{
			System.out.print("error");
			return 0;
		}
		else if (m < 5 && n < 5)
		{
			int[] a = new int[5];
			for (int col = 0;col < 5;col++)
			{
				a[col] = shuzu[n][col];
				shuzu[n][col] = shuzu[m][col];
				shuzu[m][col] = a[col];
			}
		}
		for (row = 0;row < 5;row++)
		{
			for (int col = 0;col < 4;col++)
			{
				System.out.printf("%d ",shuzu[row][col]);
			}
			System.out.printf("%d",shuzu[row][4]);
			System.out.print("\n");
		}
		return 0;
	}
}

