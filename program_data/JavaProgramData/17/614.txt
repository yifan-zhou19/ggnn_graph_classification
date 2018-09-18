package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			int l = a.length();
			for (int i = 0;i < l;i++)
			{
				if (a.charAt(i) == ')')
				{
					for (int j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, a[j] = ' ');
							break;
						}
					}
				}
				if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			for (int i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					System.out.print('$');
				}
				else if (a.charAt(i) == ')')
				{
					System.out.print('?');
				}
				else
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

