package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int x;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				for (i = 0;i < x;i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i - 1] + 3 * i > 60)
					{
						continue;
					}
					else if (a[i] + 3 * i > 60)
					{
						System.out.print(60 - 3 * i);
						System.out.print("\n");
					}
					else if (a[i] + 3 * (i + 1) > 60)
					{
						System.out.print(a[i]);
						System.out.print("\n");
					}
					else if (i == x - 1)
					{
						System.out.print(60 - 3 * (i + 1));
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

