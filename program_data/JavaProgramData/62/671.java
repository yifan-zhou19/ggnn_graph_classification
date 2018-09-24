package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
	int n;
	int i = 0;
	int t;
	n = 0;
	a = new Scanner(System.in).nextLine();
	while (a.charAt(i) != '\0')
	{
		if (a.charAt(i) != 32 && t != 0)
		{
			t = 0;
		}
	if (a.charAt(i) == 32 && t != 0)
	{
		t++;
	}
	else
	{
		b = tangible.StringFunctions.changeCharacter(b, n, a.charAt(i));
	n++;
	if (a.charAt(i) == 32)
	{
		t++;
	}
	}
	i++;
	}
	b = tangible.StringFunctions.changeCharacter(b, n, '\0');
	System.out.printf("%s\n",b);
	return 0;
	}

}

