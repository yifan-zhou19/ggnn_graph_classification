package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[1000][20];
		int n;
		int i;
		int j;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		String p = word;
		for (i = 0;i < n;i++)
		{
			sum = sum + String.valueOf(*(p.Substring(i))).length();
			if (sum <= 80)
			{
				System.out.print((p.Substring(i)));
				if ((sum + String.valueOf(*(p.Substring(i) + 1)).length() + 1) <= 80 && i != n - 1)
				{
					sum++;
					System.out.print(' ');
				}
				else
				{
					System.out.print("\n");
					sum = 0;
				}

			}
			else
			{
				System.out.print("\n");
				System.out.print((p.Substring(i)));
				sum = String.valueOf(*(p.Substring(i))).length();
			}

		}
		return 0;
	}
}

