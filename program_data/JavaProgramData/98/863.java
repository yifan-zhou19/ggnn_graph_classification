package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] word = new char[n][81];
		char c;
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		int sum = String.valueOf(word[0]).length();
		System.out.print(word[0]);
		for (i = 1;i < n;i++)
		{
			if (sum + String.valueOf(word[i]).length() + 1 <= 80)
			{
				if (sum != -1)
				{
					System.out.print(' ');
				}
				System.out.print(word[i]);
				sum = sum + String.valueOf(word[i]).length() + 1;
			}
			else
			{
				System.out.print("\n");
				sum = -1;
				i--;
			}
		}
		return 0;
	}
}

