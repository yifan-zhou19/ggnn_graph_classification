package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int len;
		int n;
		String str = new String(new char[256]);
		String str2 = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			len = str.length();
			for (i = 0;i < len;i++)
			{
				if (str.charAt(i) == 'A')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, 'T');
				}
				if (str.charAt(i) == 'T')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, 'A');
				}
				if (str.charAt(i) == 'C')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, 'G');
				}
				if (str.charAt(i) == 'G')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, 'C');
				}
			}
			str2 = tangible.StringFunctions.changeCharacter(str2, len, '\0');
			System.out.printf("%s\n",str2);

			n--;
		}

	}


}

