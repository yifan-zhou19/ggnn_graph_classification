package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] bloodpressuremax = new int[101];
		int[] bloodpressuremin = new int[101];
		int[] lastingtime = new int[101];
		lastingtime[1] = 0;
		int n;
		int a = 1;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1 ; i <= n ; i++)
		{
			bloodpressuremax[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			bloodpressuremin[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (bloodpressuremax[i] <= 140 && bloodpressuremax[i] >= 90 && bloodpressuremin[i] <= 90 && bloodpressuremin[i] >= 60)
			{
				lastingtime[a] = lastingtime[a] + 1;
			}
			else
			{
				a = a + 1;
				lastingtime[a] = 0;
			}
		}

		int maxtime = 0;
		for (int j = 1; j <= a; j++)
		{
			if (maxtime <= lastingtime[j])
			{
				maxtime = lastingtime[j];
			}
		}

		System.out.print(maxtime);
		System.out.print("\n");
		return 0;
	}
}

