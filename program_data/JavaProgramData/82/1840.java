package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] high = new int[n];
		int[] low = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			high[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			low[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int[] contin = new int[n];
		for (int i = 0;i <= n - 1;i++)
		{
			contin[i] = 0;
		}
		for (int k = 0;k <= n - 1;k++)
		{
			for (int i = k;i <= n - 1;i++)
			{
				if ((high[i] >= 90) && (high[i] <= 140) && (low[i] >= 60) && (low[i] <= 90))
				{
					contin[k] = contin[k] + 1;
				}
				else
				{
					break;
				}
			}
		}
		int max = contin[0];
		for (int i = 0;i <= n - 1;i++)
		{
			if (contin[i] > max)
			{
				max = contin[i];
			}
		}
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

