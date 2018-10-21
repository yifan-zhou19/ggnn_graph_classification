package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		for (i = 0;i <= 79;i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, 35);
			b = tangible.StringFunctions.changeCharacter(b, i, 35);
		}
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i <= 79;i++)
		{
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;i <= 79;i++)
		{
			if (b.charAt(i) > 64 && b.charAt(i) < 91)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) > 0)
		{
			System.out.print(">\n");
		}
		else
		{
			if (strcmp(a,b) < 0)
			{
				System.out.print("<\n");
			}
			else
			{
				System.out.print("=\n");
			}
		}
	}


}

