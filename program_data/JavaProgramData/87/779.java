package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][6];
		int[] ds = new int[100];
		int i;
		int j;
		int k = 0;
		for (j = 0;j < 6;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s[0][j] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i >= 0;i++)
		{
			if (s[i][0] != 0)
			{
				for (j = 0;j < 6;j++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						s[i + 1][j] = Integer.parseInt(tempVar2);
					}
				}
				ds[i] = 3600 * (s[i][3] + 12) + 60 * s[i][4] + s[i][5] - 3600 * s[i][0] - 60 * s[i][1] - s[i][2];
				System.out.printf("%d\n",ds[i]);
				k++;
			}
			else
			{
				break;
			}
		}

		return 0;
	}

}

