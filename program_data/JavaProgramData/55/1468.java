package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i = 0;
		int k = 0;
		int len;
		String n = new String(new char[100]);
		String m = new String(new char[100]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		len = m.length();
		for (i = 0;m.charAt(i) != '\0';i++)
		{
			k *= a;
			if (m.charAt(i) >= 'a' && m.charAt(i) <= 'z')
			{
				k += m.charAt(i) - 'a' + 10;
			}
			else if (m.charAt(i) >= 'A' && m.charAt(i) <= 'Z')
			{
				k += m.charAt(i) - 'A' + 10;
			}
			else if (m.charAt(i) >= '0' && m.charAt(i) <= '9')
			{
				k += m.charAt(i) - '0';
			}
		}
		i = 0;
		n = tangible.StringFunctions.changeCharacter(n, 0, '0');
		n = tangible.StringFunctions.changeCharacter(n, 1, '\0');
		while (k != 0)
		{
			if (k % b <= 9)
			{
				n = tangible.StringFunctions.changeCharacter(n, i++, '0' + k % b);
				k = k / b;
			}
			else
			{
				n = tangible.StringFunctions.changeCharacter(n, i++, 'A' + k % b - 10);
				k = k / b;
			}
		}
		if (i != 0)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, '\0');
		}
		len = n.length();
		for (i = len - 1;i >= 0;i--)
		{
			System.out.print(n.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

