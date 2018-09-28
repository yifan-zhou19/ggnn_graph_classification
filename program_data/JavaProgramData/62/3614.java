package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String juzi = new String(new char[200]);
		int i;
		int j;
		int m;
		juzi = new Scanner(System.in).nextLine();
		m = juzi.length();
		for (i = 1;i < m - 1;i++)
		{
			if (juzi.charAt(i - 1) != ' ' && juzi.charAt(i) == ' ' && juzi.charAt(i + 1) == ' ')
			{
				for (j = i + 1;j < m - 1;j++)
				{
					juzi = tangible.StringFunctions.changeCharacter(juzi, j, juzi.charAt(j + 1));
				}
				m = m - 1;
				juzi = tangible.StringFunctions.changeCharacter(juzi, m, '\0');
				i = i - 1;
			}
		}
		System.out.printf("%s",juzi);
		return 0;
	}



}

