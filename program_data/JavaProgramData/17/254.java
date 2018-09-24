package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int l;
		int i;
		int j;
		int d;
		while (true)
		{
			str = new Scanner(System.in).nextLine();
			if (str.charAt(0) == '\0')
			{
				break;
			}
			System.out.println(str);
			l = str.length();
			for (i = 0; i < l; i++)
			{
				if (str.charAt(i) == ' ')
				{
					continue;
				}
				if (str.charAt(i) != '(' && str.charAt(i) != ')')
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
				else if (str.charAt(i) == '(')
				{
					d = 1;
					for (j = i + 1; j < l; j++)
					{
						if (str.charAt(j) == '(')
						{
							d++;
						}
						if (str.charAt(j) == ')')
						{
							d--;
						}
						if (d == 0)
						{
							str = tangible.StringFunctions.changeCharacter(str, i, ' ');
							str = tangible.StringFunctions.changeCharacter(str, j, ' ');
							break;
						}
					}
				}
			}
			for (i = 0; i < l; i++)
			{
				if (str.charAt(i) == '(')
				{
					System.out.print("$");
				}
				else if (str.charAt(i) == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.printf("%c", str.charAt(i));
				}
			}
			System.out.print("\n");
			for (i = 0; i < l; i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			}
		}
		return 0;
	}

}

