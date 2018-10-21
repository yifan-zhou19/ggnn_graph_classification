package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[256]);
	String b = new String(new char[256]);
	int l;
	int j = 0;
	int n;
	int k;
	int i;
	int s = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n + 1;i++)
	{
	a = new Scanner(System.in).nextLine();
	l = a.length();
	for (j = 0;j <= l - 1;j++)
	{
	if (a.charAt(j) == 'A')
	{
		b = tangible.StringFunctions.changeCharacter(b, j, 'T');
	}
	else if (a.charAt(j) == 'T')
	{
		b = tangible.StringFunctions.changeCharacter(b, j, 'A');
	}
	else if (a.charAt(j) == 'C')
	{
		b = tangible.StringFunctions.changeCharacter(b, j, 'G');
	}
	else if (a.charAt(j) == 'G')
	{
		b = tangible.StringFunctions.changeCharacter(b, j, 'C');
	}
	}
	for (s = 0;s < l - 1;s++)
	{
	System.out.printf("%c",b.charAt(s));
	}
	System.out.printf("%c\n",b.charAt(l - 1));
	}
	return 0;
	}
}

