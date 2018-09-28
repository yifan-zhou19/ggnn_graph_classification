package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] high = new int[101];
		int[] low = new int[101];
		int time = 0;
		int[] continuous = new int[101];
		int max = 0;
		for (int i = 1; i <= n; i++)
		{
			high[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 1; j <= n; j++)
		{
			if (high[j] >= 90 && high[j] <= 140 && low[j] >= 60 && low[j] <= 90)
			{
				time++;
				continuous[j] = time;
			}
			else
			{
				continuous[j] = time = 0;
			}
		}
		max = continuous[1];
		for (int k = 1; k <= n; k++)
		{
			if (max < continuous[k])
			{
				max = continuous[k];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}
}

