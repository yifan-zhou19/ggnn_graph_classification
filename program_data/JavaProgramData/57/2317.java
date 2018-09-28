package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int len;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[1000]);
		for (i = 1 ; i <= n ; i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len = a.length();
			j = 0;
			do
			{
				if (a.charAt(j) == 'e' && a.charAt(j + 1) == 'r' && a.charAt(j + 2) == '\0')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '\0');
					a = tangible.StringFunctions.changeCharacter(a, j + 1, '\0');
				}
				j++;
			}while (j < len);
			j = 0;
			do
			{
				if (a.charAt(j) == 'l' && a.charAt(j + 1) == 'y' && a.charAt(j + 2) == '\0')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '\0');
					a = tangible.StringFunctions.changeCharacter(a, j + 1, '\0');
				}
				j++;
			}while (j < len);
			j = 0;
			do
			{
				if (a.charAt(j) == 'i' && a.charAt(j + 1) == 'n' && a.charAt(j + 2) == 'g' && a.charAt(j + 3) == '\0')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '\0');
					a = tangible.StringFunctions.changeCharacter(a, j + 1, '\0');
					a = tangible.StringFunctions.changeCharacter(a, j + 2, '\0');
				}
				j++;
			}while (j < len);
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}

}

