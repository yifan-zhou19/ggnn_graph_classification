package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[256]);
	int n;
	int i;
	int j;
	a = new Scanner(System.in).nextLine();
	n = Integer.parseInt(a);
	for (i = 0;i < n;i++)
	{
	a = new Scanner(System.in).nextLine();
	for (j = 0;a.charAt(j) != '\0';j++)
	{
	if (a.charAt(j) == 'A')
	{
	a = tangible.StringFunctions.changeCharacter(a, j, 'T');
	}
	else if (a.charAt(j) == 'C')
	{
	a = tangible.StringFunctions.changeCharacter(a, j, 'G');
	}
	else if (a.charAt(j) == 'G')
	{
	a = tangible.StringFunctions.changeCharacter(a, j, 'C');
	}
	else if (a.charAt(j) == 'T')
	{
	a = tangible.StringFunctions.changeCharacter(a, j, 'A');
	}
	}
	System.out.println(a);
	}
	return 0;
	}

}

