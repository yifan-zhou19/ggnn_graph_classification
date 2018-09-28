package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		int q;
		String ch = new String(new char[40]);
		String sh = new String(new char[40]);
		final String lolo = "\0";
		final String alei = "\0";
		lolo = new Scanner(System.in).nextLine();
		k = 0;
		m = 41;
		for (i = 0;lolo.charAt(i) != '\0';i++)
		{
			if (lolo.charAt(i) == ' ' || lolo.charAt(i) == ',')
			{
				i++;
			}
			for (j = 0;lolo.charAt(i) != ' ' && lolo.charAt(i) != ',' && lolo.charAt(i) != '\0';i++, j++)
			{
				alei = tangible.StringFunctions.changeCharacter(alei, j, lolo.charAt(i));
			}
			alei = tangible.StringFunctions.changeCharacter(alei, j, '\0');
			if (j > k)
			{
				ch = alei;
				k = j;
			}
			if (j < m)
			{
				sh = alei;
				m = j;
			}
		}
		System.out.printf("%s\n",ch);
		System.out.printf("%s\n",sh);

	}
}

