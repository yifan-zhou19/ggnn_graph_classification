package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100];
		int[][] b = new int[100][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] != 0)
			{
				for (j = 1;j <= a[i];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == 0)
			{
				System.out.print("60\n");
			}
			else
			{
				if (b[i][a[i]] + 3 * a[i] <= 60)
				{
					System.out.printf("%d\n",60 - 3 * a[i]);
				}
				for (j = 1;j <= a[i];j++)
				{
					if ((b[i][j] + 3 * j <= 60) && (b[i][j + 1] + 3 * j + 3 >= 63))
					{
						System.out.printf("%d\n",60 - 3 * j);
					}
					else if (b[i][j] + 3 * j >= 60 && b[i][j] + 3 * j < 63)
					{
						System.out.printf("%d\n",b[i][j]);
					}
				}
			}
		}
	}
}

