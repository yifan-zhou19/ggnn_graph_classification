package <missing>;

public class GlobalMembers
{
	//?????????
	//20101116 ??
	public static int Main()
	{
		int n; //pause[]???????ps[][]????????????sum[]??60??????
		int[] pause = new int[20];
		int[][] ps = new int[20][20];
		int[] sum = new int[20];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			pause[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 1;j <= pause[i];j++)
				{
					ps[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (i = 1;i <= n;i++)
		{
			if (pause[i] == 0)
			{
				sum[i] = 60; //????????60
			}
			for (j = 1;j <= pause[i];j++)
			{
				if (ps[i][pause[i]] + 3 * pause[i] <= 60)
				{
					sum[i] = 60 - 3 * pause[i]; //????
				}
					else if ((ps[i][j] + 3 * j < 60) && (ps[i][j + 1] + 3 * j>60))
					{
					sum[i] = 60 - 3 * j;
					}
				else if ((ps[i][j] + 3 * j < 60) && (ps[i][j + 1] + 3 * j <= 60) && (ps[i][j + 1] + 3 * j + 3 >= 60))
				{
					sum[i] = ps[i][j + 1];
				}
			}
		System.out.print(sum[i]);
		System.out.print("\n");
		}
	return 0;
	}

}

