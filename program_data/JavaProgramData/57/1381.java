package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String a = new String(new char[100]);
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = tempVar2.charAt(0);
	}
	int k = a.length();
	if (a.charAt(k - 2) == 'e' && a.charAt(k - 1) == 'r')
	{
	a = tangible.StringFunctions.changeCharacter(a, k - 2, '\0');
	}
	else if (a.charAt(k - 2) == 'l' && a.charAt(k - 1) == 'y')
	{
	a = tangible.StringFunctions.changeCharacter(a, k - 2, '\0');
	}
	else if (a.charAt(k - 3) == 'i' && a.charAt(k - 2) == 'n' && a.charAt(k - 1) == 'g')
	{
	a = tangible.StringFunctions.changeCharacter(a, k - 3, '\0');
	}
	System.out.printf("%s\n",a);
	}

	}
}

