package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] arrive = new int[1000];
		int[] leave = new int[1000];
		int[] time = new int[2000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			arrive[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			leave[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = arrive[i];j < leave[i];j++)
			{
				time[j]++;
			}
		}
		int max = 0;
		for (i = 0;i < 2000;i++)
		{
			if (max < time[i])
			{
				max = time[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

