package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] number =
		{
			{' ', '\0', '\0', '\0', '\0'}
		};
		char[][] authors =
		{
			{' ', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] author = new int[30];
		for (i = 0;i <= n - 1;i++)
		{
			number[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			authors[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int len1 = String.valueOf(authors[i]).length();

			for (j = 0;j <= len1 - 1;j++)
			{
				author[authors[i][j] - 'A']++;
			}
		}
		int k;
		int kmax = 0;
		int max = author[0];
		for (k = 1;k <= 25;k++)
		{
			if (author[k] > max)
			{
				max = author[k];
				kmax = k;
			}
		}
		char writer = kmax + 'A';
		System.out.print(writer);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= 25;j++)
			{
				if (authors[i][j] - 'A' == kmax)
				{
					System.out.print(number[i]);
					System.out.print("\n");
					break;
				}
			}
		}

		return 0;
	}
}

