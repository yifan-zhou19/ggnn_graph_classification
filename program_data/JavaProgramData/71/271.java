package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x;
		int[] p = new int[3];
		int[] m = new int[3];
		int year;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[2] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if ((year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0)))
			{
				for (j = 1; j <= 2; j++)
				{
					if (m[j] == 1)
					{
						p[j] = 1;
					}
					if (m[j] == 2)
					{
						p[j] = 31 + 1;
					}
					if ((m[j] <= 7) && (m[j] >= 3))
					{
						x = (m[j] - 2) / 2;
						p[j] = x * 31 + 29 + 31 + (m[j] - 3 - x) * 30 + 1;
						x = 0;
					}
					if (m[j] >= 8)
					{
						x = (m[j] - 7) / 2;
						p[j] = x * 31 + (29 + 31 * 4 + 30 * 2) + (m[j] - 8 - x) * 30 + 1;
					}
				}
			}
			else
			{
				for (j = 1; j <= 2; j++)
				{
					if (m[j] == 1)
					{
						p[j] = 1;
					}
					if (m[j] == 2)
					{
						p[j] = 31 + 1;
					}
					if ((m[j] <= 7) && (m[j] >= 3))
					{
						x = (m[j] - 2) / 2;
						p[j] = x * 31 + 28 + 31 + (m[j] - 3 - x) * 30 + 1;
						x = 0;
					}
					if (m[j] >= 8)
					{
						x = (m[j] - 7) / 2;
						p[j] = x * 31 + (28 + 31 * 4 + 30 * 2) + (m[j] - 8 - x) * 30 + 1;
					}
				}
			}
			int t;
			t = Math.abs(p[1] - p[2]);
			if (t % 7 == 0)
			{
				System.out.print("YES");
				System.out.print("\n");
			}
			else
			{
				System.out.print("NO");
				System.out.print("\n");
			}
		}
	return 0;
	}
}

