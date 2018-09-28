package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String sr = new String(new char[101]);
		String sc = new String(new char[101]);
		sr = new Scanner(System.in).nextLine();

		for (i = 0,j = 0;sr.charAt(i) != '\0';i++)
		{
			if (sr.charAt(i) == ' ' && sr.charAt(i + 1) == ' ')
			{
				continue;
			}
			else
			{
				sc = tangible.StringFunctions.changeCharacter(sc, j, sr.charAt(i));
				j++;
			}
		}
		sc = tangible.StringFunctions.changeCharacter(sc, j, '\0');

		System.out.println(sc);



		return 0;

	}
}

