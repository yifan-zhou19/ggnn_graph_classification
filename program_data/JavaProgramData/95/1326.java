package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[85]);
		String b = new String(new char[85]);
		int i = 0;
		int k = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		while (a.charAt(i) != 0 && b.charAt(i) != 0)
		{
			if (a.charAt(i) >= 'a')
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a'+'A');
			}
			if (b.charAt(i) >= 'a')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 'a'+'A');
			}
			if (a.charAt(i) > b.charAt(i))
			{
				System.out.print(">");
				k = 1;
				break;
			}
			if (a.charAt(i) < b.charAt(i))
			{
				System.out.print("<");
				k = 1;
				break;
			}
			i++;
		}
		if (k == 0)
		{
			System.out.print("=");
		}
		return 0;
	}
}

