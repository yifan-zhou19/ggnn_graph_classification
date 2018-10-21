package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] time = new int[100];
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					time[j] = a[j] + 3 * j;
				}
				for (j = m - 1;j >= 0;j--)
				{
					if (time[j] <= 57)
					{
						System.out.print(a[j] + 57 - time[j]);
						System.out.print("\n");
						break;
					}
					else
					{
						if (time[j] <= 60)
						{
							System.out.print(a[j]);
							System.out.print("\n");
							break;
						}
					}
				}
			}
		}

		return 0;
	}
}

