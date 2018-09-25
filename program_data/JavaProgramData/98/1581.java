package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[9999][50];
		int i;
		int j;
		int n;
		int len;
		int cnt = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0 ; i < n - 1 ; i++)
		{
			if (cnt + String.valueOf(word[i]).length() <= 80 && cnt + String.valueOf(word[i]).length() + 1 + String.valueOf(word[i + 1]).length() > 80)
			{
				System.out.print(word[i]);
				System.out.print("\n");
				cnt = 0;
			}
			else //(cnt + strlen(word[i]) + 1 <= 80 && cnt + strlen(word[i]) + 1 + strlen(word[i + 1]) + 1 <= 80)
			{
				System.out.print(word[i]);
				System.out.print(" ");
				cnt = cnt + String.valueOf(word[i]).length() + 1;
			}

		}
		System.out.print(word[n - 1]);
		return 0;
	}
}

