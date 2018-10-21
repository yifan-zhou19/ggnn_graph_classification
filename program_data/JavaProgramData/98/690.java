package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int count = 0;
		char[][] word = new char[1000][40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		System.out.print(word[0]);
		count = count + String.valueOf(word[0]).length() + 1;
		for (i = 1 ; i < n; i++)
		{
			if (count + String.valueOf(word[i]).length() > 80)
			{
				System.out.print("\n");
				count = String.valueOf(word[i]).length() + 1;
				System.out.print(word[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(word[i]);
				count = count + String.valueOf(word[i]).length() + 1;
			}
		}
		return 0;
	}
}

