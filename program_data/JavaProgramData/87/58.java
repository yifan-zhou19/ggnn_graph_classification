package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int j;
		int c;
		int[][] u = new int[1000][6];
		int start;
		int end;
		int result;
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					u[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (u[i][0] == 0 && u[i][1] == 0 && u[i][2] == 0 && u[i][3] == 0 && u[i][4] == 0 && u[i][5] == 0)
			{
				break;
			}
		}
		for (c = 0;c < i;c++)
		{

			start = u[c][0] * 3600 + u[c][1] * 60 + u[c][2];
			end = (u[c][3] + 12) * 3600 + u[c][4] * 60 + u[c][5];
			result = end - start;
		System.out.printf("%d\n",result);
		}
		return 0;
	}
}

