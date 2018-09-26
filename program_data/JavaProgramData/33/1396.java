package <missing>;

public class GlobalMembers
{
	public static char pd(char x)
	{
	char y;
	if (x == 'A')
	{
		y = 'T';
	}
	if (x == 'T')
	{
		y = 'A';
	}
	if (x == 'C')
	{
		y = 'G';
	}
	if (x == 'G')
	{
		y = 'C';
	}
	return y;
	}
	public static int Main()
	{
	String a = new String(new char[256]);
	String b = new String(new char[256]);
	int i;
	int j;
	int l;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	l = a.length();
	for (j = 0;j < l;j++)
	{
	b = tangible.StringFunctions.changeCharacter(b, j, pd(a.charAt(j)));
	}
	b = b.substring(0, l);
	System.out.printf("%s\n",b);
	}
	return 0;
	}

}

