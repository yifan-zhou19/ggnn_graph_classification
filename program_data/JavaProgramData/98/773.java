package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] word = new char[1000][41];
		int temp = 0;
		for (i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0; i < n - 1; i++)
		{
			if (temp + String.valueOf(word[i]).length() + String.valueOf(word[i + 1]).length() + 1 <= 80)
			{
				System.out.print(word[i]);
				System.out.print(' ');
				temp = temp + String.valueOf(word[i]).length() + 1;
			}
			else
			{
				System.out.print(word[i]);
				System.out.print("\n");
				temp = 0;
			}
		}
		System.out.print(word[n - 1]);
		return 0;
	}
}

