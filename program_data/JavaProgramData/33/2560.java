package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int j;
	int i = 0;
	int l;
	String z = new String(new char[256]);
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
		z = tempVar2.charAt(0);
	}
	l = z.length();
	for (j = 0;j < l;j++)
	{
		if (z.charAt(j) == 'A')
		{
			z = tangible.StringFunctions.changeCharacter(z, j, 'T');
		}
	else
	{
		if (z.charAt(j) == 'T')
		{
			z = tangible.StringFunctions.changeCharacter(z, j, 'A');
		}
	else
	{
		if (z.charAt(j) == 'C')
		{
			z = tangible.StringFunctions.changeCharacter(z, j, 'G');
		}
	else
	{
		z = tangible.StringFunctions.changeCharacter(z, j, 'C');
	}
	}
	}
	}
	System.out.printf("%s\n",z);
	}
	return 0;
	}

}

