package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count;
		int i;
		int j;
		int[] a = new int[100];

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			count = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (count == 0)
			{
				System.out.print("60");
				System.out.print("\n");
			}
			else
			{
				for (j = 1; j <= count; j++)
				{
					a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}

				j = 1;
				while (a[j] + 3 * (j - 1) <= 57 && j <= count)
				{
					j++;
				}

				if (a[j] + 3 * (j - 1) == 58 || a[j] + 3 * (j - 1) == 59 || a[j] + 3 * (j - 1) == 60)
				{
					System.out.print(a[j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(60 - 3 * (j - 1));
					System.out.print("\n");
				}
			}
		}

		return 0;
	}

}

