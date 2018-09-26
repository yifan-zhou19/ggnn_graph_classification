package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String n = new String(new char[80]);
		String m = new String(new char[80]);
		n = new Scanner(System.in).nextLine();
		m = new Scanner(System.in).nextLine();
		int x;
		int y;
		int i;
		int k = 0;
		x = n.length();
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				n = tangible.StringFunctions.changeCharacter(n, i, n.charAt(i) + 32);
			}
		}
		for (i = 0;m.charAt(i) != '\0';i++)
		{
			if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z')
			{
				m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) + 32);
			}
		}
		for (i = 0;n.charAt(i) != '\0';i++)
		{
			if (n.charAt(i) == m.charAt(i))
			{
				k++;
			}
			if (n.charAt(i) > m.charAt(i))
			{
				System.out.print(">\n");
				break;
			}
			if (n.charAt(i) < m.charAt(i))
			{
				System.out.print("<\n");
				break;
			}
		}
		if (k == x)
		{
			System.out.print("=\n");
		}


	}
}

