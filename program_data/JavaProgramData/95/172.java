package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char t;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != 0 && b.charAt(i) != 0;i++)
		{
			if (a.charAt(i) > 'A' && a.charAt(i) < 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A'+'a');
			}
			if (b.charAt(i) > 'A' && b.charAt(i) < 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'A'+'a');
			}
		}
		n = strcmp(a,b);
		if (n > 0)
		{
			t = '>';
		}
		else if (n == 0)
		{
			t = '=';
		}
		else
		{
			t = '<';
		}
		System.out.printf("%c\n",t);
		return 0;
	}

}

