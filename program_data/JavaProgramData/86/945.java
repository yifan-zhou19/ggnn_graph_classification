package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int t;
		int[] a = new int[20];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				for (j = 0; j < m; j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (j = 0; j < m; j++)
				{
					t = a[j] + 3 * (j + 1);
					if (t > 60 && t < 63)
					{
						System.out.print(a[j]);
						System.out.print("\n");
						break;
					}
					else
					{
						if (t >= 63)
						{
							System.out.print(60 - 3 * j);
							System.out.print("\n");
							break;
						}
						else
						{
							continue;
						}
					}
					if (t > 60)
					{
						break;
					}
				}
				if (j == m)
				{
					System.out.print(60 - 3 * m);
					System.out.print("\n");
				}
		}
		return 0;
	}

}

