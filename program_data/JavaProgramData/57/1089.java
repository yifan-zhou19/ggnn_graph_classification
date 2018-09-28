package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j = 0;
	int k;
	String s = new String(new char[1000]);
	String z = new String(new char[1000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		s = tempVar2.charAt(0);
	}
	for (j = 0;s.charAt(j) != '\0';j++)
	{
	z = tangible.StringFunctions.changeCharacter(z, j, s.charAt(j));
	if (s.charAt(j + 3) == '\0' && s.charAt(j) == 'i')
	{
	z = tangible.StringFunctions.changeCharacter(z, j, '\0');
	}
	if (s.charAt(j + 2) == '\0' && s.charAt(j) == 'e' && s.charAt(j + 1) == 'r')
	{
	z = tangible.StringFunctions.changeCharacter(z, j, '\0');
	}
	if (s.charAt(j + 2) == '\0' && s.charAt(j) == 'l' && s.charAt(j + 1) == 'y')
	{
	z = tangible.StringFunctions.changeCharacter(z, j, '\0');
	}
	}
	System.out.printf("%s\n",z);
	}
	return 0;
	}
}

