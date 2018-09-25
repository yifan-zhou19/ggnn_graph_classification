package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[120][120];
		String mark = new String(new char[120]);
		String p = new String(new char[120]);
		int t = 0;
		int n = 0;

		while (gets(c[n]))
		{
			t = 0;
			if (c[n][0] == '\n')
			{
				break;
			}
			for (int i = 0;i < String.valueOf(c[n]).length();i++)
			{
				if (c[n][i] == '(')
				{
					mark = tangible.StringFunctions.changeCharacter(mark, i, '$');
					p = tangible.StringFunctions.changeCharacter(p, t, i);
					t++;
				}
				else if (c[n][i] == ')')
				{
					if (t == 0)
					{
						mark = tangible.StringFunctions.changeCharacter(mark, i, '?');
					}
					else
					{
						mark = tangible.StringFunctions.changeCharacter(mark, p.charAt(t - 1), ' ');
						mark = tangible.StringFunctions.changeCharacter(mark, i, ' ');
						t--;
					}

				}
				else
				{
					mark = tangible.StringFunctions.changeCharacter(mark, i, ' ');
				}
			}
			System.out.println(c[n]);

			for (int i = 0;i < String.valueOf(c[n]).length();i++)
			{
				System.out.print(mark.charAt(i));
			}
			System.out.print("\n");
			n++;
		}

		return 0;
	}

}

