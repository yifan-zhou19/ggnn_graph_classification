package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int p;
	int n;
	int q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String a = new String(new char[256]);
		String b = new String(new char[256]);
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	p = a.length();
	for (q = 0;q < p;q++)
	{
		if (a.charAt(q) == 'A')
		{
		b = tangible.StringFunctions.changeCharacter(b, q, 'T');
		}
		else if (a.charAt(q) == 'T')
		{
		b = tangible.StringFunctions.changeCharacter(b, q, 'A');
		}
		else if (a.charAt(q) == 'G')
		{
		b = tangible.StringFunctions.changeCharacter(b, q, 'C');
		}
		else if (a.charAt(q) == 'C')
		{
		b = tangible.StringFunctions.changeCharacter(b, q, 'G');
		}
	}
	b = tangible.StringFunctions.changeCharacter(b, q, '\0');
	System.out.printf("%s\n",b);
	}
	return 0;
	}
}

