package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int[] b = new int[100];
		int i;
		int j;
		int m;
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				b[i] = 60;
			}
			else
			{
			for (j = 0;j < m;j++)
			{
			   a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (j = 0;j < m;j++)
			{
				k = a[j] + 3 * j;
				if (k < 57 && j == m - 1)
				{
						b[i] = 60 - 3 * m;
						break;
				}
				else
				{
					if (k >= 57 && k <= 60)
					{
							b[i] = a[j];
							break;
					}
				else if (k > 60)
				{
								b[i] = 60 - 3 * j;
								break;
				}


				}

			}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}


		return 0;
	}
}

