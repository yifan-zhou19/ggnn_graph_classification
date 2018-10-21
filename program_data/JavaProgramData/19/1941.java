package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String part = new String(new char[100]);
		String full = new String(new char[1000]);
		String change = new String(new char[100]);
		String new = new String(new char[1000]);
		String diff2;
		full = new Scanner(System.in).nextLine();
		part = new Scanner(System.in).nextLine();
		change = new Scanner(System.in).nextLine();


		//chech which word
		int partlen = part.length();
		int fulllen = full.length();
		int which = 0;
		int end = fulllen - partlen;

		int i;
		int j;
		int yes;
			int start = 0;
			full = tangible.StringFunctions.changeCharacter(full, -1, ' ');
		for (i = 0; i <= end; i++)
		{
			yes = 1;
			for (j = 0; j < partlen; j++)
			{
				if (full.charAt(i + j) != part.charAt(j))
				{
					yes = 0;
				}
			}
			if (yes == 1 && full.charAt(i - 1) == ' ')
			{
				which = i;
				new = full;
				new = tangible.StringFunctions.changeCharacter(new, which, '\0');
				new += change;
				diff2 = full.charAt(which + partlen);
				new += diff2;
				full = new;
							i += change.length();
			}

		}

		System.out.printf("%s",full);

		return 0;
	}

}

