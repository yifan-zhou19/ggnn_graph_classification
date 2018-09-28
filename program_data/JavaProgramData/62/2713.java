package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int m;
	int n;
	String cc = new String(new char[1000]);
	final String an = "0";
	cc = new Scanner(System.in).nextLine();
	m = cc.length();
	b = 1;
	an = tangible.StringFunctions.changeCharacter(an, 0, cc.charAt(0));
	for (a = 1;a <= m;a++)
	{
		if ((cc.charAt(a) != ' ') || (cc.charAt(a) == ' ' && cc.charAt(a - 1) != ' '))
		{
		an = tangible.StringFunctions.changeCharacter(an, b, cc.charAt(a));
		b++;
		}
	}
	System.out.printf("%s",an);
	return 0;
	}

}

