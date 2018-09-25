package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x = 0;

		String m = new String(new char[90]);
		String n = new String(new char[90]);
		m = new Scanner(System.in).nextLine();
		n = new Scanner(System.in).nextLine();
		for (i = 0;m.charAt(i) != '\0' && n.charAt(i) != '\0';i++)
		{
		if (m.charAt(i) >= 65 && m.charAt(i) <= 90)
		{
			m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) + 32);
		}
		if (n.charAt(i) >= 65 && n.charAt(i) <= 90)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 32);
		}
			if (m.charAt(i) > n.charAt(i))
			{
				System.out.print(">");
				x = 1;
				break;
			}
			else if (m.charAt(i) < n.charAt(i))
			{
				System.out.print("<");
			x = 1;
			break;
			}
		}
		if (x == 0)
		{
			System.out.print("=");
		}
		return 0;
	}


}

