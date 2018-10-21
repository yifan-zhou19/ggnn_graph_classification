package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		int j;
		String sz = new String(new char[400]);
		sz = new Scanner(System.in).nextLine();
		len = sz.length();
		for (i = 0;i < len;i++)
		{
			if (sz.charAt(i) == ' ')
			{
				if (sz.charAt(i + 1) == ' ')
				{
					for (j = i + 1;j < len;j++)
					{
					   sz = tangible.StringFunctions.changeCharacter(sz, j - 1, sz.charAt(j));
					}
					sz = tangible.StringFunctions.changeCharacter(sz, len - 1, '\0');
					len--;
				}
				if (sz.charAt(i + 1) == ' ')
				{
				   i--;
				}
			}
		}
		System.out.printf("%s",sz);


	return 0;
	}
}

