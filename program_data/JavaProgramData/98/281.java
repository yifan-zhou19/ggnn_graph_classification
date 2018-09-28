package <missing>;

public class GlobalMembers
{
	/*
	 *
	 * ??????
	 * ???2011-01-09
	 * ?????? 1000012774
	 * ???
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int[] len = new int[1000];
		char[][] a = new char[1000][40];
		char[][] b = new char[1000][40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(a[i]).length() + 1;
		}
		i = 0;
		while (i < n)
		{
			sum = 0;
			while ((sum + len[i]) <= 81)
			{
				sum = sum + len[i];
				if ((((sum + len[i + 1]) <= 81) + (i < n - 1) == 2))
				{
				System.out.print(a[i]);
				System.out.print(" ");
				}
				else
				{
					System.out.print(a[i]);
				}
				i++;
			}
			System.out.print("\n");

		}
		System.out.print("\n");
		return 0;
	}


}

