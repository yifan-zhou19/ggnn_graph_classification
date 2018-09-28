package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int n;
		int m;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (k = m;k > 0;k--)
				{
					//cout <<a[m-k]<<" "<<m-k;
					if (57 <= a[m - k] + 3 * (m - k) && a[m - k] + 3 * (m - k) <= 60)
					{
						System.out.print(a[m - k]);
						System.out.print("\n");
						break;
					}
					else
					{
						if (a[m - k] + 3 * (m - k) > 60)
						{
							System.out.print(60 - 3 * (m - k));
							System.out.print("\n");
							break;
						}
						if (a[m - 1] + 3 * m < 60)
						{
							System.out.print(60 - 3 * m);
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

