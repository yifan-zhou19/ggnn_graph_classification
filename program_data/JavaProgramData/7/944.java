package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[256]);
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int i = 0;
	int z = 0;
	int c = 0;
	int d;
	int j;
	int f;
	int e;
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	c = a.length();
	e = s.length();
	while (i < e)
	{
	if (s.charAt(i) == a.charAt(z))
	{
	f = 0;
	for (d = i;d < i + c;d++)
	{
	if (s.charAt(d) == a.charAt(z))
	{
		f++;
	z++;
	}
	}
	if (f == c)
	{
	z = 0;
	for (d = i;d < i + c;d++)
	{
	s = tangible.StringFunctions.changeCharacter(s, d, b.charAt(z));
	z++;
	}
	break;
	}
	else
	{
	z = 0;
	}
	}
	i++;
	}
	for (i = 0;i < e;i++)
	{
	System.out.printf("%c",s.charAt(i));
	}
	return 0;
	}

}

