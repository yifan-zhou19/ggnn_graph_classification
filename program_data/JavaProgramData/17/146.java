package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] words = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		while ((words = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(words);
			System.out.print("\n");
			int i = 0;
			int j = 0;
			for (i = 0;words[i] != 0;i++)
			{
				if (words[i] != '(' && words[i] != ')')
				{
					words[i] = ' ';
				}
				if (words[i] == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (words[j] == '(')
						{
							words[j] = ' ';
							words[i] = ' ';
							break;
						}
					}
				}
			}
			for (i = 0;words[i] != 0;i++)
			{
				if (words[i] == '(')
				{
					words[i] = '$';
				}
				if (words[i] == ')')
				{
					words[i] = '?';
				}
			}
			System.out.print(words);
			System.out.print("\n");
		}
		return 0;
	}





}

