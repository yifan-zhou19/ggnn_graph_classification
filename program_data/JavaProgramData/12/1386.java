package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] ch = new int[16];
		int i;
		int j;
		int n;
		int m;

		ch[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		while (ch[0] != -1)
		{
			n = 0;

			for (i = 1; ch[i - 1] != 0; i++)
			{
				n++;

				ch[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			m = 0;

			for (i = 0; i < n; i++)
			{
				if (ch[i] % 2 == 1)
				{
					continue;
				}
				else
				{
					for (j = 0; j < n; j++)
					{
						if (ch[i] == 2 * ch[j])
						{
							m++;
						}
					}
				}
			}
			System.out.print(m);
			System.out.print("\n");

			ch[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		return 0;
	}

}

