package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[80]);
		String b = new String(new char[80]);
		int i;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
			}
			if (b.charAt(i) >= 'A' && b.charAt(i) <= 'Z')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
			}
		}
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				break;
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				break;
			}
			else if (a.charAt(i) == b.charAt(i))
			{
				continue;
			}
		}
		if (i >= a.length())
		{
			System.out.print("=");
		}
	}


}

