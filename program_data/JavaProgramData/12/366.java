package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][16];
		int i = 0;
		int j = 0;
		int x;
		int y;
		int z;
		int m;
		do
		{
			j = 0;
			do
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				if (a[i][j] == -1)
				{
					break;
				}
				j++;
			} while (a[i][j - 1] != 0);
			if (a[i][j] == -1)
			{
				break;
			}
			else
			{
				i++;
			}
		} while (1 == 1);
		for (x = 0;x < i;x++)
		{
			m = 0;
			{
				for (y = 0;a[x][y] != 0;y++)
				{
				for (z = 0;a[x][z] != 0;z++)
				{
					if (a[x][z] == 2 * a[x][y])
					{
						m++;
					}
				}
				}
			}
			System.out.printf("%d\n",m);
		}
	}

}

