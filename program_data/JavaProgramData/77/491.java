package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = 0;i < a.length() - 1;i++)
		{
			if (a.charAt(i) == ' ')
			{
				continue;
			}
			else if (a.charAt(i + 1) == ' ')
			{
				int j;
				for (j = 1;a.charAt(i + j) == ' ';j++)
				{
				}
				if (a.charAt(i) != a.charAt(i + j))
				{
					System.out.print(i);
					System.out.print(' ');
					System.out.print(i + j);
					System.out.print("\n");
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
					a = tangible.StringFunctions.changeCharacter(a, i + j, ' ');
					i = 0;
				}
			}
			else if (a.charAt(i) != a.charAt(i + 1))
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(i + 1);
				System.out.print("\n");
				a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				a = tangible.StringFunctions.changeCharacter(a, i + 1, ' ');
				i = 0;
			}
		}
		System.out.print(0);
		System.out.print(' ');
		System.out.print(a.length() - 1);
		System.out.print("\n");
		return 0;
	}
}

