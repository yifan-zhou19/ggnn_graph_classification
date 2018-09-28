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
	if (s.charAt(j) == 'A')
	{
	z = tangible.StringFunctions.changeCharacter(z, j, 'T');
	}
	if (s.charAt(j) == 'T')
	{
	z = tangible.StringFunctions.changeCharacter(z, j, 'A');
	}
	if (s.charAt(j) == 'C')
	{
	z = tangible.StringFunctions.changeCharacter(z, j, 'G');
	}
	if (s.charAt(j) == 'G')
	{
	z = tangible.StringFunctions.changeCharacter(z, j, 'C');
	}
	if (s.charAt(j + 1) == '\0')
	{
	z = tangible.StringFunctions.changeCharacter(z, j + 1, '\0');
	}
	}
	System.out.printf("%s\n",z);
	}
	return 0;
	}
}

