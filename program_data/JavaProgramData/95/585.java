package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char i;
		int m;
		int n;
		a = new Scanner(System.in).nextLine();
		m = a.length();
		for (i = 0;i < m;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		b = new Scanner(System.in).nextLine();
		n = b.length();
			for (i = 0;i < n;i++)
			{
				if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
				}
			}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}

	}
}

