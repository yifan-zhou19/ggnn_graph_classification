package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int[] fail = new int[60];

			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

			while (n-- != 0)
			{
					int m;
					int i;
					m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					for (i = 0;i < m;i++)
					{
							fail[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					}

					int count;

					if (m == 0)
					{
							System.out.print(60);
							System.out.print("\n");
							continue;
					}
					for (i = 0;i < m;i++)
					{
							if (fail[i] + 3 * i >= 60)
							{
									System.out.print(60 - 3 * i);
									System.out.print("\n");
									break;
							}
							if (fail[i] + 3 * (i + 1) > 60)
							{
									System.out.print(fail[i]);
									System.out.print("\n");
									break;
							}
					}

					if (i == m)
					{
							System.out.print(60 - 3 * m);
							System.out.print("\n");
					}
			}
			return 0;
	}
}

