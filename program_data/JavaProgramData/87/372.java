package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sa = new int[100][6];
		int i;
		int j;
		int n;
		int[] sb = new int[100];
		for (i = 0;i < 100;i++)
		{
			for (j = 0;j < 6;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sa[i][j] = Integer.parseInt(tempVar);
				}
			}
			if (sa[i][0] == 0)
			{
				break;
			}
		}
		n = i;
		for (i = 0;i < n;i++)
		{
			sb[i] = (12 - sa[i][0] - 1) * 3600 + (60 - sa[i][1] - 1) * 60 + 60 - sa[i][2] + 3600 * sa[i][3] + 60 * sa[i][4] + sa[i][5];
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",sb[i]);
		}
		return 0;
	}

}

