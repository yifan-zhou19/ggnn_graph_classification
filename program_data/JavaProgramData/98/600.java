package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		int line = 0;
		int i;
		char[][] word = new char[1000][40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		word[0] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		line = String.valueOf(word[0]).length();
		System.out.print(word[0]);
		for (i = 1; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = String.valueOf(word[i]).length();
			line = line + l + 1;
			if (line <= 80)
			{
				System.out.print(' ');
				System.out.print(word[i]);
			}
			else
			{
				System.out.print("\n");
				System.out.print(word[i]);
				line = l;
			}
		}
		return 0;
	}

}

