package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[100]);
		char n;
		char m;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = a.charAt(0);
		for (i = 1; i < a.length(); i++)
		{
			if (a.charAt(i) != n)
			{
					m = a.charAt(i);
					break;
			}
		}
		for (i = 1; i < a.length(); i++)
		{
			if (a.charAt(i) == m)
			{
					for (j = i - 1; j >= 0; j--)
					{
						if (a.charAt(j) == n)
						{
								System.out.print(j);
								System.out.print(' ');
								System.out.print(i);
								System.out.print("\n");
								a = tangible.StringFunctions.changeCharacter(a, j, ' ');
								break;
						}
					}
			}
		}

		return 0;
	}
}

