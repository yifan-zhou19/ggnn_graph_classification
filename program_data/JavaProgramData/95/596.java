package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int p;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		p = a.length();
		for (i = 0;i <= p - 1;i++)
		{
			if ((a.charAt(i) > 'A' || a.charAt(i) == 'A') && (a.charAt(i) < 'Z' || a.charAt(i) == 'Z'))
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if ((b.charAt(i) > 'A' || b.charAt(i) == 'A') && (b.charAt(i) < 'Z' || b.charAt(i) == 'Z'))
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		for (i = 0;i <= p - 1;i++)
		{
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
		}
		if (i == p)
		{
			System.out.print("=");
		}
	}

}

