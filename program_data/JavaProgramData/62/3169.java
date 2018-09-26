package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
	String zf = new String(new char[110]);
	String sz = new String(new char[110]);
	zf = new Scanner(System.in).nextLine();
	int l = zf.length();
	zf = tangible.StringFunctions.changeCharacter(zf, l, ' ');
	zf = tangible.StringFunctions.changeCharacter(zf, l + 1, '\0');
	for (i = 0,j = 0;i < l;i++)
	{
		if ((zf.charAt(i) == ' ') && (zf.charAt(i + 1) == ' '))
		{
			continue;
		}
	sz = tangible.StringFunctions.changeCharacter(sz, j, zf.charAt(i));
	j++;
	}
	sz = tangible.StringFunctions.changeCharacter(sz, j, '\0');
	 System.out.println(sz);
	return 0;
	}


}

