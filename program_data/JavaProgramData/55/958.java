package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int k = 0;
		int l;
		String n = new String(new char[31]);
		String s = new String(new char[31]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n.length();
		for (i = 0;i < l;i++)
		{
			if (n.charAt(i) < 58)
			{
				n.charAt(i) -= 48;
			}
			else if (n.charAt(i) > 96)
			{
				n.charAt(i) -= 87;
			}
			else
			{
				n.charAt(i) -= 55;
			}
			k = k * a + n.charAt(i);
		}
		i = 0;
		if (k == 0)
		{
			System.out.print(k);
		}
		while (k != 0)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, k % b + 48);
			if (s.charAt(i) > 57)
			{
				s.charAt(i) += 7;
			}
			k /= b;
			i++;
		}
		for (;i > 0;i--)
		{
			System.out.print(s.charAt(i - 1));
		}
		  return 0;
	}
}

