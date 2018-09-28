package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		String a = new String(new char[81]);
		String b = new String(new char[81]);
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	for (i = 0;a.charAt(i);i++)
	{
		if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A'+'a');
		}
	}
	for (i = 0;b.charAt(i);i++)
	{

		if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'A'+'a');
		}
	}

	k = strcmp(a,b);
	if (k > 0)
	{
		System.out.print(">");
	}
	else if (k < 0)
	{

		System.out.print("<");
	}
	else
	{
		System.out.print("=");

	}
	return 0;
	}

}

