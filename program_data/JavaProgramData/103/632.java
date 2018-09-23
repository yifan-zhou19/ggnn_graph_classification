package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1001]);
	int n;
	int i;
	n = 1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}

	if ((a.charAt(0) > 96) && (a.charAt(0) < 123))
	{
	a = tangible.StringFunctions.changeCharacter(a, 0, a.charAt(0) - 32);
	}
	if (1 == a.length())
	{
	System.out.printf("(%c,%d)",a.charAt(0),n);
	}
	for (i = 1;i < a.length();i++)
	{
	if ((a.charAt(i) > 96) && (a.charAt(i) < 123))
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
	}
	if (a.charAt(i - 1) == a.charAt(i))
	{
	n = n + 1;
	}
	else
	{
	System.out.printf("(%c,%d)",a.charAt(i - 1),n);
	n = 1;

	}
	if (i == (a.length() - 1))
	{
	System.out.printf("(%c,%d)",a.charAt(i),n);
	}
	}

	return 0;
	}
}

