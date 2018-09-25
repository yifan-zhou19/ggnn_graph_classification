package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[1000]);
	public static void right(int i,int j) //i????????
	{
		if (s.charAt(i) == '\0')
		{
			;
		}
		else if (s.charAt(i) == '(')
		{
			s = tangible.StringFunctions.changeCharacter(s, i, '$');
			right(i + 1, j + 1);
		}
		else if (s.charAt(i) == ')')
		{
			if (j == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '?');
				right(i + 1, j);
			}
			else
			{
				for (int k = i;;k--)
				{
				if (s.charAt(k) == '$')
				{
					s = tangible.StringFunctions.changeCharacter(s, k, ' ');
					break;
				}
				}
				s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				right(i + 1, j - 1);
			}
		}
		else
		{
			s = tangible.StringFunctions.changeCharacter(s, i, ' ');
			right(i + 1, j);
		}
	}
	public static int Main()
	{
		for ((s; = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			System.out.print(s);
			System.out.print("\n");
			right(0, 0);
			System.out.print(s);
			System.out.print("\n");
		}
	}
}

