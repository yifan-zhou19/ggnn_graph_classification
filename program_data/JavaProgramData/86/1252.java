package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] bad = new int[10];
		int[] badnum = new int[10];
		int i;
		int j;
		int k;
		int time;
		int[] goodnum = new int[10];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			bad[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (bad[j] == 0)
			{
				goodnum[j] = 60;
			}
			for (i = 0;i < bad[j];i++)
			{
				badnum[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (i = 0;i < bad[j];i++)
			{
				time = badnum[i] + 3 * (i + 1);
				if (time >= 60 && badnum[i] + 3 * i < 60)
				{
					goodnum[j] = badnum[i];
					break;

				}
				if (badnum[i] + 3 * i >= 60)
				{
					goodnum[j] = 60 - 3 * i;
					break;
				}
				else if (i == bad[j] - 1)
				{
					goodnum[j] = 60 - 3 * (i + 1);
				}

			}

		}

		for (j = 0;j < n;j++)
		{
			System.out.print(goodnum[j]);
			System.out.print("\n");
		}
		return 0;
	}



}

