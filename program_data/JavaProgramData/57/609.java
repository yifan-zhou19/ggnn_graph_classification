package <missing>;

public class GlobalMembers
{
	public static char[][] word = new char[100][33];

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (int i = 0;i < n;i++)
		{
			int len = String.valueOf(word[i]).length();
			if (len > 2 && word[i][len - 2] == 'e' && word[i][len - 1] == 'r')
			{
				word[i][len - 2] = 0;
			}
			else if (len > 2 && word[i][len - 2] == 'l' && word[i][len - 1] == 'y')
			{
				word[i][len - 2] = 0;
			}
			else if (len > 3 && word[i][len - 3] == 'i' && word[i][len - 2] == 'n' && word[i][len - 1] == 'g')
			{
				word[i][len - 3] = 0;
			}
			System.out.print(word[i]);
			System.out.print("\n");
		}
	}
}

