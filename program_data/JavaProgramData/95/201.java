package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i = 0;
		int s;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		while (a.charAt(i) != '\0' && b.charAt(i) != '\0')
		{
			if (a.charAt(i) < 65 || a.charAt(i)>90 && a.charAt(i) < 97 || a.charAt(i)>122)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i));
			}
			else
			{
				if (a.charAt(i) <= 90)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
				}
			}
			if (b.charAt(i) < 65 || b.charAt(i)>90 && b.charAt(i) < 97 || b.charAt(i)>122)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i));
			}
			else
			{
				if (b.charAt(i) <= 90)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
				}
			}
			i = i + 1;
		}
		s = strcmp(a,b);
		if (s < 0)
		{
			System.out.print("<\n");
		}
		if (s == 0)
		{
			System.out.print("=\n");
		}
		if (s > 0)
		{
			System.out.print(">\n");
		}
		return 0;
	}
}

