package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] from = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					from[i][j] = Integer.parseInt(tempVar);
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
		if (n < 5 && m < 5)
		{
			int[] a = new int[5];
			for (i = 0;i < 5;i++)
			{
				a[i] = from[n][i];
				from[n][i] = from[m][i];
				from[m][i] = a[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 5;j++)
				{
					if (j != 4)
					{
					System.out.printf("%d ", from[i][j]);
					}
					else if (j == 4)
					{
					System.out.printf("%d", from[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}
	}





}

