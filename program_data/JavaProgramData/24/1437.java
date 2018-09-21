package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int j;
		char[][] danci =
		{
			{'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		String zfc = new String(new char[3000]);
		zfc = new Scanner(System.in).nextLine();
		for (i = 0,k = 0,j = 0;zfc.charAt(i) != '\0';i++)
		{
			if (zfc.charAt(i) == ' ')
			{
				zfc = tangible.StringFunctions.changeCharacter(zfc, i, '\0');
				danci[j] = (zfc.Substring(k));
				k = i + 1;
				j++;
			}
		}
		danci[j] = (zfc.Substring(k));
		j++;
		String zuichang = new String(new char[100]);
		String zuiduan = new String(new char[100]);
		zuichang = danci[0];
		zuiduan = danci[0];
		for (i = 0;i < j - 1;i++)
		{
			if (zuichang.length() < String.valueOf(danci[i + 1]).length())
			{
				zuichang = danci[i + 1];
			}
			if (zuiduan.length() > String.valueOf(danci[i + 1]).length())
			{
				zuiduan = danci[i + 1];
			}
		}
		System.out.printf("%s\n",zuichang);
		System.out.printf("%s\n",zuiduan);
		return 0;
	}
}

