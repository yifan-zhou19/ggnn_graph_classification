package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String a = "";
		final String b = "";
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() != b.length())
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto null_Renamed;
		}
		for (i = 0;i < a.length();i++)
		{
			for (j = 0;j < b.length();j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '0');
					break;
				}
			}
			if (j == b.length())
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto null_Renamed;
			}
		}
		System.out.print("YES\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		goto allright;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	null_Renamed:
	System.out.print("NO\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	allright:
	;
	}
}

