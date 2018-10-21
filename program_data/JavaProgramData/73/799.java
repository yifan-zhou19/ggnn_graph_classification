package <missing>;

public class GlobalMembers
{
	// andian
	public static void Main()
	{
		int[][] a = new int[5][5];
		int j = 0;
		int i = 0;
		int k = 0;
		while (j < 5)
		{
			while (i < 5)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[j][i] = Integer.parseInt(tempVar);
				}
				i++;
			}
			i = 0;
			j++;
		}
		for (j = i = 0; j < 5; j++)
		{
			for (i = 0;i < 5;i++)
			{
				if (a[j][i] >= a[j][0] != 0 && a[j][i] >= a[j][1] != 0 && a[j][i] >= a[j][2] != 0 && a[j][i] >= a[j][3] != 0 && a[j][i] >= a[j][4])
				{
					if (a[j][i] <= a[0][i] != 0 && a[j][i] <= a[1][i] != 0 && a[j][i] <= a[3][i] != 0 && a[j][i] <= a[4][i] != 0 && a[j][i] <= a[2][i])
					{
						System.out.printf("%d %d %d",j + 1,i + 1,a[j][i]);
						k++;
					}
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}
	}
}

