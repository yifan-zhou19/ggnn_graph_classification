package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[][] xie = new int[100][3];
		int[] time = new int[100];
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			xie[i][0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			xie[i][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (xie[i][0] >= 90 && xie[i][0] <= 140 && xie[i][1] >= 60 && xie[i][1] <= 90)
			{
				xie[i][2] = 1;
			}
			else
			{
				xie[i][2] = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (xie[i][2] == 1)
			{
				time[j]++;
			}
			else
			{
				j++;
			}
		}
		max = time[0];
		for (i = 0;i < n;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

