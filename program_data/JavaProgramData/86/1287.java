package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int people;
		people = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		while (true)
		{
			int[] badjump = new int[20];
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i <= n - 1;i++)
			{
				badjump[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			int realtime;
			int realjump = 0;
			int j = 0;
			for (realtime = 1;;realtime++)
			{
				realjump++;
				if (realtime == 3 * j + badjump[j])
				{
					realtime += 3;
					j++;
				}
				if (realtime >= 60)
				{
					break;
				}

			}
			System.out.print(realjump);
			System.out.print("\n");

			num++;
			if (num == people)
			{
				break;
			}
		}
		return 0;
	}

}

