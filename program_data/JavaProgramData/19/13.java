package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int d;
		int e = -1;
		String f = new String(new char[100]);
		String g = new String(new char[100]);
		String h = new String(new char[100]);
		String i = new String(new char[100]);
		String j = new String(new char[100]);
		f = new Scanner(System.in).nextLine();
		g = new Scanner(System.in).nextLine();
		h = new Scanner(System.in).nextLine();
		f = tangible.StringFunctions.changeCharacter(f, -1, ' ');
		for (a = -1;a <= 100;)
		{
			i = tangible.StringFunctions.changeCharacter(i, e, f.charAt(a));
			if (f.charAt(a) == ' ' && f.charAt(a + 1) == g.charAt(0))
			{
				for (b = 0;;b++)
				{
					if (g.charAt(b) == '\0')
					{
						for (d = 0;h.charAt(d) != '\0';d++)
						{
							i = tangible.StringFunctions.changeCharacter(i, e + d + 1, h.charAt(d));
						}
						i = tangible.StringFunctions.changeCharacter(i, e + d + 1, ' ');
						e = e + d;
						a = a + b;
						break;
					}

					if (f.charAt(a + b + 1) != g.charAt(b))
					{
						break;
					}
				}
			}
			a++;
			e++;
		}
		System.out.printf("%s",i);
	}












}

