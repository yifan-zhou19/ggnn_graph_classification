package <missing>;

public class GlobalMembers
{
	//****************************************************** 
	//* ? ? ?   ?? ? ? ?                           *
	//* ? ?      ?? ? ?                              *
	//* ? ? ? ??2010 ? 11 ? 24 ?                   * 
	//* ? ?      ?1000010185                            *
	//****************************************************** 
	public static int Main()
	{
		int a;
		int b;
		int dec = 0;
		int l;
		int k = 1;
		int j = 0;
		String n = new String(new char[32]);
		String nb = new String(new char[32]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n.length();
		for (int i = l - 1; i >= 0; i--)
		{
			if (n.charAt(i) >= '0' && n.charAt(i) <= '9')
			{
				dec += (n.charAt(i) - '0') * k;
			}
			if (n.charAt(i) >= 'a' && n.charAt(i) <= 'z')
			{
				dec += (n.charAt(i) - 'a' + 10) * k;
			}
			if (n.charAt(i) >= 'A' && n.charAt(i) <= 'Z')
			{
				dec += (n.charAt(i) - 'A' + 10) * k;
			}
			k *= a;
		}
		do
		{
			if (dec % b <= 9)
			{
				nb = tangible.StringFunctions.changeCharacter(nb, j++, dec % b + '0');
			}
			else
			{
				nb = tangible.StringFunctions.changeCharacter(nb, j++, dec % b - 10 + 'A');
			}
			dec /= b;
		} while (dec != 0);
		for (int i = j - 1; i >= 0; i--)
		{
			System.out.print(nb.charAt(i));
		}
		return 0;
	}

}

