package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[60];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (int j = 0; j < m; j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (int k = m - 1; k >= 0; k--)
				{
					if (a[k] + 3 * (k + 1) <= 60)
					{
						System.out.print(a[k] + 60 - a[k] - 3 * (k + 1));
						System.out.print("\n");
						break;
					}
					else
					{
						if (a[k] + 3 * k <= 60)
						{
							System.out.print(a[k]);
							System.out.print("\n");
							break;
						}
						else
						{
							continue;
						}
					}
				}
			}
		}
		return 0;
	}
}

