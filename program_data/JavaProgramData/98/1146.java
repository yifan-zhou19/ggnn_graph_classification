package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[1010][30];
		int i;
		int n;
		int len = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		System.out.print(word[0]);
		len = String.valueOf(word[0]).length() + 1;
		for (i = 1; i < n - 1; i++)
		{
			if (len + String.valueOf(word[i]).length() < 81)
			{
				if (len == 0)
				{
					System.out.print(word[i]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(word[i]);
				}
					len = len + String.valueOf(word[i]).length() + 1;
			}
			else if (len + String.valueOf(word[i]).length() > 80)
			{
				System.out.print("\n");
				len = 0;
				i = i - 1;
			}
		}
		System.out.print(" ");
		System.out.print(word[n - 1]);
		return 0;
	}

}

