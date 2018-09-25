package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int j;
		int ans;
		int n;
		int m;
		int i;
		int[] stop = new int[61];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			n--;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (i = 0; i < m; i++)
				{
					stop[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				t = 1;
				ans = 0;
				j = 0;
				while (t <= 60)
				{
					if (j == m)
					{
						ans = ans + 61 - t;
						break;
					}
					if (ans != stop[j])
					{
						ans++;
					}
					else
					{
						t += 2;
						j++;
					}
					t++;
				}
				System.out.print(ans);
				System.out.print("\n");
			}
		}
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

