package <missing>;

public class GlobalMembers
{
	public static void Match(int input_len)
	{
		int cur_left = -1;
		int cur_right = -1;
		for (int i = 0;i <= input_len - 1;i++)
		{
			if (input.charAt(i) == '(')
			{
				cur_left = i;
				continue;
			}
			if (input.charAt(i) == ')')
			{
				if (cur_left != -1)
				{
					input = tangible.StringFunctions.changeCharacter(input, cur_left, ' ');
					input = tangible.StringFunctions.changeCharacter(input, i, ' ');
					cur_left = -1;
					i = -1;
					continue;
				}
			}
		}
	}
	public static String input = new String(new char[128]);
	public static String tmp_input = new String(new char[128]);
	public static int Main()
	{
		//freopen("test.txt","r",stdin);
		while (scanf("%s",input) != EOF)
		{
			tmp_input = input;
			int input_len = input.length();
			Match(input_len);
			for (int i = 0;i <= input_len - 1;i++)
			{
				if (input.charAt(i) == '(')
				{
					input = tangible.StringFunctions.changeCharacter(input, i, '$');
				}
				else if (input.charAt(i) == ')')
				{
					input = tangible.StringFunctions.changeCharacter(input, i, '?');
				}
				else
				{
					input = tangible.StringFunctions.changeCharacter(input, i, ' ');
				}
			}
			System.out.printf("%s\n",tmp_input);
			System.out.printf("%s\n",input);
		}
		return 0;
	}
}

