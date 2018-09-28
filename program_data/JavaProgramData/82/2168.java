package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] pressure = new int[100][2];
		int[] time = new int[100];
		int j = 0;
		int maxtime;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < 100;k++)
		{
			time[k] = 0;
		}
		for (int i = 0;i < n;i++)
		{
				pressure[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				pressure[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if ((pressure[i][0] >= 90) && (pressure[i][0] <= 140) && (pressure[i][1] <= 90) && (pressure[i][1] >= 60))
					{
						time[j]++;
					}
					else
					{
						j++;
					}
		}
		maxtime = time[0];
		for (int m = 0;m < 100;m++)
		{
			if (maxtime < time[m])
			{
				maxtime = time[m];
			}
		}
		System.out.print(maxtime);
		System.out.print("\n");
		return 0;
	}

}

