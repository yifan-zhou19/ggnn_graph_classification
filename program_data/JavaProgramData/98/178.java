package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		char[][] word = new char[500][81];
		char[][] text = new char[500][81];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 80;word[n - 1][i] == 0;i--)
		{
			;
		}
		for (;word[n - 1][i] == ' ';i--)
		{
			word[n - 1][i] = 0;
		}

		for (i = 0;i < 500;i++)
		{
			for (j = 0;j < 81;j++)
			{
				text[i][j] = 0;
			}
		}
		len = 0;
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (String.valueOf(word[i]).length() + len <= 80)
			{
				len += String.valueOf(word[i]).length();
				text[j] += word[i];
				if (len < 80 && i < n - 1)
				{
					text[j][len] = ' ';
					len += 1;
				}
			}
			else
			{
				if (text[j][len - 1] == ' ')
				{
				text[j][len - 1] = 0;
				}
				j++;
				len = 0;
				i = i - 1;
			}
		}

		for (i = 0;text[i][0] != 0;i++)
		{
			System.out.print(text[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

