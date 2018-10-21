package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		scanf("\n");

		while (n-- != 0)
		{
			String str = new String(new char[256]);
			String pair = new String(new char[256]);
			str = new Scanner(System.in).nextLine();
			int i;

			for (i = 0;i < str.length();i++)
			{
				switch (str.charAt(i))
				{
				case 'A':
					pair = tangible.StringFunctions.changeCharacter(pair, i, 'T');
					break;
				case 'T':
					pair = tangible.StringFunctions.changeCharacter(pair, i, 'A');
					break;
				case 'G':
					pair = tangible.StringFunctions.changeCharacter(pair, i, 'C');
					break;
				case 'C':
					pair = tangible.StringFunctions.changeCharacter(pair, i, 'G');
					break;
				}
			}
			pair = tangible.StringFunctions.changeCharacter(pair, i, '\0');
			System.out.println(pair);
		}

		return 0;
	}
}

