package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char c;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = a.length() > b.length()?a.length():b.length();
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' && b.charAt(i) <= 'z' && b.charAt(i) >= 'a')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 32);
			}
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' && b.charAt(i) <= 'Z' && b.charAt(i) >= 'A')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}

		if (strcmp(a,b) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(a,b) == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print("<");
		}


	}
}

