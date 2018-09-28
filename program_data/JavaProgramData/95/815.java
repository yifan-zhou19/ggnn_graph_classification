package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char g;
		char h;
		int i;
		int n1;
		int n2;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n1 = a.length();
		n2 = b.length();


		for (i = 0;i < n1;i++)
		{
			g = a.charAt(i);
			if (g < 97)
			{
				g = g + 32;
				a = tangible.StringFunctions.changeCharacter(a, i, g);
			}
		}
		for (i = 0;i < n2;i++)
		{
			h = b.charAt(i);
			if (h < 97)
			{
				h = h + 32;
				b = tangible.StringFunctions.changeCharacter(b, i, h);
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(a,b) < 0)
		{
			System.out.print("<");
		}
		else if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
	}

}

