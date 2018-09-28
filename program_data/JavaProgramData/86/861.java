package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int m;
			int[] a = new int[20];
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else if (m != 0)
			{
			for (int k = 0 ; k < m ; k++)
			{
				a[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			for (int j = m ; j >= 1 ; j--)
			{
				if ((a[j - 1] + 3 * j) >= 63)
				{
					continue;
				}
				else if ((a[j - 1] + 3 * j) <= 60)
				{
					System.out.print((60 - 3 * j));
					System.out.print("\n");
					break;
				}
				else
				{
					System.out.print(a[j - 1]);
					System.out.print("\n");
					break;
				}
			}
			}
		}
		return 0;
	}
}

