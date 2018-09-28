package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			int[] a = new int[10];
			int j;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j <= a[0];j++)
			{
				a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			if (a[0] == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= a[0];j++)
				{
					if (a[j] + 3 * j >= 60 && a[j] + 3 * j <= 63)
					{
						System.out.print(a[j]);
						System.out.print("\n");
						break;
					}
					else
					{
						if (a[j] + 3 * j > 63)
						{
							System.out.print(63 - 3 * j);
							System.out.print("\n");
							break;
						}
					}
				}
				if (j == a[0] + 1)
				{
					System.out.print(60 - 3 * a[0]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

