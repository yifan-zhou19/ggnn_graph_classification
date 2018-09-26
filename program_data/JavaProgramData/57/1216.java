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
	String a = new String(new char[50]);
	for (int i = 0;i <= n;i++)
	{
	a = new Scanner(System.in).nextLine();
	if ((a.charAt(a.length() - 1) == 'r') || (a.charAt(a.length() - 1) == 'y'))
	{
	a = tangible.StringFunctions.changeCharacter(a, a.length() - 2, '\0');
	System.out.println(a);
	}
	else if (a.charAt(a.length() - 1) == 'g')
	{
	a = tangible.StringFunctions.changeCharacter(a, a.length() - 3, '\0');
	System.out.println(a);
	}
	}
	return 0;
	}
}

