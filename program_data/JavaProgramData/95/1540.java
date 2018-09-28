package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char d = '=';
	int i;
	int j;
	int k;
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	j = a.length();
	k = b.length();
	if (j > k)
	{
	j = k;
	}
	for (i = 0;i < j;i++)
	{
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
		}
	if (b.charAt(i) >= 'a' && b.charAt(i) <= 'z')
	{
	b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'a'+'A');
	}
	if (a.charAt(i) > b.charAt(i))
	{
		d = '>';
		break;
	}
	else if (a.charAt(i) < b.charAt(i))
	{
		d = '<';
		break;
	}
	}
	System.out.printf("%c",d);
	return 0;
	}
}

