package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		String b = new String(new char[100]);
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) <= 'Z' && a.charAt(i) >= 'A')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) <= 'Z' && b.charAt(i) >= 'A')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		k = strcmp(a,b);
		if (k > 0)
		{
			System.out.printf("%c",'>');
		}
		if (k < 0)
		{
			System.out.printf("%c",'<');
		}
		if (k == 0)
		{
			System.out.printf("%c",'=');
		}
		return 0;
	}
}

