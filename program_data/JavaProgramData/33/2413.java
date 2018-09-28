package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	String a = new String(new char[256]);
	String N = new String(new char[1000]);
	N = new Scanner(System.in).nextLine();
	n = Integer.parseInt(N);
	for (j = 0;j < n;j++)
	{
	a = new Scanner(System.in).nextLine();
	int l = a.length();
	for (i = 0;i < l;i++)
	{
	if (a.charAt(i) == 'A')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, 'T');
	}
	else if (a.charAt(i) == 'T')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, 'A');
	}
	else if (a.charAt(i) == 'C')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, 'G');
	}
	else if (a.charAt(i) == 'G')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, 'C');
	}
	}
	System.out.println(a);
	}
	return 0;
	}
}

