package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[50][101];
		String input = new String(new char[5001]);
		int num = 0;
		input = new Scanner(System.in).nextLine();
		int len = input.length();
		for (int i = 0; i < len; i++)
		{
			int j = 0;
			while (i < len && ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')))
			{
				word[num][j] = input.charAt(i);
				j++;
				i++;
			}
			if (j > 0)
			{
				word[num][j] = '\0';
				num++;
			}
		}
		int max_len = String.valueOf(word[0]).length();
		int min_len = max_len;
		int max_index = 0;
		int min_index = 0;
		for (int i = 1; i < num; i++)
		{
			if (max_len < String.valueOf(word[i]).length())
			{
				max_index = i;
				max_len = String.valueOf(word[i]).length();
			}
			if (min_len > String.valueOf(word[i]).length())
			{
				min_index = i;
				min_len = String.valueOf(word[i]).length();
			}
		}
		System.out.printf("%s\n%s\n", word[max_index], word[min_index]);
	}
}
