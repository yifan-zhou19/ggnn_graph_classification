package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String nstr = new String(new char[15]);
		char maxchar = '\0';
		int i;
		int j;
		int len;
		int max = 0;
		while (true)
		{
			maxchar = '\0';
			if ((str[0] = System.in.read()) == EOF)
			{
				System.exit(-1);
			}
			str = tangible.StringFunctions.changeCharacter(str, 1, new Scanner(System.in).nextLine());
			len = str.length();
			for (i = len - 5;i >= 0;i--)
			{
				if (str.charAt(i) >= maxchar)
				{
					max = i;
					maxchar = str.charAt(i);
				}
			}
			for (i = 0;i <= max;i++)
			{
				nstr = tangible.StringFunctions.changeCharacter(nstr, i, str.charAt(i));
			}
			for (i = max + 1;i < len - 4;i++)
			{
				nstr = tangible.StringFunctions.changeCharacter(nstr, i + 3, str.charAt(i));
			}
			for (i = len - 3,j = 1;i < len;i++,j++)
			{
				nstr = tangible.StringFunctions.changeCharacter(nstr, max + j, str.charAt(i));
			}
			nstr = tangible.StringFunctions.changeCharacter(nstr, len - 1, '\0');
			System.out.printf("%s\n",nstr);
		}
	}

}

