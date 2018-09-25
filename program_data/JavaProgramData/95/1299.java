package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		char s = 0;
		char n;
		char i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i <= n - 1;i++)
		{
			if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
			if (a.charAt(i) == b.charAt(i))
			{
				s += 1;
			}
			else if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else
			{
				System.out.print("<");
				break;
			}
		}
		if (s == n)
		{
			System.out.print("=");
		}
		return 0;
	}
}

