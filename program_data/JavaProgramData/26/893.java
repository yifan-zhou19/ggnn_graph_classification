package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[101]);
	String b = new String(new char[101]);
	int c;
	int d = 0;
	int i;
	int j = 0;
	a = new Scanner(System.in).nextLine();
	c = a.length();
	for (i = 0;i < 101;i++)
	{
		b = b.substring(0, i);
	}
	if (a.charAt(0) != ' ')
	{
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
	j++;
	}
	for (i = 1;i < c;i++)
	{
		if (a.charAt(i) != ' ' || a.charAt(i) == ' ' && a.charAt(i - 1) != ' ')
		{
		b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(i));
	j++;
		}
	}
	for (i = 0;i < 101;i++)
	{
		if (b.charAt(i) != 0)
		{
	System.out.printf("%c",b.charAt(i));
		}
	}

	return 0;
	}


}

