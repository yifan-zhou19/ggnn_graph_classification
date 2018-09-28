package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int time;
		int cnt = 0;
		int[] delta = new int[1001];

		while (true)
		{
			time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			delta[time]++;
			cnt++;
			if (System.in.read() != ',')
			{
				break;
			}
		}

		int i;
		char comma;
		for (i = 0; i < cnt; i++)
		{
			time = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			comma = ConsoleInput.readToWhiteSpace(true).charAt(0);
			delta[time]--;
		}

		int curprecent = 0;
		int max = 0;
		for (i = 0; i < 1001; ++i)
		{
			curprecent += delta[i];
			if (curprecent > max)
			{
				max = curprecent;
			}
		}

		System.out.print(cnt);
		System.out.print(' ');
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

