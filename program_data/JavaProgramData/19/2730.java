package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i=0,j=0;
		int i = 0;
		int j = 0;
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String tmp = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) != ' ')
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, j, s.charAt(i));
				j++;
			}
			else
			{
				tmp = tangible.StringFunctions.changeCharacter(tmp, j, '\0');
				j = 0;
				if (strcmp(tmp,a) == 0)
				{
					System.out.printf("%s ",b);
				}
				else
				{
					System.out.printf("%s ",tmp);
				}
			}
		}
		tmp = tangible.StringFunctions.changeCharacter(tmp, j, '\0');
		if (strcmp(tmp,a) == 0)
		{
			System.out.printf("%s\n",b);
		}
		else
		{
			System.out.printf("%s\n",tmp);
		}
		return 0;
	}
}

