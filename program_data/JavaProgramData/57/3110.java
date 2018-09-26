package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int l;
	String s1 = new String(new char[34]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s1 = tempVar2.charAt(0);
	}
	l = s1.length();
	for (int j = 0;j < l;j++)
	{
	if (((s1.charAt(l - 1) == 'r') && (s1.charAt(l - 2) == 'e')) || ((s1.charAt(l - 1) == 'y') && (s1.charAt(l - 2) == 'l')))
	{
	s1 = tangible.StringFunctions.changeCharacter(s1, l - 1, '\0');
	s1 = tangible.StringFunctions.changeCharacter(s1, l - 2, '\0');
	}
	else if (((s1.charAt(l - 1) == 'g') && (s1.charAt(l - 2) == 'n') && (s1.charAt(l - 3) == 'i')))
	{
	s1 = tangible.StringFunctions.changeCharacter(s1, l - 1, '\0');
	s1 = tangible.StringFunctions.changeCharacter(s1, l - 2, '\0');
	s1 = tangible.StringFunctions.changeCharacter(s1, l - 3, '\0');
	}
	}
	System.out.printf("%s\n",s1);
	}
	return 0;
	}
}

