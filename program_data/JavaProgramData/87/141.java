package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sj = new int[100][6];
		int j;
		int s;
		int i;
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 6;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sj[i][j] = Integer.parseInt(tempVar);
			}
			}
			if (sj[i][0] == 0 && sj[i][3] == 0)
			{
				break;
			}
		}
			for (i = 0;i < 100;i++)
			{
				if (sj[i][0] == 0 && sj[i][3] == 0)
				{
					break;
				}
				else
				{
					s = 12 * 60 * 60 - (sj[i][0] - 1 - sj[i][3]) * 60 * 60 - (60 + sj[i][1] - 1 - sj[i][4]) * 60 - (sj[i][2] + 60 - sj[i][5]);
				}
				System.out.printf("%d\n",s);
			}

		return 0;
	}
}

