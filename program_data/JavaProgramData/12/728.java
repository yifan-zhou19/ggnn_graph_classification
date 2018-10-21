package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int m = 1;
		int num = 0;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			num = 0;
			m = 1;
			if (a[0] == -1)
			{
				break;
			}
			else
			{
				for (i = 1; i < 16; i++, m++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i] == 0)
					{
						break;
					}
				}

				for (j = 0; j < m; j++)
				{
					for (k = 0; k < m; k++)
					{
						if (k == j)
						{
							continue;
						}
						if ((a[k] == 2 * a[j]) || (a[j] == 2 * a[k]))
						{
							num++;
						}
					}
				}

				System.out.print(num / 2);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

