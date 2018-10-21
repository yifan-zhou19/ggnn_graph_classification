package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n = 0;
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			if (a.charAt(i) > 64 && a.charAt(i) < 91)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			if (b.charAt(i) > 64 && b.charAt(i) < 91)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		for (i = 0;a.charAt(i) != '\0' && b.charAt(i) != '\0';i++)
		{
			n = a.charAt(i) - b.charAt(i);
			if (n != 0)
			{
				break;
			}
		}
		if (n == 0)
		{
			System.out.print("=");
		}
		else if (n < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print(">");
		}
		return 0;
	}
}

