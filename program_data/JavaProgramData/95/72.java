package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;i <= 99;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		else if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}



}

