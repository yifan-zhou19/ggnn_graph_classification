package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int l;
		String a = new String(new char[101]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = a.length();
		for (i = 0; i < l; i++)
		{
			if (a.charAt(i) == a.charAt(l - 1))
			{
				for (j = i - 1; j >= 0; j--)
				{
					if (a.charAt(j) == a.charAt(0))
					{
						System.out.print(j);
						System.out.print(" ");
						System.out.print(i);
						System.out.print("\n");
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(l - 1));
						break;
					}
				}
			}
		}

	return 0;
	}
}

