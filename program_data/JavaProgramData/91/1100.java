package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ori = new String(new char[num]);
		String change = new String(new char[num]);
		int m = 0;
		int i = 0;
		ori = new Scanner(System.in).nextLine();
		m = ori.length();
			for (i = 0;i < m;i++)
			{
				if (i < m - 1)
				{
					change = tangible.StringFunctions.changeCharacter(change, i, ori.charAt(i) + ori.charAt(i + 1));

				}
			else
			{
				change = tangible.StringFunctions.changeCharacter(change, i, ori.charAt(i) + ori.charAt(0));
			}

			}
		for (i = 0;i < m;i++)
		{
		System.out.printf("%c",change.charAt(i));
		}
	return 0;
	}
}

