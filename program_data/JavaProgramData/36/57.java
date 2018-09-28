package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String flaga = new String(new char[100]);
		String flagb = new String(new char[100]);
		char bool1 = 1;
		char bool2 = 1;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int i,j;
		int i;
		int j;
		for (i = 0;i < 100;i++)
		{
			flaga = flaga.substring(0, i);
			flagb = flagb.substring(0, i);
		}
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
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			for (j = 0;b.charAt(j) != '\0';j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
				flaga = tangible.StringFunctions.changeCharacter(flaga, i, 1);
				flagb = tangible.StringFunctions.changeCharacter(flagb, j, 1);
				}
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (flaga.charAt(i) == 0)
			{
				bool1 = 0;
			}
		}
		for (i = 0;i < b.length();i++)
		{
			if (flaga.charAt(i) == 0)
			{
				bool2 = 0;
			}
		}
		if (bool1 && bool2)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}
		return 0;
	}
}

