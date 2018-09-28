package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String a = new String(new char[300]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == 'A')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'T');
				}
				else if (a.charAt(j) == 'T')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'A');
				}
				else if (a.charAt(j) == 'C')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'G');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, 'C');
				}
			}
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	}

}

