package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] counts = new int[16];
		int n;
		int m;
		int i;
		int j;
		int flag;
		int time;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			flag = time = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				time = 60;
			}
			for (j = 1; j <= m; j++)
			{
				counts[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 1; j <= m; j++)
			{
				flag += counts[j] - counts[j - 1];
				time += counts[j] - counts[j - 1];
				if (time >= 60)
				{
					System.out.print(flag - time + 60);
					System.out.print("\n");
					break;
				}
				time += 3;
				if (time >= 60)
				{
					System.out.print(flag);
					System.out.print("\n");
					break;
				}
			}
			if (time < 60)
			{
				System.out.print(flag - time + 60);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

