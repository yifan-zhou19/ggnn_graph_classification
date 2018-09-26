package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zf = new String(new char[202]);
		String nzf = new String(new char[202]);
	int haha = 0;
	zf = new Scanner(System.in).nextLine();
	int ct = 0;

	for (int i1 = 0;zf.charAt(i1) != '\0';i1++)
	{
		if (zf.charAt(i1) == ' ')
		{
			for (int i2 = i1 + 1;zf.charAt(i2) == 32;i2++)
			{
				i1++;
			}

		}
		nzf = tangible.StringFunctions.changeCharacter(nzf, ct, zf.charAt(i1));

		ct++;

	}
	nzf = tangible.StringFunctions.changeCharacter(nzf, ct, '\0');
	System.out.printf("%s",nzf);
		return 0;
	}



}

