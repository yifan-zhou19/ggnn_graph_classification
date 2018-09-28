package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final int[] a1 = {1, 4, 4, 7, 2, 5, 7, 3, 6, 1, 4, 6};
		final int[] a2 = {1, 4, 5, 1, 3, 6, 1, 4, 7, 2, 5, 7};
		int n;
		int i;
		int year;
		int mon1;
		int mon2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mon2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
			{
				if (a1[mon1 - 1] == a1[mon2 - 1])
				{
					System.out.print("YES");
				}
				else
				{
					System.out.print("NO");
				}
			}
			else if (a2[mon1 - 1] == a2[mon2 - 1])
			{
				System.out.print("YES");
			}
				 else
				 {
					 System.out.print("NO");
				 }
			if (i < n - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}
}

